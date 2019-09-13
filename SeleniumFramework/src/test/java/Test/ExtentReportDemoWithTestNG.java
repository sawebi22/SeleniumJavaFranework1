package Test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG 
	{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extentReports;
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
	 htmlReporter = new ExtentHtmlReporter("extent.html");
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
	}
	    @BeforeTest
		public void setUpTest() 
		{
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	
	@Test
	public void test1() throws Exception 
	{
		
		ExtentTest test = extentReports.createTest("Google Search Test one");
		 driver.get("https://google.com");
		 test.pass("Navigated to Google.com");
		 
		  test.log(Status.INFO, "This step shows usage of log(status, details)");
	        test.info("This step shows usage of info(details)");
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        test.addScreenCaptureFromPath("screenshot.png");
	        
	}
	@Test
	public void test2() throws Exception 
	{
		ExtentTest test = extentReports.createTest("Google Search Test one");
		  test.log(Status.INFO, "This step shows usage of log(status, details)");
	        test.info("This step shows usage of info(details)");
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        test.addScreenCaptureFromPath("screenshot.png");
	        
	}
	@AfterTest
	public void TearDownTest() 
	{

		driver.close();
		driver.quit();
		System.out.println("Test run completed successfully");
		
	}

	@AfterSuite
	public void tearDown() 
	{
		extentReports.flush();
	}
	}
