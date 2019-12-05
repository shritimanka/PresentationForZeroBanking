package functionaltestcases;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class TransferFundTestCase extends Startup {
	
	LoginTestCase login = new LoginTestCase();
	
	   @Test
	   public void transferfunds()  {
	       login.login();
	       test.log(LogStatus.INFO, "Transfer fund Test started");
		   tf.clicktfbtn();
				tf.Transferfund(1, 2, 100, "Checking", 1);
					
				expectedTitle ="You successfully submitted your transaction.";
				
				//actualTitle= (tf.altmsg.getText());
				
				
				//Assert.assertEquals(actualTitle,expectedTitle);
				test.log(LogStatus.INFO, "Transfer fund Test ended");
				Startup.tearDown();
	     }

}
