package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Reusables.BaseTest;
import Reusables.Browsers;
import Reusables.Steps;

public class VerifyPolicyTradeHome extends BaseTest {
	
	@Test(groups= {"SmokeTest"})
	public void verifyHome() throws IOException {
		try {
		Properties prop = readPropertiesFile(".\\src\\Config\\Application.properties");
		String url=prop.getProperty("Application_url");
		
		Steps s=new Steps();
		s.launch_url(url);
		s.verifyHomeBanner();
		s.verifylenderpopup();
		s.verifypoolinHome();
		s.verifyOverViewDataInHome();
		}
		catch(Exception e) {
			Takescreenshot(new Browsers().getDriver(), "./src/Screenshots/PolicyTradeHome.jpg");
		}
	}

}
