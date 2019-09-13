package FailedTestsRerunTechnique;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalizer implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 5;
	 
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}

