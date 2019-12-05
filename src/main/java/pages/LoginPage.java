package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.relevantcodes.extentreports.LogStatus;

import base.Startup;

//import bsh.This;

public class LoginPage extends Startup  {
	//WebDriver driver;
	
	public LoginPage(WebDriver driver){
		//this.driver=driver;
		@SuppressWarnings("unused")
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(driver, this);
		
		}
	
	
	// find a web  element
	
	@FindBy(id="user_login")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(name="submit")
	public WebElement signbtn;
	
	
	
	// create a method
	
	public void Dologin(String myusername, String mypassword) {
		log.debug("type username");
		test.log(LogStatus.INFO, "Entering username");
		username.sendKeys(myusername);
		
		log.debug("type password");
		test.log(LogStatus.INFO, "Entering password");
		password.sendKeys(mypassword);
		
		log.debug("click submit button");
		test.log(LogStatus.INFO, "Click Submit Button");
		signbtn.click();
		
		
	}

	
}
