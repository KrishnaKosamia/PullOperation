package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import myPageObjects.CartPage;
import myPageObjects.SearchFoodPage;
import myPageObjects.SwiggyLocationPage;

@Listeners(myPageObjects.MyListener.class)

public class SwiggyTest {
	
	
	
	
	
	@Test
	public void f() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get(ConnonMethods.getDataFromExcel(1, 0));
		SwiggyLocationPage location = new SwiggyLocationPage(driver);
		location.setLocation("Banglore");
		SearchFoodPage search = new SearchFoodPage(driver);
		search.getSearchElement();
		search.seaarchForFood();
		search.ClickOnAddButton();
		search.clickOnAddItem();
		search.clickOnCheckout();
		
	
		CartPage cartpage = new CartPage(driver);
		Assert.assertTrue(cartpage.isMasalaDisplayed());
		
		
		
		
	}

}
