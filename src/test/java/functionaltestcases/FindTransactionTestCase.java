package functionaltestcases;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class FindTransactionTestCase extends Startup {
	LoginTestCase login = new LoginTestCase();
	
	@Test
	public void Findtr() throws InterruptedException {
		test.log(LogStatus.INFO, "Find transaction Test started");
		login.login();
		ft.clicfindtrbtn();
		ft.findtransaction("ONLINE TRANSFER REF","2012-01-01", "2013-11-30", 100, 5000, 1);
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Find transaction Test ended");
		Startup.tearDown();
	}

}
