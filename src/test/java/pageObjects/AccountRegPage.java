package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegPage extends BasePage{

	public AccountRegPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	WebElement InfoHeading;
	
	@FindBy(id="id_gender1")
	WebElement Radiotitle;
	
	@FindBy(id="password")
	WebElement RegPwdfield;
	
	// Day dropdown
    @FindBy(id = "days")
    WebElement dayDropdown;

    // Month dropdown
    @FindBy(id = "months")
    WebElement monthDropdown;

    // Year dropdown
    @FindBy(id = "years")
    WebElement yearDropdown;

    @FindBy(id="newsletter")
    WebElement checkbox1;
    
    @FindBy(id="optin")
    WebElement checkbox2;
    
    @FindBy(xpath="//input[@id='first_name']")
    WebElement firstname;
    
    @FindBy(css="#last_name")
    WebElement lastname;
    
    @FindBy(id="company")
    WebElement companyname;
    
    @FindBy(id="address1")
    WebElement add1;
    
    @FindBy(id="address2")
    WebElement add2;
    
    @FindBy(xpath="//input[@id='state']")
    WebElement state;
    
    @FindBy(xpath="//input[@id='city']")
    WebElement city;
    
    @FindBy(xpath="//input[@id='zipcode']")
    WebElement zipcode;
    
    @FindBy(xpath="//input[@id='mobile_number']")
    WebElement mobileNo;
    
    @FindBy(xpath="//button[normalize-space()='Create Account']")
    WebElement createbtn;
    
    
    public boolean infoHead() {
    	return InfoHeading.isDisplayed();
    }
    
    public void selectTitle() {
    	Radiotitle.click();
    }
    
    public void password(String pwd) {
    	RegPwdfield.sendKeys(pwd);
    }
    
    public void selectDay(String day) {
        new Select(dayDropdown).selectByVisibleText(day);
    }

    public void selectMonth(String month) {
        new Select(monthDropdown).selectByVisibleText(month);
    }

    public void selectYear(String year) {
        new Select(yearDropdown).selectByVisibleText(year);
    }
    
    public void selectChkbox1() {
    	checkbox1.click();
    }
    
    public void selectChkbox2() {
    	checkbox2.click();
    }
    
    public void enterFirstName(String fname) {
    	firstname.sendKeys(fname);
    }
    
    public void enterLastname(String lname) {
    	lastname.sendKeys(lname);
    }
    
    public void enterCompany(String cname) {
    	companyname.sendKeys(cname);
    }
    
    public void enterAdd1(String address1) {
    	add1.sendKeys(address1);
    }
    
    public void enterAdd2(String address2) {
    	add2.sendKeys(address2);
    }
    
    public void enterState(String sname) {
    	state.sendKeys(sname);
    }
    
    public void enterCity(String cname) {
    	city.sendKeys(cname);
    }
    
    public void enterZip(String zcode) {
    	zipcode.sendKeys(zcode);
    }
    
    public void enterMobileno(String Mobile) {
    	mobileNo.sendKeys(Mobile);
    }
    
    public void createAccountbtn() {
    	createbtn.click();
    }
    
 
    
    
}

