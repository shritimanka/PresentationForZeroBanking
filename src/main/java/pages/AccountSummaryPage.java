package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class AccountSummaryPage extends Startup {
	//WebDriver driver;
	
	public AccountSummaryPage(WebDriver driver){
		//this.driver=driver;
		@SuppressWarnings("unused")
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(driver,this);
		
		}
	
	@FindBy(linkText="Account Summary")
	public WebElement accbtn;
	
	 @FindBy(linkText="Savings")
	 public WebElement sav1btn;
	 
	 
	 @FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/a")
	 public WebElement sav2btn;
	 
	 @FindBy(linkText="Brokerage")
	 public WebElement brokbtn;
	 
	 @FindBy(linkText="Checking")
	 public WebElement checkbtn;
	 
	 @FindBy(linkText="Credit Card")
	 public WebElement crcdbtn;
	 
	 @FindBy(linkText="Loan")
	 public WebElement loanbtn;
	 
	 //@FindBy(xpath="//*[@id=\'aa_accountId\']")
	 public String accid;
	 public String accname;
	 
	public void clickacbtn() {
		log.debug("click Account Summary Button");
		test.log(LogStatus.INFO, "Click Account Summary Button");
		accbtn.click();
	}
	 
	 public void Accountdetails(int option) {
		 	 
				 
		 if (option==1) {
			 log.debug("click 1st Savings  Button");
			 test.log(LogStatus.INFO, "Click 1st Savings Button");
			 sav1btn.click();
			 accid=driver.findElement(By.xpath("//*[@id='aa_accountId']/option[1]")).getText();
			 accname="Savings";
			}
		 else if (option==2) {
			 log.debug("click 2nd Savings  Button");
			 test.log(LogStatus.INFO, "Click 2nd Savings Button");
			 sav2btn.click();
			 accid=driver.findElement(By.xpath("//*[@id='aa_accountId']/option[3]")).getText();
			 accname="Savings";
		   }
		 else if (option==3) {
			 log.debug("click Brokerage  Button");
			 test.log(LogStatus.INFO, "Click Brokerage Button");
			 brokbtn.click();
			 accid=driver.findElement(By.xpath("//*[@id='aa_accountId']/option[6]")).getText();
			 accname="Brokerage";
		 }
		 else if (option==4) {
			 log.debug("click Checking Button");
			 test.log(LogStatus.INFO, "Click Checking Button");
			 checkbtn.click();
			 accid=driver.findElement(By.xpath("//*[@id='aa_accountId']/option[2]")).getText();
			 accname="Checking";
		 }
		 else if (option==5) {
			 log.debug("click Credit Card  Button");
			 test.log(LogStatus.INFO, "Click Credit Card Button");
			 crcdbtn.click();
			 accid=driver.findElement(By.xpath("//*[@id='aa_accountId']/option[5]")).getText();
			 accname="Credit Card";
		 }
		 else if (option==6) {
			 log.debug("click Loan Button");
			 test.log(LogStatus.INFO, "Click Loan Button");
			 loanbtn.click();
			 accid=driver.findElement(By.xpath("//*[@id='aa_accountId']/option[4]")).getText();
			 accname="Loan";
		 }
 
	 }
	 }
