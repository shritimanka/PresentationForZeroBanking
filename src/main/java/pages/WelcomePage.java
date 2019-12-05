package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

public class WelcomePage extends Startup{
	WebDriver driver;
	
	public WelcomePage(WebDriver driver){
		this.driver=driver;
		//@SuppressWarnings("unused")
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(driver,this);
		
		}
	
   // locate web element
	
	@FindBy(id="signin_button")
	public WebElement signbtn;
	
	
	// create a method
	public void clickSignInBtn(){
		log.debug("click Sign In button");
		test.log(LogStatus.INFO, "Click Sign In Button");
		signbtn.click();
	}
}
