package day46;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager
implements ITestListener {

public ExtentSparkReporter sparkReporter;  // UI of the report
public ExtentReports extent; // populate common info on the report , like date , resource name, browser, OS..
public ExtentTest test; // creating test case entries in the report and update status of the test cases

public void onStart(ITestContext context) {
	
	Date now = new Date();
	long time = now.getTime();
	sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/"+time+".html");  // report name and path
	sparkReporter.config().setDocumentTitle("Automation Report"); // title of the report
	sparkReporter.config().setReportName("Functional Testing"); // name of the report
	sparkReporter.config().setTheme(Theme.STANDARD);
	
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Computer Name", "localhost");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Tester Name", "Rajesh");
	extent.setSystemInfo("OS", "Windows10");
	extent.setSystemInfo("Browser Name", "Chrome");
// above info also we can get in runtime
}





	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {

		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.PASS, "Test case PASSED is:"+result.getName()); // update status p/f/s
		

		
		
		
	}

	public void onTestFailure(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:"+result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is:"+result.getThrowable());
		
		// capture and save screenshots
		
		
		
		
	}

	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:"+result.getName());
		
		
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {

extent.flush(); //  this will write all the info on the report. this onFinish is mandatory

	}

	
	
	// display test case ID in the report
	
	
}
