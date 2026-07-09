package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountCreatedPage;
import pageObjects.AccountDeletedPage;
import pageObjects.AccountRegPage;
import pageObjects.HomePage;
import pageObjects.SignupPage;
import testBase.BaseClasstest;
import utilities.AdvertisementHandler;

public class AccountRegTest extends BaseClasstest{
	@Test
	public void verify_AccountRegTest() {
		
		try {
		logger.info("Started Application");
	HomePage hp=new HomePage(driver);
		hp.home();
		hp.clickSignuplogin();
	
	logger.info("Singup/Login Page");	
	SignupPage slnp =new SignupPage(driver);
		slnp.headingCheck();
		
		String name = randomString().toUpperCase();
		slnp.regNametxt(name);
		
		String email=randomString()+"@gmail.com";
		slnp.regEmailtxt(email);
		
		slnp.signupBtn();
		
	logger.info("Account creation Page");	
	AccountRegPage arp = new AccountRegPage(driver);
		arp.infoHead();
		arp.selectTitle();
		String pwd = randomAlphanumeric();
		arp.password(pwd);
		
		arp.selectDay("12");
		arp.selectMonth("March");
		arp.selectYear("2000");
		arp.selectChkbox1();
		arp.selectChkbox2();
		
		arp.enterFirstName(name);
		arp.enterLastname(randomString());
		arp.enterCompany(randomString().toUpperCase());
		arp.enterAdd1(randomAlphanumeric());
		arp.enterAdd2(randomString());
		arp.enterState("Karnataka");
		arp.enterCity("Bangalore");
		arp.enterZip("564321");
		arp.enterMobileno(randomNumber());
		arp.createAccountbtn();
		
		//To close the adds	
//		AdvertisementHandler.closeAd(driver);
		
		logger.info("Account created confirmation Page");	
	AccountCreatedPage acp = new AccountCreatedPage(driver);
		acp.acctcreatemsg();
		acp.clickContinue();
		
		AdvertisementHandler.closeAd(driver);
		AdvertisementHandler.closeVignetteAd(driver);
	//After closing the add it will check if its in same page, again it will click continue btn.	
		if (driver.getCurrentUrl().contains("account_created")) {
		    acp.clickContinue();
		}
		
		hp.loginUsername();
		
		logger.info("Delete Account Page");	
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
