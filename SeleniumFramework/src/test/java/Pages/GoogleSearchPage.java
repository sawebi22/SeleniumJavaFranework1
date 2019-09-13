package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GoogleSearchPage
{
	private static WebElement element = null;
	
public static WebElement searchbox(WebDriver driver) 
{
    element = driver.findElement(By.name("q"));
	return element;
}
public static WebElement submitbutton(WebDriver driver)
{ 
element = driver.findElement(By.className("gNO89b"));
return element;
}
	
}

