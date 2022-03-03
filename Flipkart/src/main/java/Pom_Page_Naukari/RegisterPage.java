package Pom_Page_Naukari;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class RegisterPage 
{
	/*Description: This Page is use for Click the register button and fill the required credentials
	 * 
	 * @Author Shobha
	 * @param
	 * */
	
	 WebDriverUtility web = new  WebDriverUtility();
	 WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* register Button */
	@FindBy(xpath="//li[@class='Register']")
	private WebElement registerBtn;
	
	
	/* name text field */
	@FindBy(id="name")
	private WebElement tfuserNm;
	

	/* Email text field */
	@FindBy(id="email")
	private WebElement tfEmail;
	
	

	
	/* Email text field */
	@FindBy(id="password")
	private WebElement tfPswd;
	
	
	
	/* mobNum text field */
	@FindBy(id="mobile")
	private WebElement tfMobNum;
	
	/* Exp. Button */
	@FindBy(xpath="//div[@data-val='exp']")
	private WebElement explogo;
	
	
	/* register now Button */
	@FindBy(xpath="//button[text()='Register Now']")
	private WebElement regNowBtn;
	
	
	/* Skip Button */
	@FindBy(xpath="//span[text()='Skip']")
	private WebElement btnSkip;
	
	/**
	 * Description:Method is used for handle window and click the register button
	 * @author Shobha
	 */
	public void switchingWindow()
	{
		try {
		registerBtn.click();
		web.switchToWindow(driver, "Register on Naukri.com: Apply to Millions of Jobs Online");
		System.out.println("succesfully switching window");
		}catch(Exception e) {
			System.out.println(" window not switching");
			Assert.fail("window not switching");
		}
	}
	/**
	 * Description:Method is used for fill the register page
	 * @author Shobha
	 * @param FullName
	 * @param email
	 * @param Password
	 * @param MobNumber
	 */

	
	public void fetchData(String FullName,String email,String Password,String MobNumber)
	{
		try {
		tfuserNm.sendKeys(FullName);
		tfEmail.sendKeys(email);
	
		tfPswd.sendKeys(Password);
		tfMobNum.sendKeys(MobNumber);
		System.out.println("succesfully fill the text field");
	}catch(Exception e) {
		System.out.println(" unable to fill the text field");
		Assert.fail("unable to fill the text field");
	}
		
		
}
	/**
	 * Description:Method is used for click opreation
	 * @author Shobha
	 */

	
	public void clkExp( )
	{
		try {
		
		explogo.click();
		regNowBtn.click();
		btnSkip.click();
		System.out.println("succesfully skip and continue");
		}catch(Exception e) {
			System.out.println(" unable to skip and continue");
			Assert.fail("unable to skip and continue");
	}
	
}
}
