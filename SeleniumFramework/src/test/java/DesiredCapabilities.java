import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities {

	public static void main(String[] args)
	{
		String projectpath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver",projectpath+"\\Drivers\\IEDriverServer.exe");
	    
		WebDriver driver = new InternetExplorerDriver();
	    
	    driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		
		driver.close();
		driver.quit();
		
	}

	private void setCapability(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

}
