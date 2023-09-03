package myPageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyLocationPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter your delivery location']")
	WebElement location;
	
	











	public void setLocation(String locationname) throws InterruptedException {
		
		
	
		location.sendKeys(locationname);
		
		Thread.sleep(3000);
		location.sendKeys(Keys.ARROW_DOWN);
		location.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	public SwiggyLocationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

}
