package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageObjects {

	public WebDriver driver;
	public LoginpageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@name='login']");
	By password=By.xpath("//input[@name='passwd']");
	By go=By.xpath("//input[@name='proceed']");
	
	public WebElement email()
	{
		return driver.findElement(username);
	}
	public WebElement pswd()
	{
		return driver.findElement(password);
	}
	public WebElement proceed() {
		
		return driver.findElement(go);
	}
}
