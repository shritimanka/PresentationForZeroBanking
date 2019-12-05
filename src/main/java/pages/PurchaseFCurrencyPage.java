package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class PurchaseFCurrencyPage extends Startup {
	WebDriver driver;
	public boolean ans=false;
	public  PurchaseFCurrencyPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Pay Bills")
	public WebElement paybill;
	
	@FindBy(linkText="Purchase Foreign Currency")
	public WebElement pfcurbtn ;
	
	@FindBy(id="pc_currency")
	public WebElement pcur ;
	
	@FindBy(id="pc_amount")
	public WebElement Pamt;
	
	@FindBy(id="pc_inDollars_true")
	public WebElement amtindollar;
	
	
	 @FindBy(id="pc_inDollars_false")
	 public WebElement amtnotdollar;
	 
	 @FindBy(id="pc_calculate_costs")
	 public WebElement pcalc;

	 @FindBy(id="pc_conversion_amount")
	 public WebElement pconamt;
	 
	 @FindBy(id="purchase_cash")
	 public WebElement purbtn;
	 
	 @FindBy(id="alert_content")
	 public WebElement purmsg;
	 
	 
	 public void clickpurbtn() {
		 log.debug("Click Paybill button");
		test.log(LogStatus.INFO, "Click Paybill button");
		 paybill.click();
		
		 log.debug("Click Puchase foreign currency button");
			test.log(LogStatus.INFO, "Click Puchase foreign currency button");
		 pfcurbtn.click();
	 }
	
	 public void PurchaseCurrency(int cur, String amt, int scn, String camt) {
		 
		 log.debug("Select currency button");
		 test.log(LogStatus.INFO, "Select currency button");
		 Select pcur1 = new Select(pcur);
		 pcur1.selectByIndex(cur);
		 
		 if (cur ==0) {
			 
		 }
		 
		 log.debug("Enter the amount");
		 test.log(LogStatus.INFO, "Enter the amount");
		 Pamt.sendKeys(amt);
		
		 log.debug("checking scenario ans clicking in/not in dollars");
			test.log(LogStatus.INFO, "checking scenario ans clicking in/not in dollars");
		  if (scn == 1) {
			  amtindollar.click();
		  }
		  else {
				  amtnotdollar.click();
			}
		  
		  log.debug("Click calculate button");
			test.log(LogStatus.INFO, "Click calculate button");
		  pcalc.click();
		  
		  ans= camt.equalsIgnoreCase(pconamt.getText());
		  
		  log.debug("Click Puchase  button");
			test.log(LogStatus.INFO, "Click Puchase  button");
		  purbtn.click();
		  }

}
