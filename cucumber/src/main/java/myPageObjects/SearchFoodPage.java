package myPageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.ConnonMethods;

public class SearchFoodPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/search']")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@placeholder='Search for restaurants and food']")
	WebElement searchTetFeild;
	
	
	@FindBy(xpath="//div[text()='ADD']")
	WebElement addButton;

	@FindBy(xpath="//span[text()='Add Item']")
	WebElement AddITEM;
	
	@FindBy(xpath="//a[@href='/checkout']")
	WebElement checkOut;
	
	
	public void seaarchForFood() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		
		searchBar.click();
		searchTetFeild.sendKeys(ConnonMethods.getDataFromExcel(1, 1)+Keys.ENTER);
	}
	
	
	public SearchFoodPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public WebElement getSearchElement() throws InterruptedException {
		
		Thread.sleep(9000);
		
		
		
		return searchBar;
	}
	
	public void ClickOnAddButton() throws InterruptedException {
		
		Thread.sleep(5000);
		
		addButton.click();
		Thread.sleep(3000);

	
}
	
	
	public void clickOnAddItem() {
		
		AddITEM.click();
	}
	
	
	public void clickOnCheckout() throws InterruptedException {
		
		Thread.sleep(3000);
		checkOut.click();
	}
	
	
	
	
}	
