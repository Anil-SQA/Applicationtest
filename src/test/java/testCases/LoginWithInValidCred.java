package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import testBase.BaseClasstest;

public class LoginWithInValidCred extends BaseClasstest {
	@Test
	public void verifyInvalidLogintest() {
	try {
		logger.info("On the HomePage");
	HomePage hp = new HomePage(driver);
		hp.home();
		hp.clickSignuplogin();
		
		logger.info("On the Signup/LoginPage");
		SignupPage lp = new SignupPage(driver);
		lp.loginHead();
		lp.enterLoginemail("QAtesting.1@gmail.com");
		lp.enterLoginpwd("1234");
		lp.clickLoginbtn();
		System.out.println(lp.validationMsg());
	Assert.assertEquals(lp.validationMsg(), "Your email or password is incorrect!");
		
		logger.info("Test Passed");
			
		}catch (Exception e) {

	        logger.error("Test Failed", e);

	        Assert.fail("Test Failed due to exception: " + e.getMessage());

	    }
		

}

}
