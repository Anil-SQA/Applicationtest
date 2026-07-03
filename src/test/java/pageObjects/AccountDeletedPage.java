package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends BasePage {

	public AccountDeletedPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement actDeletedhead;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtn;
	
	public boolean actDeleted() {
		return actDeletedhead.isDisplayed();
	}
	
	public void clickContinue() {
		continuebtn.click();
	}
	
}
