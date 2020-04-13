package Automation;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomepageObjects;
import PageObjects.LoginpageObjects;
import Resources.Base;

public class Homepage extends Base {

	@Test
	public void basepagenavigation() throws IOException
	{
		//I need to call initialize browser here by using inheritance
		driver=initializeBrowser();
		driver.get("https://mail.rediff.com");
		HomepageObjects hpo=new HomepageObjects(driver);
		hpo.search().sendKeys("tops");
		hpo.enter().click();
		driver.navigate().back();
		
		LoginpageObjects lpo=new LoginpageObjects(driver);
		lpo.email().sendKeys("mona");
		lpo.pswd().sendKeys("deepak");
		lpo.proceed().click();
	}
}
