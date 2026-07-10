package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtils;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement lnkHome;
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement lnkSignuplgn;
	
	//Its dynamic element use from parent.
	@FindBy(xpath="//header[@id='header']//a[i[contains(@class,'fa-user')]]")
	WebElement loggedinuser;
	
	@FindBy(xpath="//li[5]//a[1]")
	WebElement deleteact;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//a[normalize-space()='Contact us']")
	WebElement contactUs;
	
	@FindBy(xpath="//a[contains(text(),'Test Cases')]")
	WebElement lnkTestCases;
	
	public boolean home() {
		return WaitUtils.waitForVisibility(driver,lnkHome).isDisplayed();
	}
	
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
	
	public void clickLogout() {
		Logout.click();
	}
	
	public void contactUslnk() {
		contactUs.click();
	}
	
	public void clickTestCases() {
		lnkTestCases.click();
	}
	
	
	
	

}
