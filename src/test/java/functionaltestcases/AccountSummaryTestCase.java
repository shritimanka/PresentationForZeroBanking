package functionaltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;



public class AccountSummaryTestCase extends Startup {
	LoginTestCase login = new LoginTestCase();
	
	@Test
	public void showAcc() throws InterruptedException {
		test.log(LogStatus.INFO, "logging the website");
		login.login();
		// System.out.println( driver.getTitle());
		test.log(LogStatus.INFO, "Account summary Test started");
		for (int i=1;i<6;i++) {
		Startup.asp.clickacbtn();
		Startup.asp.Accountdetails(i);
		}
		Thread.sleep(1000);
		Startup.expectedTitle=Startup.asp.accid;
		Startup.actualTitle=Startup.asp.accname;
		Assert.assertEquals(Startup.actualTitle, Startup.expectedTitle);
		test.log(LogStatus.INFO, "Account summary Test ended");
		Startup.tearDown();
	}

}
