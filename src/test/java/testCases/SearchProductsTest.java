package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClasstest;

public class SearchProductsTest extends BaseClasstest{
	@Test
	public void verifySearchProducts() {
		try {
		logger.info("Test Started");
		HomePage hp = new HomePage(driver);
		logger.info("Home Page");
		Assert.assertTrue(hp.home());
		hp.clickProducts();
		logger.info("Products Page");
		ProductsPage prod = new ProductsPage(driver);
		logger.info("All Products with Searchbar");
		prod.allProducts();
		prod.searchinputbar("Top");
		prod.clickSearchbtn();
		logger.info("Product searched and shows result");
		String titlesearch =prod.titleSearchProducts();
		Assert.assertEquals(titlesearch, "SEARCHED PRODUCTS");
		prod.verifyRelatedProducts();
		
		logger.info("Test passed");
		}catch (Exception e) {
			logger.error("Test Failed", e);
	        Assert.fail("Test Failed due to exception: " + e.getMessage());
	    }	
	}
		
}

