package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class Login_Page extends BasePage{
	WebDriver driver;
	
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\'user_login\']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\'user_pass\']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\'wp-submit\']")
	WebElement SIGNIN_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"correct-admin-email\"]")
	WebElement CORRECT_ADMIN_EMAIL_FIELD;
	
	public void enterUserName(String UserName) {
		USERNAME_FIELD.sendKeys(UserName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	
	public void ClickSigninButton() {
		SIGNIN_FIELD.click();
	}
	
	public void ClickCorrectEmail() {
		CORRECT_ADMIN_EMAIL_FIELD.click();
	}
	
}
