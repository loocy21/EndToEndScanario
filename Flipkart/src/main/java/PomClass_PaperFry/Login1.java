package PomClass_PaperFry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.ExcelFileUtility;
import GenricUtilities.JsonFileUtility;
import GenricUtilities.SampleDataProvider;
import GenricUtilities.WebDriverUtility;

public class Login1 
{
	/*Description: This Page is use for Login The Application
	 * @Author Shobha
	 * @param
	 * */
	JsonFileUtility json = new JsonFileUtility();
	 WebDriverUtility web = new  WebDriverUtility();
	 ExcelFileUtility sp = new ExcelFileUtility();
			 
	 WebDriver driver = null;
	public Login1(WebDriver driver)
	{
		this .driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*xpath for the clicking on login icon*/
	@FindBy(xpath="//a[@class='hd-icon-cta hd-profile-cta']")
	private WebElement usrIcon;
	
	
	/* Click Login Button */
	@FindBy(id="registerPopupLink")
	private WebElement lgnReg;

	
	/*Login Button*/
	@FindBy(xpath="//div[@id='main_navigation_menu']//a[contains(text(),'Sofas & Recliners')]")
	private WebElement sofaSre;
	
	/* text field user name */
	public WebElement mouseOnEle(String value) {
		String xpath="//div[@id='main_navigation_menu']//a[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* text field password */
	
	@FindBy(xpath="//div[@class='headerHover__brands-wrap']//ul/li")
	private List<WebElement> popBrands;
	
	
	
	/*Login Button*/

	@FindBy(xpath="//a[contains(text(),'ARRA')]")
	private WebElement clkBrand;
	
	/**
	 * Descrption:method for printing all the list popular brands
	 * @author padmaja
	 * @param
	 */
	 public void getCategories(String value)
	 {
	    try 
	    { 
	    	for(WebElement wb :popBrands )
	    	{
	    		String Categories = wb.getText();
	    		System.out.println(Categories);
	    	}

	        System.out.println("Able to get categories of "+value);
		}
		catch(Exception e)
		{
			System.out.println("Unable to get categories of "+value);
			Assert.fail("Unable to get categories of "+value);
		}	
	}
	
	
	
	/**
	 * Descrption:method for mouse over on particular element
	 * @author padmaja
	 * @param
	 * @throws Throwable 
	 */
	
	public void mouseOnParticular(String Value) throws Throwable {
		try {
			web.mouseOver(driver, mouseOnEle(Value));
			System.out.println("able to do particular element");
		}catch(Exception e) {
			System.out.println("not able to do on particular element");
			Assert.fail("not able to do on particular element");
		}
	}
	
	/**
	 * Descrption:clicking on particular product
	 * @author padmaja
	 * @param
	 */
	public void clkPartProduct(String Product) {
		try {
			clkBrand.click();
			System.out.println("able to click on particular brand");
		}catch(Exception e) {
			System.out.println("not able to click on particular brand");
			Assert.fail("not able to click on particular brand");
		}
	}
	
	
	/**
	 * Descrption method for clicking on user icon
	 * @author padmaja
	 * @param
	 * @throws Throwable 
	 * @throws  
	 */
	
	public void usrIcon() throws Throwable   {
		try {
			//web.waitForElementVisibility(driver, usrIcon);
			web.mouseOver(driver, usrIcon);
			System.out.println("mouse over done succesfully");
			lgnReg.click();
			System.out.println("able to click on usericon succesfully");
		}catch(Exception e) {
			System.out.println("unable to click on usericon succesfully");
			Assert.fail("unable to click on usericon succesfully");
		}
	}
		
	}
	


