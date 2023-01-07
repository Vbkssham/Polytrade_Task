package Reusables;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Object_Repository.Home_Screen;
import Object_Repository.WorldofTSpice;


public class Steps extends common_methods {
	
	WebDriver driver=new Browsers().getDriver();	
	public void launch_url(String url) {
		try {
			driver.get(url);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void verifylenderpopup() {
		try {
			Home_Screen hm=new Home_Screen(driver);
			click(driver, hm.getbtnlendnow());
			Assert.assertEquals("To complete this process please connect your wallet by clicking on the button below", gettextofWebElement(driver,hm.gettxtlendnwpopup()));
			Assert.assertEquals(true,checkElement(hm.getbtncnttowallet()));
			Reporter.log("Popup is displayed with " + gettextofWebElement(driver, hm.getbtncnttowallet()) + " is Visible in Home Page");
			this.click(driver,hm.getbtnClose());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void verifypoolinHome() {
		try {
			Home_Screen hm=new Home_Screen(driver);
			Assert.assertEquals("100 USDC", gettextofWebElement(driver, hm.gettxtminlocked()));
			Reporter.log("Min.Locker Amount   " + gettextofWebElement(driver, hm.gettxtminlocked()) + " is Visible in Home Page");
			Assert.assertEquals(true, checkElement(hm.gettxtcurrentpoolliquiity()));
			String abc=gettextofWebElement(driver,hm.gettxtcurrentpoolliquiity());
			Reporter.log("Current Pool Liquidity data is Visible in Home Page");
			Assert.assertEquals("6%", gettextofWebElement(driver, hm.gettxtfxdapr()));
			Reporter.log("Fixed APR   " + gettextofWebElement(driver, hm.gettxtfxdapr()) + " is Visible in Home Page");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyOverViewDataInHome() {
		try {
			Home_Screen hm=new Home_Screen(driver);
			this.scrollIntoView(driver, hm.gettxtTotalPolytradeDeposits());
			Assert.assertEquals(true, checkElement(hm.gettxtTotalPolytradeDeposits()));
			Reporter.log("Total Polytrade Deposits   " + gettextofWebElement(driver, hm.gettxtTotalPolytradeDeposits()) + " is Visible in Home Page");
			this.scrollIntoView(driver, hm.gettxttxtTotalInvoiceFund());
			Assert.assertEquals(true, checkElement(hm.gettxttxtTotalInvoiceFund()));
			Reporter.log("Total Invoices Funded " + gettextofWebElement(driver, hm.gettxttxtTotalInvoiceFund()) + " is Visible in Home Page");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyHomeBanner() {
		try {
			Home_Screen hm=new Home_Screen(driver);
			this.click(driver,hm.getbtnskipinHome());
			Assert.assertEquals("Home", gettextofWebElement(driver, hm.getHomeBanner()));
			Reporter.log("Banner " + gettextofWebElement(driver, hm.getHomeBanner()) + " is Visible in Home Page");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void verifyworldoftspice() {
		try {
			WorldofTSpice ws=new WorldofTSpice(driver);	
			this.click(driver,ws.getmenu_WorldofTspice());
			Assert.assertEquals("World of TSpice", gettextofWebElement(driver, ws.getmenu_WorldofTspice()));
			this.scrollIntoView(driver, ws.gettxt_WorldofTspice());
			Reporter.log("Banner " + gettextofWebElement(driver, ws.gettxt_WorldofTspice()) + " is Visible in World of Tspice Page");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
