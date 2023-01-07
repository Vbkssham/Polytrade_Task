package Reusables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class common_methods extends Browser  {

	public common_methods() {
		
	
	}
	
	public void EnterValuesIntoTextBox(WebDriver driver, WebElement ele,String value) {
		try {
		Wait(driver,"visibility",ele);
		ele.clear();
		ele.sendKeys(value);
//		Reporter.log(value + "  is Entered in to the " +  ele.getAccessibleName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void click(WebDriver driver, WebElement ele) {
		try {
			Wait(driver,"click",ele);
			ele.click();
//			Reporter.log( ele.toString() + " is clicked sucessfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Wait(WebDriver driver,String ActionType,WebElement ele) {
		
		try {
			WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(60));
			switch(ActionType) {
			case "click":
				w.until(ExpectedConditions.elementToBeClickable(ele));
			   break;
			   
			case "visibility":
				w.until(ExpectedConditions.visibilityOf(ele));
			   break;
			   
			case "selected":
				w.until(ExpectedConditions.elementToBeSelected(ele));
			   break;
			   
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyText(WebDriver driver, WebElement ele,String message) {
		try {
			Wait(driver,"visibility",ele);
			Assert.assertEquals(gettextofWebElement(driver,ele), message);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String gettextofWebElement(WebDriver driver, WebElement ele) {
		Wait(driver,"visibility", ele);
		return ele.getText();
	}
	public void verifyDropdown(WebDriver driver, WebElement ele) {
		
	}
	public void cleartext(WebDriver driver, WebElement ele) {
		Wait(driver,"visibility", ele);
		ele.click();
		ele.clear();
	}
	
	public void selectBytext(WebElement ele,String value) {
	
		new Select(ele).selectByVisibleText(value);
		Reporter.log("Selected the " + value + " in to the Select options of  " +  ele.getAccessibleName());
	}
	
	public void selectByvalue(WebElement ele,String value) {
		
		new Select(ele).selectByValue(value);
		Reporter.log("Selected the " + value + " in to the Select options of  " +  ele.getAccessibleName());
	}
	
	public void selectByIndex(WebElement ele,int value) {
		
		new Select(ele).selectByIndex(value);
		Reporter.log("Selected the " + value + " in to the Select options of  " +  ele.getAriaRole());
	}

	 public  Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	 
	 public static void Takescreenshot(WebDriver driver, String filename) {
		 
		try {
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 File DestFile=new File(filename);
             FileUtils.copyFile(SrcFile, DestFile);
		}
		catch(Exception e) {
			
		}
	 }
	 
	 public void wait(int Waittime) {
		 try {
			 Thread.sleep(Waittime*1000); 
		 }
		 catch(Exception e) {
			 
		 }
	 }
	 public void scrollandclick(WebDriver driver , WebElement e) {
		 
		 try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(2000);
			e.click();
			
		 }
		 catch(Exception e1) {
			 e1.printStackTrace();
		 }
	 }
	 public void scrollIntoView(WebDriver driver , WebElement e) {
		 
		 try {
			 JavascriptExecutor js=((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].scrollIntoView(true);", e);
			 Thread.sleep(2000);
		 }
		 catch(Exception e1) {
			 e1.printStackTrace();
		 }
	 }
	 public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		 String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 return destination;
		 }
	 public boolean checkElement( WebElement e) {
		 
		 try {
			boolean b=false;
			e.isDisplayed();
			b=true;
			 return b;
		 }
		 catch(NoSuchElementException e1) {
			
			 return false;
		 }
		
	 }
	 public boolean checkElementclickable(WebDriver driver, WebElement e) {
		 
		 try {
			 Wait(driver,"click",e);
			 return true;
		 }
		 catch(NoSuchElementException e1) {
			 
			 return false;
		 }
		 
	 }
	 
}
