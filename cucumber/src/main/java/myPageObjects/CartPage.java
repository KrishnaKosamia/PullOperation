package myPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//div[text()='Masala Dosa']")
	WebElement MasalaDosa;
	
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public boolean isMasalaDisplayed() {
		
		return MasalaDosa.isDisplayed();
	}
	

}
