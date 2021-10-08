package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LoginPage.Login_Page;
import util.BrowserFactory;

public class LoginTest {
	
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		Login_Page LoginPage=PageFactory.initElements(driver, Login_Page.class);
		
		
		
		LoginPage.enterUserName("opensourcecms");
		LoginPage.enterPassword("opensourcecms");
		LoginPage.ClickSigninButton();
		
	

		LoginPage.ClickCorrectEmail();
		
		
		
	}

}
