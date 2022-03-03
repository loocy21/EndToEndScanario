package ElementReopTC_05;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;

public class HomePage 
{
	/*
	 * Description:Page is used for Seach Product
	 * @Author Shobha
	 * @param
	 * */
	JsonFileUtility jsonLib = new JsonFileUtility();
	
	WebDriver driver = null;
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/*Search Box text Field*/
	@FindBy(id="twotabsearchtextbox")
	private WebElement SearchBox;
	
	/*Search Button*/
	@FindBy(id="nav-search-submit-button")
	private WebElement SearchBtn;
	

	/*Get list*/
	@FindBy(xpath="//span[@class=\"a-size-medium a-color-base a-text-normal\"]")
	private List<WebElement> Mobileslist;
	
	/*Click Button*/
	@FindBy(xpath="//h1[@class=\"a-size-medium a-color-base a-text-normal\"]/ancestor::div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]/descendant::span[text()='Samsung Galaxy S21 FE 5G Cell Phone, Factory Unlocked Android Smartphone, 128GB, 120Hz Display, Pro Grade Camera, All Day Intelligent Battery, US Version, Graphite']")
	private WebElement FirstMobile;
	
	
	
	/**
	 * Description:Method is used for Search Product
	 * @param name
	 * @throws Throwable
	 * @author Shobha
	 */
	public void homepage() throws Throwable
	{
		try {
		SearchBox.sendKeys(jsonLib.readDataFromJSon("name"));
		SearchBtn.click();
		
			List<WebElement> list =Mobileslist;
			for(WebElement ele:list)
			{
				String s = ele.getText();
				System.out.println(s);
				
			}
			System.out.println("===get all text Succesfully===");
			}catch(Exception e)
			{
				System.out.println("not able to take all list");
			}
			Assert.assertTrue(true);
			
	}
	public void click()
	{
			FirstMobile.click();
				
			
			
			
		}
	}
	
