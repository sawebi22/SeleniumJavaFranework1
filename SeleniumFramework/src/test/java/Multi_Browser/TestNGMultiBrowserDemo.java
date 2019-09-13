package Multi_Browser;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is : "+browserName);
		System.out.println("Thread ID :"+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",projectpath+"\\Drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
				
		}
		else if(browserName.equalsIgnoreCase("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver",projectpath+"\\Drivers\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}
