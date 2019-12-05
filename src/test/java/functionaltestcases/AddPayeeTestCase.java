package functionaltestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class AddPayeeTestCase extends Startup {
	LoginTestCase login = new LoginTestCase();
	
	@Test
	public void Addpayee() {
		test.log(LogStatus.INFO, "Addpayee Test started");
		login.login();
		ap.clickpaybill();
		ap.clickaddpy();
		ap.Doaddpayee("jack", "add1", "ase1234", "details ");
		expectedTitle ="The new payee jack was successfully created.";
		actualTitle= driver.findElement(By.xpath("//*[@id='alert_content']")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
		test.log(LogStatus.INFO, "Addpayee Test ended");
		Startup.tearDown();
	}

}
