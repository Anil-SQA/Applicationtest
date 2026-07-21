package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import testBase.BaseClasstest;

public class SubscriptionCartTest extends BaseClasstest{
	@Test
	public void verify_CartSubscription() {
		try {
		logger.info("Test Started");
		HomePage hp = new HomePage(driver);
		hp.home();
		hp.clickCart();
		
		CartPage cart = new CartPage(driver);
		cart.titleShoppingcart();
		cart.titleSubscription();
		cart.txtSubEmail("test@gmail.com");
		cart.clickSubscription();
		cart.checkSuccessmsg();
		logger.info("Test Passed");
		}catch (Exception e) {
			logger.error("Test Failed", e);
	        Assert.fail("Test Failed due to exception: " + e.getMessage());
		}
		
	}

}
