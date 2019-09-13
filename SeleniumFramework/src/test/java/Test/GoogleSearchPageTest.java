package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObject;

public class GoogleSearchPageTest 
{
	private static WebDriver driver = null;
	
public static void main(String[] args) 
{
	googleSearchTest();
}

public static void googleSearchTest() 
{
	String projectpath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    
    GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);
    
    driver.get("https://google.com");
    
    searchPageObject.WriteTextInSearchbox("UFC Latest Fight");
    searchPageObject.ClickSearchButton();
    
    driver.close();
    
}
}
