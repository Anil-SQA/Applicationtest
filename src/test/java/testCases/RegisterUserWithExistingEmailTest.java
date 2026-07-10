package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import testBase.BaseClasstest;

public class RegisterUserWithExistingEmailTest extends BaseClasstest{
	@Test
	public void verifyExistingRegisterEmail() {
		
		try {
			logger.info("On the HomePage");
		HomePage hp = new HomePage(driver);
			hp.home();
			hp.clickSignuplogin();
			
			logger.info("On the Signup/LoginPage");
			SignupPage lp = new SignupPage(driver);
			lp.headingCheck();
			lp.regNametxt("Tester");
			lp.regEmailtxt("QAtesting.1@gmail.com");
			lp.signupBtn();
			
			String emailRegtext = lp.validateEmail();
			
			Assert.assertEquals(emailRegtext, "Email Address already exist!");
			System.out.println("Email is already registered");
			
			logger.info("Test Passed");
			
		}catch(Exception e) {
			logger.error("Test Failed", e);

	        Assert.fail("Test Failed due to exception: " + e.getMessage());
		}
			
	}
}
