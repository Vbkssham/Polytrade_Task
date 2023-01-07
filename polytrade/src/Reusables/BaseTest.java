package Reusables;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ExtentReports.ReportConfiguration;

public class BaseTest  extends ReportConfiguration {
	    public WebDriver driver;
		String Browsertype;
		Properties prop ;
		String url;
	

//		@BeforeClass
//	public void startReport() throws IOException {
//			prop = readPropertiesFile(".\\src\\Config\\Application.properties");
//			Browsertype=prop.getProperty("Browser");
//			url=prop.getProperty("Application_url");
//			Browsers.SetWebDriver(Browsertype);
//	        
//
//	}
		
	    @BeforeTest(groups= {"SmokeTest"})
		public void setup() throws IOException {
			prop = readPropertiesFile(".\\src\\Config\\Application.properties");
			Browsertype=prop.getProperty("Browser");
			url=prop.getProperty("Application_url");
			Browsers.SetWebDriver(Browsertype);
			ReportConfiguration.ExtendReportConfiguraiton();
		}
		
	    @AfterTest(groups= {"SmokeTest"})
	    public void closeBrowser() {
	    	driver=Browsers.getDriver();
	    	driver.quit();
	    }
	    }