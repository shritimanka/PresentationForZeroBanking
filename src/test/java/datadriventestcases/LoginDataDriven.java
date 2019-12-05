package datadriventestcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

// functionaltestcases.LoginTestCase;
//import utilities.Excelload;

public class LoginDataDriven extends Startup {
	
	 @Test
	    public void asign() {
	    	Startup.initConfiguration();
	    	test.log(LogStatus.INFO, "Login Test started");
	    	wp.clickSignInBtn();
	    }
	
	@Test(dataProvider= "credential")
	public void login(String usr, String pwd) {
		
				
		Startup.lp.Dologin(usr, pwd);
		Startup.expectedTitle = Startup.driver.getTitle();
		Startup.actualTitle = "Zero - Account Summary";
         Assert.assertEquals(Startup.actualTitle,Startup.expectedTitle);
         test.log(LogStatus.INFO, "Login Test ended");
         Startup.tearDown(); 
	}

	 @DataProvider(name="credential")
		public Object[][] passdata() throws IOException{
			//Excelload config= new Excelload(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Book1.xlsx");
		
		 test.log(LogStatus.INFO, "counting rows of the excel");
		int rows=config.getRowcount(1);
				
		Object[][] data = new Object[rows][2];
		for(int i=0; i<rows; i++)
		{
		data[i][0]=config.getData(0, i, 0);
		data[i][1]=config.getData(0, i, 1);
		
		}
		test.log(LogStatus.INFO, "Returning the test data");
		return data;
		} 
}
