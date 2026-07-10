package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.TestCasesPage;
import testBase.BaseClasstest;
import utilities.AdvertisementHandler;

public class TestCasesPageTest extends BaseClasstest{
	@Test
	public void verifyTestCases() {
		
		HomePage hp = new HomePage(driver);
		AdvertisementHandler.closeVignetteAd(driver);
		Assert.assertTrue(hp.home());
		hp.clickTestCases();
		TestCasesPage tc=new TestCasesPage(driver);
		Assert.assertEquals(tc.testcasesTitle(), "TEST CASES");
		
	}

}
