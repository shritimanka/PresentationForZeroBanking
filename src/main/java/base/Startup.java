package base;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.AccountSummaryPage;
import pages.AddPayeePage;
import pages.FindTransactionPage;
import pages.LoginPage;
import pages.PaySavedPayeePage;
import pages.PurchaseFCurrencyPage;
import pages.ShowTransactionPage;
import pages.TransferFundPage;
import pages.WelcomePage;
import utilities.Excelload;
import utilities.ExtentManager;
//import utilities.ExtentManager;

	/*
	 * WebDriver
	 * ExcelReader
	 * Logs
	 * Wait
	 * ExtentReports
	 */
public class Startup {
	 
	 
	public static  WebDriver driver;
	public static LoginPage lp;
	public static WelcomePage wp;
	public static AccountSummaryPage asp;
	public static ShowTransactionPage st;
	public static FindTransactionPage ft;
	public static AddPayeePage ap;
	public static PurchaseFCurrencyPage pfc;
	public static PaySavedPayeePage pp;
	public static TransferFundPage tf;
	public static String expectedTitle ;
	public static String actualTitle ;
  
	public static Logger log = Logger.getLogger("busyQALogger");
	public static Excelload config = getExcelload(); 
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test = new ExtentTest("test", "test1") ;
	public static String browser;
		
	public static void initConfiguration() {
		
		
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Launching Chrome Browser");
			test.log(LogStatus.INFO, "Chrome Browser Launched");
		
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		 wp= new WelcomePage(driver);
			lp= new LoginPage(driver);
			asp= new AccountSummaryPage(driver);
			st= new ShowTransactionPage(driver);
			ft= new FindTransactionPage(driver);
			ap = new AddPayeePage(driver);
			pp = new PaySavedPayeePage(driver);
			pfc = new PurchaseFCurrencyPage(driver);
			tf = new TransferFundPage(driver);
	}
	
	public static Excelload getExcelload()  {
		try {
			config=  new Excelload(	System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Book1.xlsx");
		}catch(Exception ex) {
			log.error("errorcatch"+ ex);
			//throw ex;
		}
		return config;
	}
	public static void tearDown() {
		driver.quit();
		log.debug("Closing Browser");
		test.log(LogStatus.INFO, "Browser closing");
		
	}

	
}

