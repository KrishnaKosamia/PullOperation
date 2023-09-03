package myPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='search']")
	WebElement searchbutton;
	
	
	
	public SwiggyHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void searchForDosa() {
		
		searchbutton.click();
		
	}
	
	

}
