package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class FindTransactionPage extends Startup{
     WebDriver driver;
	
	public FindTransactionPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	
	
	@FindBy(linkText="Account Activity")
	public WebElement accactbtn;

	@FindBy(linkText="Find Transactions")
	public WebElement findtrbtn ;
	
	
	@FindBy(id ="aa_description")
	public WebElement accdscp ;
	
	@FindBy(id ="aa_fromDate")
	public WebElement fromdate ;
	
	@FindBy(id ="aa_toDate")
	public WebElement todate ;
	
	@FindBy(id ="aa_fromAmount")
	public WebElement fromamt ;
	
	@FindBy(id ="aa_toAmount")
	public WebElement toamt ;
	
	@FindBy(id ="aa_type")
	public WebElement trtype ;
	
	@FindBy(xpath="//*[@id='find_transactions_form']/div[2]/button")
	public WebElement findbtn ;
	
	// create a method
	public void clicfindtrbtn() {
		log.debug("Click Account Activity button");
		test.log(LogStatus.INFO, "Clicking Account activity button");
		accactbtn.click();
		log.debug("Click Find transaction button");
		test.log(LogStatus.INFO, "Clicking Find Transaction button");
		findtrbtn.click();
	}
	
	public void findtransaction(String desc, String frdt, String todt, int framt ,int tamt , int type) {
		
		log.debug("Enter Description");
		test.log(LogStatus.INFO, "Enter Description");
		accdscp.sendKeys(desc);
		
		log.debug("Choose From date");
		test.log(LogStatus.INFO, "Choose From date");
		fromdate.sendKeys(frdt);
		
		log.debug("Choose To date");
		test.log(LogStatus.INFO, "Choose To date");
		todate.sendKeys(todt);
		
		log.debug("Minimum amount");
		test.log(LogStatus.INFO, "Minimum Amount");
		fromamt.sendKeys(String.valueOf(framt));
		
		log.debug("Maximum Amount");
		test.log(LogStatus.INFO, "Maximum Amount");
		toamt.sendKeys(String.valueOf(tamt));
		
		log.debug("Enter account type");
		test.log(LogStatus.INFO, "Enter account type");
		trtype.sendKeys(String.valueOf(type));
		
		log.debug("Click find button");
		test.log(LogStatus.INFO, "Clicking find button");
		findbtn.click();
		
		
	}


}
