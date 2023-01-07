package Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusables.BaseTest;

public class Home_Screen  {

	WebDriver driver;
	public Home_Screen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	@FindBy(xpath="//h2[text()='Home']")
	public WebElement headerforHome;
	public WebElement getHomeBanner() {
		return headerforHome;
	}
	@FindBy(xpath="//div[text()='To complete this process please connect your wallet by clicking on the button below']")
	public WebElement txtlendnwpopup;
	public WebElement gettxtlendnwpopup() {
		return txtlendnwpopup;
	}
	@FindBy(xpath="//*[text()='Lend Now']")
	public WebElement btnlendnow;
	public WebElement getbtnlendnow() {
		return btnlendnow;
	}
	@FindBy(xpath="//h5[text()='100 USDC']")
	public WebElement txtminlocked;
	public WebElement gettxtminlocked() {
		return txtminlocked;
	}
	@FindBy(xpath="//h5[text()='6%']")
	public WebElement txtfxdapr;
	public WebElement gettxtfxdapr() {
		return txtfxdapr;
	}
	@FindBy(xpath="(//span[text()='Total Polytrade Deposits']//following::h3)[1]")
	public WebElement txtTotalPolytradeDeposits;
	public WebElement gettxtTotalPolytradeDeposits() {
		return txtTotalPolytradeDeposits;
	}
	@FindBy(xpath="(//span[text()='Total Polytrade Deposits']//following::h3)[2]")
	public WebElement txtTotalInvoiceFund;
	public WebElement gettxttxtTotalInvoiceFund() {
		return txtTotalInvoiceFund;
	}
	@FindBy(xpath="(//div[@class='mt-4 col-md-4 col-sm-12 col-12']//h5[contains(text(),'USDC')])[2]")
	public WebElement txtcurrentpoolliquiity;
	public WebElement gettxtcurrentpoolliquiity() {
		return txtcurrentpoolliquiity;
	}
	
	@FindBy(xpath="//*[text()='Connect To Wallet']")
	public WebElement btncnttowallet;
	public WebElement getbtncnttowallet() {
		return btncnttowallet;
	}
	@FindBy(xpath="//button[text()='X']")
	public WebElement btnClose;
	public WebElement getbtnClose() {
		return btnClose;
	}
	
	@FindBy(xpath="//button[@aria-label='Skip']")
	public WebElement btnskip;
	
	public WebElement getbtnskipinHome() {
		return btnskip;
	}

	
	
	
	
	
	

	
}
