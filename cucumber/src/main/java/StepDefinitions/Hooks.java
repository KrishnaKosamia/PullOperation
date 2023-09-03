package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	
	@Before
	public void f() {
		
	  System.out.print(false);
		System.out.print("before sceanrio execution"); 
	}
	
	
	
	
	@After
	public void g() {
		
		 System.out.print(true);
		
		System.out.print("after senario execution"); 
	}
	
	

}
