package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
	
	@Test
	public void Test1() {
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("I am inside Test2");
		

		String projectpath = System.getProperty("user.dir");
		
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.msn.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("Automation step by step");
		
		driver.close();
	}
	
	@Test
	public void Test3() {
		System.out.println("I am inside Test3");
		throw new SkipException("this test is skipped");
	}
}
 