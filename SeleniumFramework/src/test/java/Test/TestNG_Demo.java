package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo 
{
public static void main(String[] args) throws InterruptedException
{
	googlesearch();
}

	public static void googlesearch() throws InterruptedException 
{
		String projectpath = System.getProperty("user.dir");
		
		System.out.println("projectpath : "+projectpath);
		
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.className("gNO89b")).click();
		
		
		
		driver.close();
		driver.quit();
		System.out.println("Test run completed successfully");
}
}
