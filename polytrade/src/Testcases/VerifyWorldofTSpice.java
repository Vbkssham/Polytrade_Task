package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Object_Repository.Home_Screen;
import Object_Repository.WorldofTSpice;
import Reusables.BaseTest;
import Reusables.Browsers;
import Reusables.Steps;
import Reusables.common_methods;

public class VerifyWorldofTSpice extends BaseTest {
	

	

	@Test(groups= {"SmokeTest"})
	public void verifyWorldofTspice() throws IOException {
		try {
			Steps s=new Steps();
			s.verifyworldoftspice();
		
		}
		catch(Exception e) {
			Takescreenshot(new Browsers().getDriver(), "./src/Screenshots/PolicyTradeHome.jpg");
		}
	}

}
