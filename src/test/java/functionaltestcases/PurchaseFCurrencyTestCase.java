package functionaltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class PurchaseFCurrencyTestCase extends Startup {
	LoginTestCase login = new LoginTestCase();
	 @Test
     public void PurchaseCur() throws InterruptedException {
    	 	
		    login.login();
		    test.log(LogStatus.INFO, "Purchase foreign currency Test started");
		    pfc.clickpurbtn();
			pfc.PurchaseCurrency(2, "100", 1 ,"94.19 dollar (CAD) = 100.00 U.S. dollar (USD)" );
				
			expectedTitle ="Foreign currency cash was successfully purchased.";
			//actualTitle= driver.findElement(By.id("alert_container")).getText();
			actualTitle= (pfc.purmsg.getText());
			Assert.assertEquals(actualTitle, expectedTitle);
			//Assert.assertEquals(pfc.ans,true);
			
			
			pfc.clickpurbtn();
			pfc.PurchaseCurrency(2, "100", 2 ,"100.00 dollar (CAD) = 106.17 U.S. dollar (USD)" );
			Assert.assertEquals(pfc.ans,true);
			
			test.log(LogStatus.INFO, "Purchase foreign currency Test ended");
			Startup.tearDown();
			
     }

}
