package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
	public void waitElement(WebDriver driver,int waitingTimeInSecond,WebElement locator) {
		
		WebDriverWait wait= new WebDriverWait(driver,waitingTimeInSecond);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
}
