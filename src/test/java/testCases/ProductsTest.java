package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClasstest;
import utilities.AdvertisementHandler;

public class ProductsTest extends BaseClasstest{
	
	@Test
	public void verifyProducts() {
		try {
		logger.info("Test Started");
		HomePage hp = new HomePage(driver);
		logger.info("Homepage");
		hp.home();
		logger.info("Clicked Products link in the home page");
		hp.clickProducts();
		AdvertisementHandler.closeVignetteAd(driver);
		ProductsPage prod=new ProductsPage(driver);
		logger.info("Showing all products page");
		prod.allProducts();
		logger.info("Clicked on 1st product on the products page");
		prod.lnkViewProduct();
		logger.info("ProductsDetails page");
		String prodDetailsPage = driver.getCurrentUrl();
		Assert.assertEquals(prodDetailsPage, "https://automationexercise.com/product_details/1");
		AdvertisementHandler.closeVignetteAd(driver);
		logger.info("1st product info");
		prod.getProductName();
		prod.getCategory();
		prod.getPrice();
		prod.getAvailability();
		prod.getCondition();
		prod.getBrand();
		logger.info("Test Pass");
	}catch (Exception e) {
		logger.error("Test Failed", e);
        Assert.fail("Test Failed due to exception: " + e.getMessage());
    }	
 }

}
