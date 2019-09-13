package HeadlessBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/SeleniumFramework/Drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1600,900");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.className("gNO89b")).click();
		
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}

}
