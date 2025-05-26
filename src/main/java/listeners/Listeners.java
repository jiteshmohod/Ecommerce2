package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;

public class Listeners  implements ITestListener {
	 public void onTestStart(ITestResult result) {
		    // not implemented
		 System.out.println("ITestListner Started");
		  }
}
