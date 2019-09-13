package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}
	
	public static void test() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\SeleniumFramework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\FileUploadScript");
		Thread.sleep(3000);
		

		driver.close();
		driver.quit();
	}

}
