package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement lnkProducts;
	
	@FindBy(xpath="//h2[normalize-space()='Subscription']")
	WebElement titleSubscription;
	
	@FindBy(id="susbscribe_email")
	WebElement subEmailField;
	
	@FindBy(id="subscribe")
	WebElement clickSubbtn;
	
	@FindBy(xpath="//div[@class='alert-success alert']")
	WebElement successAlertmsg;
	
	@FindBy(xpath="//ul[1]/li[3]/a[1][normalize-space()='Cart']")
	WebElement cartlnk;
	
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
	
	public void clickProducts() {
		lnkProducts.click();
	}
	
	public String titleSubscription() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling the Webpage.
		js.executeScript("window.scrollBy(575,9000)");
		return WaitUtils.waitForVisibility(driver, titleSubscription).getText();
		
	}
	
	public void txtSubEmail(String semail) {
		subEmailField.sendKeys(semail);
	}
	
	public void clickSubscription() {
		clickSubbtn.click();
	}
	
	public String checkSuccessmsg() {
		return WaitUtils.waitForVisibility(driver, successAlertmsg).getText();
		
	}
	
	public void clickCart() {
		cartlnk.click();
	}
	
	
	
	

}
