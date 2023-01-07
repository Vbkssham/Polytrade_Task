package Reusables;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers extends BaseTest {
	static WebDriver driver;
	String Browsertype;
	Properties prop ;
	String url;

	
	public static  void browser(String browser) throws IOException {
		switch(browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;	
			
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		}
		driver.manage().window().maximize();

		
	}
	
	public static void SetWebDriver(String Browser) throws IOException {
		browser(Browser);
	}
	
	public static WebDriver getDriver() {
		try {
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return driver;
		}
	
		
	}

}
