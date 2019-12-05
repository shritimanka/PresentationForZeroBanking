package functionaltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class LoginTestCase extends Startup{
	
	@Test
	public void login() {
		Startup.initConfiguration();
		test.log(LogStatus.INFO, "Login Test started");
		wp.clickSignInBtn();
		lp.Dologin("username", "password");
	     String expectedTitle = driver.getTitle();
	     String actualTitle = "Zero - Account Summary";
         Assert.assertEquals(actualTitle,expectedTitle);
         test.log(LogStatus.INFO, "Login Test ended");	
	}
	
}
