package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class PaySavedPayeePage extends Startup {

		WebDriver driver;
		
		public PaySavedPayeePage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
			}
		
		
		//@FindBy(xpath="//*[@id=\"pay_bills_tab\"]/a")
		@FindBy(linkText="Pay Bills")
		public WebElement paybill;
		
		//@FindBy(xpath="//*[@id=\"tabs\"]/ul/li[2]")
		@FindBy(linkText="Pay Saved Payee")
		public WebElement pspayeebtn ;
		
		
		@FindBy(id ="sp_payee")
		public WebElement payeename ;
		
		@FindBy(id ="sp_account")
		public WebElement payeeacc ;
		
		@FindBy(id ="sp_amount")
		public WebElement payeeamt ;
		
		@FindBy(id ="sp_date")
		public WebElement payeedate ;
		
		@FindBy(id ="sp_description")
		public WebElement payeedscp ;
		
		@FindBy(id ="pay_saved_payees")
		public WebElement paybtn ;
		
		@FindBy(id ="alert_content")
		public WebElement alertmsg ;
		
		
		// create a method
		public void clickpaybill() {
			log.debug("Click Paybill button");
			test.log(LogStatus.INFO, "Clicking Paybill button");
			paybill.click();
			
			log.debug("Click Pay saved payee button");
			test.log(LogStatus.INFO, "Clicking pay saved payee button");
			pspayeebtn.click();
		}
		
		public void payspayee(int mypayee, int myacc, int myamt ,String mydate, String mydsc ) throws InterruptedException {
			
			log.debug("Select the Payee name");
			test.log(LogStatus.INFO, "Select the Payee name");
			Select pp = new Select(payeename);
			pp.selectByIndex(mypayee);
			
			log.debug("Select the Payee account");
			test.log(LogStatus.INFO, "Select the Payee account");
			Select ppa = new Select(payeeacc);
			ppa.selectByIndex(myacc);
			
			log.debug("Enter the amount");
			test.log(LogStatus.INFO, "Enter the amount");
			payeeamt.sendKeys(String.valueOf(myamt));
			
			log.debug("select date");
			test.log(LogStatus.INFO, "choose date ");
			payeedate.sendKeys(mydate);
			payeedate.sendKeys(Keys.TAB);
			
			log.debug("Enter the description");
			test.log(LogStatus.INFO, "Enter the description");
			payeedscp.sendKeys(mydsc);
			
			log.debug("waiting");
			test.log(LogStatus.INFO, "waiting");
			Thread.sleep(1000);
			
			log.debug("Click Pay button");
			test.log(LogStatus.INFO, "Clicking Pay button");
			paybtn.click();
			
		}
	

}
