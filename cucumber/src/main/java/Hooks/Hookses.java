package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookses {
	
	
	@Before
	public void f() {
		System.out.print("Beford senarious");
	}
	
	
	@After
	public void g() {
		System.out.print("After senarious");
	}

}
