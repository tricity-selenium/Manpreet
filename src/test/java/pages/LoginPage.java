package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Page WebElements  , Page Method/Action , PageClass Constructor
	//WebELement usernamefield = driver.findElement(By.id("username"));	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="username") 
	WebElement usernamefield;
	
	@FindBy(id="password")
	WebElement passwordfield;	
	
	@FindBy(id="submit")
	WebElement submitbutton;
	
	public void dologin()
	{
		usernamefield.sendKeys("student");
		passwordfield.sendKeys("Password123");
		submitbutton.click();
		
	}
	
}
