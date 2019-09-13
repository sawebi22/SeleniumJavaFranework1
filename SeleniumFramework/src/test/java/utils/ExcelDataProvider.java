package utils;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import Test.Test1_GoogleSearch;

public class ExcelDataProvider {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() 
	{
		
		String projectpath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	
	@Test(dataProvider = "test1data")
	public void Test1(String username, String password) throws InterruptedException {
		System.out.println(username+"  |  "+password);
		
		driver.get("https://www.orangehrm.com/contact-us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("firstname")).sendKeys(username);
		driver.findElement(By.name("lastname")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\user\\Desktop\\SeleniumFramework\\Excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getcolCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+"  |  ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
	return data;
	}
}