package ElemetRepo_Myntraa;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.SampleDataProvider;
import GenricUtilities.WebDriverUtility;
/**
 * LoginPage
 * Description:This page is used for Login The Application
 * @author Shobha
 *
 */

public class LoginPage 
{
	SampleDataProvider sp = new SampleDataProvider();
	
	WebDriverUtility web = new WebDriverUtility();
	JsonFileUtility jsonLib = new JsonFileUtility();
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* mouseOver profile  */
	@FindBy(xpath="//div[@class='desktop-user']")
	private WebElement profileLogo;


	/* Button signup */
	@FindBy(xpath="//a[text()='login / Signup']")
	private WebElement signBtn;

	/* Text Field userName */
	@FindBy(xpath="//input[@class='form-control mobileNumberInput']")
	private WebElement usernameBox;

	/* Button Continue */
	@FindBy(xpath="//div[text()='CONTINUE']")
	private WebElement continueBtn;

	/* Button OTP */
	@FindBy(xpath="//span[text()=' Password ']")
	private WebElement paswdBox;

	/*Text Field Password */
	@FindBy(xpath="//input[@class='form-control has-feedback']")
	private WebElement paswdTF;

	/* Button Login */
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement loginBtn;

	
	/**
	 * Description:Method is used for Login the application
	 * @author Shobha
	 * @param driver
	 * @throws Throwable
	 */

	public void login() throws Throwable
	{
		try {
			web.mouseOver(driver, profileLogo);
			signBtn.click();
			usernameBox.sendKeys(sp.getRowData("Sheet1", "1", 1));
			continueBtn.click();
			paswdBox.click();
			paswdTF.sendKeys(jsonLib.readDataFromJSon("Password"));
			loginBtn.click();
			System.out.println("Login Succesfully");
		}catch(Exception e )
		{
			System.out.println("Login not Succesfully");

			Assert.fail("Login not Succesfully");
		}
	}
	
}
	


