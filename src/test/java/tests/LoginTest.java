package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LogoutPage;

public class LoginTest extends BaseTest{
  	
  @Test(priority=1)
  public void validateLogin() {
	  	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.dologin();  
	  	  
  }
  
  @Test(priority=2)
  public void validateLogout() {
	 
	  LogoutPage logoutpage = new LogoutPage(driver);
	  logoutpage.doLogout();
	  
  }
}
