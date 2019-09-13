package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import Pages.GoogleSearchPage;

public class GoogleSearchTest 
{
	 
private static WebDriver driver = null;
	
public static void main(String[] args) throws InterruptedException
{
	googlesearch();
} 
	
	public static void googlesearch() throws InterruptedException 
{
		String projectpath = System.getProperty("user.dir");
		
		System.out.println("projectpath : "+projectpath);
		
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//river.findElement(By.name("q")).sendKeys("automation step by step");
		
		GoogleSearchPage.searchbox(driver).sendKeys("Automation Step by Step");
		//driver.findElement(By.className("gNO89b")).click();
		GoogleSearchPage.submitbutton(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test run completed successfully");
}
}
