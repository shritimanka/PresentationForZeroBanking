package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class TransferFundPage extends Startup {
   WebDriver driver;
	
	public TransferFundPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	//@FindBy(xpath="//*[@id=\"pay_bills_tab\"]/a")
	@FindBy(linkText="Transfer Funds")
	public WebElement trfund;
	
	
	
	//@FindBy(xpath="//*[@id=\"tabs\"]/ul/li[2]")
	@FindBy(id="tf_fromAccountId")
	public WebElement trfromacc ;
	
	
	@FindBy(id ="tf_toAccountId")
	public WebElement trtoacc ;
	
	@FindBy(id ="tf_amount")
	public WebElement tramt ;
	
	@FindBy(id ="tf_description")
	public WebElement trdscp ;
	
	@FindBy(id ="btn_submit")
	public WebElement trbtn ;
	
	@FindBy(id ="btn_submit")
	public WebElement tr1btn ;
	
	@FindBy(id ="btn_cancel")
	public WebElement cancelbtn ;
	
	
	
	//@FindBy(className="//*[@id='transfer_funds_content']/div/div/div[1]")
	@FindBy(className="alert alert-success   Hover")
	public WebElement altmsg ;
	
	@FindBy(linkText ="View transfers or make another transfer")
	public WebElement viewtrmsg  ;
	
	// create a method
	public void clicktfbtn() {
		trfund.click();
	//trfund.findElement(by.)	
	}
	
	public void Transferfund(int fromacc, int toacc, int amt ,String dscp, int trc) {
	
		log.debug("Select from account button");
		test.log(LogStatus.INFO, "Select from account button");
		Select fr = new Select(trfromacc);
		fr.selectByIndex(fromacc);
		
		log.debug("Select To account button");
		test.log(LogStatus.INFO, "Select To account button");
		Select to = new Select(trtoacc);
		to.selectByIndex(toacc);
		
		log.debug("Enter amount");
		test.log(LogStatus.INFO, "Enter amount");
		tramt.sendKeys(String.valueOf(amt));
		
		log.debug("Enter the description");
		test.log(LogStatus.INFO, "Enter the descrition");
		trdscp.sendKeys(dscp);
		
		log.debug("Click transfer  button");
		test.log(LogStatus.INFO, "Click transfer button");
		trbtn.click();
		
		log.debug("Click submit  button");
		test.log(LogStatus.INFO, "Click submit button");
		if (trc==1){
		    tr1btn.click();
		}
		else {
		    cancelbtn.click();
		}
		
		log.debug("Click the link 'View transfers or make another transfer'");
		test.log(LogStatus.INFO, "Click the link 'View transfers or make another transfer'");
		viewtrmsg.click();
		
	}

	

}
