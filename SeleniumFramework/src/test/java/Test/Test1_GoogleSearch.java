package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;

public class Test1_GoogleSearch 
{
	WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest() 
	{
		
		String projectpath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectpath+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void googlesearch2() throws InterruptedException 
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
