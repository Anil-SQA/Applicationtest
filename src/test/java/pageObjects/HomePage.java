package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtils;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement lnkSignuplgn;
	
	//Its dynamic element use from parent.
	@FindBy(xpath="//header[@id='header']//a[i[contains(@class,'fa-user')]]")
	WebElement loggedinuser;
	
	@FindBy(xpath="//li[5]//a[1]")
	WebElement deleteact;
	
	
	public void clickSignuplogin() {
		lnkSignuplgn.click();
	}
	
	//Due to ads we will use the wait method to element visible.
	public boolean loginUsername() {
	 	return WaitUtils.waitForVisibility(driver,loggedinuser).isDisplayed();
	}
	
	public void deleteAct() {
		deleteact.click();
	}
	
	

}
