package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class ShowTransactionPage extends Startup {
	WebDriver driver;
	
	public ShowTransactionPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	// find a web  element
	@FindBy(linkText="Account Activity")
	public WebElement accact;
	
	@FindBy(linkText="Show Transactions")
	public WebElement showtran;
	
	@FindBy(id="aa_accountId")//*[@id="aa_accountId"]/option[2]
	public WebElement accidbtn;
		
	// create a method
	public void clickbtn() {
		log.debug("Click Account Activity  button");
		test.log(LogStatus.INFO, "Click Account Activity  button");
		accact.click();
		
    	log.debug("Click Show transaction button");
		test.log(LogStatus.INFO, "Click show transaction button");
		showtran.click();
		
	}
	
	
	public void Showtr(int acc) throws InterruptedException {
		
		 Select acc1 = new Select(accidbtn);
		 acc1.selectByIndex(acc);
		
		
		log.debug("waiting ");
		test.log(LogStatus.INFO, "Waiting");
		Thread.sleep(500);
	}


}
