package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtils;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[normalize-space()='All Products']")
	WebElement allProducts;

	// @FindBy(xpath="//ul/li[a[@href=\"/product_details/1\"]][contains(.,'View
	// Product')]")
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement viewProductlnk;

	@FindBy(xpath = "//h2[normalize-space()='Blue Top']")
	WebElement productName;

	@FindBy(xpath = "//div[@class='product-details']//p[1]")
	WebElement category;

	@FindBy(xpath = "//span[normalize-space()='Rs. 500']")
	WebElement price;

	@FindBy(xpath = "//div[@class='product-details']//p[2]")
	WebElement availability;

	@FindBy(xpath = "//body//section//p[3]")
	WebElement condition;

	@FindBy(xpath = "//body//section//p[4]")
	WebElement brand;

	@FindBy(id = "search_product")
	WebElement searchProductbar;

	@FindBy(id = "submit_search")
	WebElement searchSubmitbtn;

	@FindBy(xpath = "//h2[normalize-space()='Searched Products']")
	WebElement headingSearchprod;

	@FindBy(xpath = "//div[@class='productinfo text-center']/p")
	List<WebElement> searchedProductslist;

	public boolean allProducts() {
		return WaitUtils.waitForVisibility(driver, allProducts).isDisplayed();
	}

	public void lnkViewProduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling the Webpage.
		js.executeScript("window.scrollBy(575,600)");
		WaitUtils.waitForClickable(driver, viewProductlnk).click();
	}

	public boolean getProductName() {
		return productName.isDisplayed();
	}

	public boolean getCategory() {
		return category.isDisplayed();
	}

	public boolean getPrice() {
		return price.isDisplayed();
	}

	public boolean getAvailability() {
		return availability.isDisplayed();
	}

	public boolean getCondition() {
		return condition.isDisplayed();
	}

	public boolean getBrand() {
		return brand.isDisplayed();
	}

	public void searchinputbar(String prodName) {
		WaitUtils.waitForVisibility(driver, searchProductbar).sendKeys(prodName);

	}

	public String getEnteredProductName() {
		return searchProductbar.getAttribute("value");
	}

	public void clickSearchbtn() {
		searchSubmitbtn.click();
	}

	public String titleSearchProducts() {
		return headingSearchprod.getText();
	}

	public boolean verifyRelatedProducts() {
		String searchText = getEnteredProductName();

		for (WebElement product : searchedProductslist) {

			if (!product.getText().toLowerCase().contains(searchText.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

}
