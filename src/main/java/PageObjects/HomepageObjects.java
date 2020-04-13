package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageObjects {

	public WebDriver driver;
	
	public HomepageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchbar=By.xpath("\"//input[@id='srchword']\"");
    By click=By.xpath("//input[@aria-label='Search']");

public WebElement search()
{
	return driver.findElement(searchbar);
	
}
public WebElement enter()
{
	return driver.findElement(click);
}

}
