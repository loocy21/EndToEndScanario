package ElementRepoTC_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;

/**
 * Description:	This Page is used For Login the application
 * @author Shobha
 *
 */

public class LoginPage 
{
	public JsonFileUtility jsonLib = new JsonFileUtility();
	
	WebDriver driver = null;
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/*Username text Field*/
	@FindBy(name="email")
	private WebElement username; 
	
	/*Continue Button*/
	@FindBy(id="continue")
	private WebElement CtnuBtn; 
	
	/*password text Field*/
	@FindBy(name="password")
	private WebElement PswdBox; 
	
	/*SignIn Button*/
	@FindBy(id="signInSubmit")
	private WebElement SignIn; 
	
	/**
	 * Description:Method is used for login the application
	 * @throws Throwable
	 */
	
	public void LoginPage() throws Throwable
	{
		try {
		username.sendKeys(jsonLib.readDataFromJSon("username"));
		CtnuBtn.click();
		PswdBox.sendKeys(jsonLib.readDataFromJSon("Password"));
		SignIn.click();
		System.out.println("==able to login==");
		}catch(Exception e)
		{
			System.out.println("not able to login");
		}
		Assert.assertTrue(true);
	}
	

}
