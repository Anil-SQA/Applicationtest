package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utilities.WaitUtils;

public class AccountDeletedPage extends BasePage {

	public AccountDeletedPage(WebDriver driver) {
		super(driver);
	}
	
	/*@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement actDeletedhead;
	*/
	@FindBy(css="h2[class='title text-center'] b")
	WebElement actDeletedhead;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtn;
	
	public void actDeleted() {
	    WebElement heading = WaitUtils.waitForVisibility(driver, actDeletedhead);
	    Assert.assertTrue(heading.isDisplayed());
		
	}
	
	public void clickContinue() {
		continuebtn.click();
	}
	
}
