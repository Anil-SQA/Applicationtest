package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvertisementHandler {
//we are created separate class to handle the adds.
    public static void closeAd(WebDriver driver) {
/*
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            List<WebElement> closeBtn =
                    driver.findElements(By.id("dismiss-button"));

            if (!closeBtn.isEmpty()) {

                wait.until(ExpectedConditions.elementToBeClickable(By.id("dismiss-button")));

                closeBtn.get(0).click();

                System.out.println("Advertisement closed.");
            }

        } catch (Exception e) {

            System.out.println("Advertisement not found.");

        } */
        
    	    try {
    	        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
    	        for (WebElement frame : iframes) {
    	            driver.switchTo().frame(frame);
    	            List<WebElement> closeBtn = driver.findElements(By.id("dismiss-button"));
    	            if (!closeBtn.isEmpty()) {
    	                closeBtn.get(0).click();
    	                System.out.println("Ad closed inside iframe.");
    	                driver.switchTo().defaultContent();
    	                return;
    	            }
    	            driver.switchTo().defaultContent();
    	        }
    	    } catch (Exception e) {
    	        System.out.println("Advertisement not found.");
    	        driver.switchTo().defaultContent(); // always reset context
    	    }
    }
    	    

	public static void closeVignetteAd(WebDriver driver) {
	    try {
	        if (driver.getCurrentUrl().contains("google_vignette")) {
	            String cleanUrl = driver.getCurrentUrl().replace("#google_vignette", "");
	            driver.navigate().to(cleanUrl);
	            System.out.println("Navigated away from vignette ad.");
	        }
	    } catch (Exception e) {
	        System.out.println("Vignette handling failed: " + e.getMessage());
	    }
	}

 }

