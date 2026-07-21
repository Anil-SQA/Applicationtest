package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClasstest;
import utilities.AdvertisementHandler;

public class SubscriptionHomePageTest extends BaseClasstest{
	@Test
	public void verify_Subscription() {
		try {
			logger.info("Test Started");
		HomePage hp = new HomePage(driver);
		logger.info("HomePage");
		Assert.assertTrue(hp.home());
		logger.info("Subscription");
		String subTitle = hp.titleSubscription();
		Assert.assertEquals(subTitle, "SUBSCRIPTION");
		AdvertisementHandler.closeVignetteAd(driver);
		hp.txtSubEmail("test@gmail.com");
		hp.clickSubscription();
		logger.info("SuccessMsg");
		String successMsg =  hp.checkSuccessmsg();
		Assert.assertEquals(successMsg, "You have been successfully subscribed!");
		
		logger.info("Test Pass");
		}catch (Exception e) {
		logger.info("Test Failed", e);
		 Assert.fail("Test Failed due to exception: " + e.getMessage());
		}
	}	

}
