package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;

public class Facebookpage {
	
	WebDriver driver;
	
	@Given("launch facebook")
	public void launch_facebook() {
	    
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		
		
		
		
	}

	@Given("enter credentials")
	public void enter_credentials(io.cucumber.datatable.DataTable dataTable) {
	   
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(dataTable.row(0).get(0));
		
		WebElement findElemen = driver.findElement(By.id("pass"));
		findElemen.sendKeys(dataTable.row(0).get(1));
		
	    
	}

}
