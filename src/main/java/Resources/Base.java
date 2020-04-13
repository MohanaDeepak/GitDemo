package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;

	public WebDriver initializeBrowser() throws IOException
	{
		//if I pass all the TC's shud run in chrome mean it shd run in chrome if firefox mean i shd rn in firefox
		//So we are passing the browser information 
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\EndtoEndProject\\src\\main\\java\\Resources\\DataProperties");
		prop.load(fis); //fis is an argument and it have the knowledge of the data properties
		String browser=prop.getProperty("browser"); //getProperty pull out the value of the browser
		
		if(browser.equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", browser);
			driver=new ChromeDriver();
			
		}
		else if(browser=="firefox")
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
}
