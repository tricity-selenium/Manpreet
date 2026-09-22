package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigReader;
import utility.DriverFactory;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException
	{
		  //WebDriverManager.chromedriver().setup();
		  //driver = new ChromeDriver();
		  //driver =  DriverFactory.initDriver("chrome");
		  driver = DriverFactory.initDriver(ConfigReader.readconfig("browser"));
		  driver.manage().window().maximize();
		  //driver.get("https://practicetestautomation.com/practice-test-login/");
		  driver.get(ConfigReader.readconfig("url"));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
