package myPageObjects;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
	   
	System.out.print("test executed is"+result.getName());
		
	  }
	
	
	
	 public void onTestSuccess(ITestResult result) {
		    
		 System.out.print("test passed is"+result.getName());

		    
		  }
	 
	 
	 public void onTestFailure(ITestResult result) {
		 
		 
		 System.out.print("test failed  is"+result.getName());
		    // not implemented
		  }

}
