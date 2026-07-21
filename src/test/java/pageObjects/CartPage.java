package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtils;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//li[@class='active']")
	WebElement shoppingCart;
	
	@FindBy(xpath="//h2[normalize-space()='Subscription']")
	WebElement titleSubscription;
	
	@FindBy(id="susbscribe_email")
	WebElement subEmailField;
	
	@FindBy(id="subscribe")
	WebElement clickSubbtn;
	
	@FindBy(xpath="//div[@class='alert-success alert']")
	WebElement successAlertmsg;
	
	public boolean titleShoppingcart() {
		return shoppingCart.isDisplayed();
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
	

}
