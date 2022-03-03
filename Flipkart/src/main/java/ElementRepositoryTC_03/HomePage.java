package ElementRepositoryTC_03;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class HomePage 
{
	/**
	 * @author Shobha
	 * Description:This homePage used for MyAccount Page
	 */

	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*My Account Button*/
	@FindBy(xpath="//*[@class=\"zZ3yfL\"]")
	private WebElement MyAccount;
	
	/*My Profile Button */
	@FindBy(xpath="//div[text()='My Profile']")
	private WebElement MyProfileBtn;
	
	/* Scroll Down Page*/
	@FindBy(xpath="//span[text()='Mobile Number']")
	private WebElement ScrollDown;
	
	
	
	public void Myaccount(WebDriver driver) throws Throwable
	{
		/*
		 * Validate the home page 
		 * @Param
		 * */
		
		  String actualtitle1 = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String expectedtitle1 =driver.getTitle(); Assert.assertEquals(actualtitle1,
		  expectedtitle1); System.out.println("actualtitle1="+actualtitle1);
		 
		  
		  /*
		   * Description:This Method is used for MouseOver and Navigate to MyProfilePage
		   * */
		try {
		web.waitForPageLoad(driver);
		web.mouseOver(driver, MyAccount);
		
		MyProfileBtn.click();
		web.scrollBar(driver,ScrollDown);
		System.out.println("Click My profile Succesfully");
		System.out.println("Scroll down succesfully");
		}
		catch(Exception e)
		{
			System.out.println("not clicked");
			
		}
		/*
		 * validate the my profile page
		 * @Author Shobha
		 */
		
		  String actualtitle = "My Profile"; String expectedtitle =driver.getTitle();
		  assertEquals(actualtitle, expectedtitle);
		  System.out.println("actualtitle="+actualtitle);
		 
		 
		
	}
	
		}
	



