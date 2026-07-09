package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountDeletedPage;
import pageObjects.HomePage;
import pageObjects.SignupPage;
import testBase.BaseClasstest;
import utilities.AdvertisementHandler;

public class LoginWithValidCred extends BaseClasstest {
	@Test
	public void verifyLogintest() {
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
		
		AdvertisementHandler.closeAd(driver);
		AdvertisementHandler.closeVignetteAd(driver);
		
		logger.info("Succesful login and shows user name");
		hp.loginUsername();
		hp.deleteAct();
		
		AdvertisementHandler.closeAd(driver);
		AccountDeletedPage adp = new AccountDeletedPage(driver);
			adp.actDeleted();
			adp.clickContinue();
			
			logger.info("Test Passed");
			
		}catch (Exception e) {

	        logger.error("Test Failed", e);

	        Assert.fail("Test Failed due to exception: " + e.getMessage());

	    }
		

}

}
