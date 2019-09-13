package Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject 
{
	WebDriver driver = null;
	
 By textbox_search = By.name("q");
 
 By button_searchBy = By.className("gNO89b");
 
 public GoogleSearchPageObject(WebDriver driver) 
 {
 this.driver = driver;
 }
		 
 public void WriteTextInSearchbox(String text)
 {
	 driver.findElement(textbox_search).sendKeys(text);
 }
 public void ClickSearchButton() 
 {
	 driver.findElement(button_searchBy).sendKeys(Keys.ENTER);
 }
}
