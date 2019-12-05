package functionaltestcases;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class ShowTransactionTestCase extends Startup{
	LoginTestCase login = new LoginTestCase();
	
	@Test
	public void showtr() throws InterruptedException {
		login.login();
		
		test.log(LogStatus.INFO, "Show transaction Test started");
		st.clickbtn();
		for (int i=1;i<6;i++) {
			st.Showtr(i);
			
			}
		test.log(LogStatus.INFO, "show transaction Test ended");
		Startup.tearDown();
	}

}
