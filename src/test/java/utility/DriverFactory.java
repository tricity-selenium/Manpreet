package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static WebDriver initDriver(String browsername) 
	{
		if(browsername.equals("chrome"))
		{
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		}
		
		if(browsername.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		if(browsername.equals("safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		  
		return driver;  
		
	}
	
	

}
