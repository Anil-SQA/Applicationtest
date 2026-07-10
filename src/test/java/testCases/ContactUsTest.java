package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import testBase.BaseClasstest;
import utilities.AdvertisementHandler;

public class ContactUsTest extends BaseClasstest {
	@Test
	public void verifyContactus() {
		try {
		logger.info("User on the HomePage");
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.home());
		hp.contactUslnk();
		
		logger.info("User on the ContactUs page");
		ContactUsPage contact = new ContactUsPage(driver);
		contact.checkContactustitle();
		Assert.assertEquals(contact.checkGetinTouchtitle(), "GET IN TOUCH");
		
	//	AdvertisementHandler.closeAd(driver);
		logger.info("User Entering the detials");
		contact.enterName(randomString());
		contact.enterEmail(randomAlphanumeric()+"@gmail.com");
		contact.enterSubject(randomString());
		contact.enterMessage(randomAlphanumeric());
		
		logger.info("User Uploading the file");
		contact.uploadFile("123456.pdf");
	//	AdvertisementHandler.closeAd(driver);
		contact.clickSubmit();
	
		logger.info("User Uploaded the file succesfully and submited");
		contact.acceptAlert();
		
		logger.info("User on the Successpage");
	//	AdvertisementHandler.closeAd(driver);
		Assert.assertEquals(contact.successMsgtext(), "Success! Your details have been submitted successfully.");
		contact.homeBtn();
		AdvertisementHandler.closeVignetteAd(driver);
		logger.info("User on the HomePage");
		Assert.assertTrue(hp.home());
		
		logger.info("Test Passed for Contact Us");
		}catch (Exception e){
			logger.error("Test Failed", e);
	        Assert.fail("Test Failed due to exception: " + e.getMessage());
	    }		
				
	}

}
