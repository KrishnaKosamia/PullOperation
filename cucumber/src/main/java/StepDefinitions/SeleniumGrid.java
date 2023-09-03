package StepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	
	
	
	
	@Test
	public void runGrid() throws MalformedURLException {
		
		//http://192.168.4.26:4444/
		

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.MAC);
		dc.setBrowserName("firefox");
		URL url = new URL("http://192.168.4.26:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.google.com");
		driver.close();
		
	}

}
