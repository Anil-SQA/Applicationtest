package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtils;

public class ContactUsPage extends BasePage {

	public ContactUsPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="(//h2[@class='title text-center'])[1]")
	WebElement titleContactUs;
	
	@FindBy(xpath="//h2[normalize-space()='Get In Touch']")
	WebElement titleGetInTouch;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement txtNamefield;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txtEmailfield;
	
	@FindBy(xpath="//input[@placeholder='Subject']")
	WebElement txtSubfield;
	
	@FindBy(id="message")
	WebElement txtMsgfield;
	
	@FindBy(xpath="//input[@name='upload_file']")
	WebElement chooseFile;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@class='status alert alert-success']")
	WebElement successMsg;
	
	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement btnHome;
	
	public boolean checkContactustitle() {
		return titleContactUs.isDisplayed();
	}
	
	public String checkGetinTouchtitle() {
		return titleGetInTouch.getText();
	}
	
	public void enterName(String name) {
		txtNamefield.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		txtEmailfield.sendKeys(email);
	}
	
	public void enterSubject(String sub) {
		txtSubfield.sendKeys(sub);
	}
	
	public void enterMessage(String msg) {
		txtMsgfield.sendKeys(msg);
	}
	
	public void uploadFile(String fileName) {
	    String filePath = System.getProperty("user.dir") + "\\testData\\" + fileName;
	    chooseFile.sendKeys(filePath);
	}
	
	public void clickSubmit() {
		WaitUtils.waitForClickable(driver,	btnSubmit).click();
	}
	
	public void acceptAlert() {
	    Alert alert = driver.switchTo().alert();
	      alert.accept();
	}
	
	public String successMsgtext() {
		return successMsg.getText();
	}
	
	public void homeBtn() {
		btnHome.click();
	}
	
	

}
