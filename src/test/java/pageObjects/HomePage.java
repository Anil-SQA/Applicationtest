package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement lnkSignuplgn;
	
	@FindBy(xpath="//li[10]//a[1]")
	WebElement loggedinuser;
	
	@FindBy(xpath="//li[5]//a[1]")
	WebElement deleteact;
	
	
	public void clickSignuplogin() {
		lnkSignuplgn.click();
	}
	
	public boolean loginUsername() {
		return loggedinuser.isDisplayed();
	}
	
	public void deleteAct() {
		deleteact.click();
	}
	
	

}
