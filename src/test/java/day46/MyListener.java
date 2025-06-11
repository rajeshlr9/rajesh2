package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyListener implements ITestListener

{

	
	public void onTestStart(ITestResult result) {
		System.out.println("This is onTestStart");
	// this will execute before every test method
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is onTestSuccess");
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("This is onTestFailure");
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is onTestSkipped");
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("This is onTestFailedButWithinSuccessPercentage");	
	}


	public void onStart(ITestContext context) {
		System.out.println("This is onStart");
		// this will execute only once before tests start
	}


	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish");
	}
 
	
	
	
	
	
	
}
