package listeners;




import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
public static WebDriver driver;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed and  details are "+result.getName());
		
		
			}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase Skipped and  details are "+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase Pass Success and  details are "+result.getName());	
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
