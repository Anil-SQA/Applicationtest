package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{

	public AccountCreatedPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
    WebElement actcreatedmsg;
    
    @FindBy(xpath="//a[normalize-space()='Continue']")
    WebElement continuebtn;
    
	   public void acctcreatemsg() {
	    	actcreatedmsg.isDisplayed();
	    }
	    
	    public void clickContinue() {
	    	continuebtn.click();
	    }
	    
	    
	    

}
