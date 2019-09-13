package listeners;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
		public void onTestStart(ITestResult result) {
			System.out.println("******Test Started : "+result.getName());
}
		public void onTestSuccess(ITestResult result) {
			System.out.println("******Test is Successful : "+result.getName());
		}
		
		public void onTestFailure(ITestResult result) {
			System.out.println("******Test Failed : "+result.getName());
		}
		
		public void onTestSkipped(ITestResult result) {
			System.out.println("******Test Skipped : "+result.getName());
		}
		
		public void onTestFailedButWithSuccessPercentage(ITestResult result) {
			
		}
		
		public void onStart(ITestContext context) {
			
		}
		
		public void onFinish(ITestContext context, ITestContext result) {
			System.out.println("******Tests Completed : "+context.getName());
		}
}
