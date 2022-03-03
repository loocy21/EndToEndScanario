package ElementRepositoryTC_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.BaseClass;
import GenricUtilities.WebDriverUtility;

public class LoginPage extends BaseClass
{
	/*Description: This Page is use for Login The Application
	 * @Author Shobha
	 * @param
	 * */
	
	 WebDriverUtility web = new  WebDriverUtility();
	 WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/* mobile number text Field*/
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement EnterMobileNum;
	
	
	/*Password text Field*/
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement EnterPassword;
	
	/*Login Button*/
	@FindBy(xpath="(//span[text()='Login'])[2]")
	
	
	private WebElement ClickBtn;
	/*
	 * Description:method for login page
	 * @Author Shobha
	 * @Param
	 * */
	public void LoginPage1(String username ,String Password)
	{
		try {
		EnterMobileNum.sendKeys(username);
		EnterPassword.sendKeys(Password);
		ClickBtn.click();
		System.out.println("Login Succesfully");
		}
		catch(Exception e)
		{
			System.out.println("Not Login Showing Exception");
			Assert.fail("Login Not Succesfull");
		}
		
		
		
		
	}
}

	
