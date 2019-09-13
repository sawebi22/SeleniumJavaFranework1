import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.InputSource;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class BrowserTest 
{
public static void main(String[] args) throws InterruptedException {
	
	//String projectpath = System.getProperty("user.dir");
	
	//System.out.println("projectpath : "+projectpath);
	
	//System.setProperty("webdriver.gecko.driver",projectpath+"\\Drivers\\geckodriver.exe");
    // WebDriver driver = new FirefoxDriver();
	
	
	//System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
    //WebDriver driver = new ChromeDriver();
	
	

	//System.setProperty("webdriver.ie.driver",projectpath+"\\Drivers\\IEDriverServer.exe");
    //WebDriver driver = new InternetExplorerDriver();
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver = new FirefoxDriver();
	
	//WebDriverManager.iedriver().setup();
	//WebDriver driver = new InternetExplorerDriver();
	
    
	
	driver.get("https://www.msn.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
	
	//WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
	//textbox.sendKeys("huffington post");
	//WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]"));
	//searchbox.click();
	
	//WebElement webpag = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/div[1]/a/h3"));
	//webpag.click();

	
	Thread.sleep(3000l);
	
	
	

	
}
}
