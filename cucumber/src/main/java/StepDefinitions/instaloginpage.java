package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class instaloginpage {
	
	WebDriver driver;
	
	@Given("lunch login page")
	
	
	
	public void lunch_login_page() throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
	    
	}
	
	

	
	
	
	
	
	@When("Enter invalid data")
	public void enter_invalid_data(io.cucumber.datatable.DataTable dataTable) {
	  
		 String firstName = dataTable.row(1).get(0);
		 driver.findElement(By.name("username")).sendKeys(firstName);
		 String password = dataTable.row(1).get(1);
		 driver.findElement(By.name("password")).sendKeys(password);
		
		
	}
@When("Click on login")
 public void click_on_login() {
	driver.findElement(By.xpath("//div[text()='Log in']/..")).click();
	////button[@type='submit']
}

}
