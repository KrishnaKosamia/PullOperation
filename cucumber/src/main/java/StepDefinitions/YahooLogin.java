package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class YahooLogin {
	
	
	 WebDriver driver;
	
	@Given("launch yahoo")
	public void launch_yahoo() {
	
		driver= new FirefoxDriver();
	   driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
	}


	

	

	
	
	@Given("^User Types (.*)")
	public void user_types_name(String username) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement element = driver.findElement(By.id("login-username"));
		  element.click();
		  element.sendKeys(username);
	   
	}
	
	@Given("print title of yahoo homepage")
	public void print_title_of_yahoo_homepage() {
	    
		System.out.println("title is "+driver.getTitle());
	}



}
