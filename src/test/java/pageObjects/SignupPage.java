package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	WebElement Signupheading;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Regnamefield;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement Regemailfield;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement buttonSignup;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement logineamilfield;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement loginpwdfield;
	
	@FindBy(xpath="//button[@data-qa='login-button']")
	WebElement loginbtn;
	
	public boolean headingCheck() {
		return Signupheading.isDisplayed();
	}
	
	public void regNametxt(String rname) {
		Regnamefield.sendKeys(rname);
	}
	
	public void regEmailtxt(String remail) {
		Regemailfield.sendKeys(remail);
	}
	
	public void signupBtn() {
		buttonSignup.click();
	}

	public void enterLoginemail(String remail) {
		logineamilfield.sendKeys(remail);
	}
	
	public void enterLoginpwd(String pwd) {
		loginpwdfield.sendKeys(pwd);
	}
	
	public void clickLoginbtn() {
		loginbtn.click();
	}
	
	
}
