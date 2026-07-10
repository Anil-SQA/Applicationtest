package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage {

	public TestCasesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='Test Cases']")
	WebElement titleTestCase;
	
	public String testcasesTitle() {
		return titleTestCase.getText();
	}

}
