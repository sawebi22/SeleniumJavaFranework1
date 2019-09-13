package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 
{
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() 
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googlesearch() throws InterruptedException 
{
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		
	}
	
	@AfterTest
	public void TearDownTest() 
	{

		driver.close();
		driver.quit();
		System.out.println("Test run completed successfully");
	}
}
