package Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusables.BaseTest;

public class WorldofTSpice {

	WebDriver driver;
	public WorldofTSpice(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	@FindBy(xpath="//span[normalize-space()='World of TSpice']")
	public WebElement menu_WorldofTspice;
	public WebElement getmenu_WorldofTspice() {
		return menu_WorldofTspice;
	}
	@FindBy(xpath="//h2[normalize-space()='World of Spice']")
	public WebElement txt_WorldofTspice;
	public WebElement gettxt_WorldofTspice() {
		return txt_WorldofTspice;
	}
	
	
	
	
	
	

	
}
