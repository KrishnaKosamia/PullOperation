package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage {

	WebDriver driver;

@Given("lauch the browser")
public void lauch_the_browser() {
    
	driver = new FirefoxDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	
}



@Given("enter crdentials")
public void enter_crdentials() {
    driver.findElement(By.id("login1")).sendKeys("krishnakosamia@gmail.com");
    driver.findElement(By.id("password")).sendKeys("67890@jyggjhgjh");
    
    
    
    
}  

@When("click on login")
public void click_on_login() {
   
	driver.findElement(By.xpath("//input[@title='Sign in']")).click();
}

}
