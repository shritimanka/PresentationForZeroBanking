package datadriventestcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;
import functionaltestcases.LoginTestCase;

public class AddPayee_datadriven extends Startup {
	LoginTestCase login = new LoginTestCase();
	 @Test(priority=1)
	  public void asign() {
		 test.log(LogStatus.INFO, "Logging in the website");
		    login.login();
		    
		    test.log(LogStatus.INFO, "Add new payee Test started");
	    	ap.clickpaybill();
	    	
	    }
	 
	 @Test(dataProvider="credentials",priority=2) 
		public void Addpayee(String nm, String add, String acc , String dtls) throws InterruptedException {
		    ap.clickaddpy()	;	
			ap.Doaddpayee(nm,add,acc,dtls);
			expectedTitle ="The new payee "+nm+" was successfully created.";
			actualTitle= driver.findElement(By.xpath("//*[@id='alert_content']")).getText();
			Assert.assertEquals(actualTitle, expectedTitle);
			test.log(LogStatus.INFO, "Add new payee Test started");
		}
	  @Test (priority=3)
	  public void endpayee() {
		  test.log(LogStatus.INFO, "quiting browser");
		  Startup.tearDown();
	  }
	  
	  
	 @DataProvider(name="credentials")
		public Object[][] passdata() throws IOException{
			//Excelload config= new Excelload(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Book1.xlsx");
		
		 test.log(LogStatus.INFO, "counting rows of excel file");
		int rows=config.getRowcount(1);
	    		Object[][] data = new Object[rows][4];
				for(int i=0; i<rows; i++)
				{
				data[i][0]=config.getData(1, i, 0);
				data[i][1]=config.getData(1, i, 1);
				data[i][2]=config.getData(1, i, 2);
				data[i][3]=config.getData(1, i, 3);
				}
				test.log(LogStatus.INFO, "returning the Test data");
		return data;
		} 
}
