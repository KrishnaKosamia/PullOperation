package StepDefinitions;


import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@Listeners(myPageObjects.MyListener.class)


@CucumberOptions(
	
		features="src/test/resources/Features",
		glue="StepDefinitions",
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber:json"},
		tags="@yahootitle"
		
		

		
		
		)





public class TestRunner {
	
	

}
