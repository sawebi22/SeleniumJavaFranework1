package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo 
{
	private static WebDriver driver = null;
	
public static void main(String[] args) 
{
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	
	ExtentReports extentReports = new ExtentReports();
	extentReports.attachReporter(htmlReporter);
	
	ExtentTest test1 = extentReports.createTest("Google Search Test one");


	
	String projectpath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    
    test1.log(Status.INFO, "starting test case");

    
    driver.get("https://google.com");
    test1.pass("Navigated to Google.com");
    
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.name("q")).sendKeys("automation step by step");
	test1.pass("Entered text in search box");
	
	driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	test1.pass("Pressed keyboard Enter Key");
	
	
	driver.close();
	driver.quit();
	test1.pass("Closed Browser");
	test1.info("Test Completed");
	
	extentReports.flush();
    
    
}

}
