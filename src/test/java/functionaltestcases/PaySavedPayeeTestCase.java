package functionaltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class PaySavedPayeeTestCase extends Startup {
	LoginTestCase login = new LoginTestCase();
	
	 @Test
     public void PayPayee() throws InterruptedException {
    	    
		 test.log(LogStatus.INFO, "Pay saved payee Test started");
		    login.login();
			pp.clickpaybill();
			pp.payspayee(0, 0, 100, "2019-11-14", "Checking");
				 
			expectedTitle ="The payment was successfully submitted.";
			actualTitle= (pp.alertmsg.getText());
						
			Assert.assertEquals(actualTitle, expectedTitle.trim());
			test.log(LogStatus.INFO, "Pay saved payee Test ended");
			Startup.tearDown();
     }

}
