package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class AddPayeePage extends Startup {
	
WebDriver driver;
	
	public AddPayeePage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	
	
	@FindBy(xpath="//*[@id=\"pay_bills_tab\"]/a")
	public WebElement paybill;
	
	//@FindBy(xpath="//*[@id=\"tabs\"]/ul/li[2]")
	@FindBy(linkText="Add New Payee")
	public WebElement addnewpayeebtn ;
	
	
	@FindBy(id ="np_new_payee_name")
	public WebElement newpayeename ;
	
	@FindBy(id ="np_new_payee_address")
	public WebElement newpayeeadd ;
	
	@FindBy(id ="np_new_payee_account")
	public WebElement newpayeeacc ;
	
	@FindBy(id ="np_new_payee_details")
	public WebElement newpayeedetails ;
	
	@FindBy(id ="add_new_payee")
	public WebElement addbtn ;
	
	
	
	
	// create a method
	public void clickpaybill() {
		log.debug("Click Paybill button");
		test.log(LogStatus.INFO, "Clicking paybill button");
		paybill.click();
	}
	
	public void clickaddpy() {
		log.debug("Click Add new payee button");
		test.log(LogStatus.INFO, "Click Add new payee button");
		addnewpayeebtn.click();
	}
	
	
	public void Doaddpayee(String myname, String myadd, String myacc ,String mydetail ) {
		log.debug("Type new payee name");
		test.log(LogStatus.INFO, "Entering new payee name");
		newpayeename.sendKeys(myname);
		log.debug("Type new payee address");
		test.log(LogStatus.INFO, "Entering new payee address");
		newpayeeadd.sendKeys(myadd);
		log.debug("Type new payee account number");
		test.log(LogStatus.INFO, "Entering new payee account number");
		newpayeeacc.sendKeys(myacc);
		log.debug("Type new payee details");
		test.log(LogStatus.INFO, "Entering new payee details");
		newpayeedetails.sendKeys(mydetail);
		log.debug("Click add button");
		test.log(LogStatus.INFO, "Clicking add button");
		addbtn.click();
		
		
	}

}
