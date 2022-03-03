package PomClass_PaperFry;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilities.ExcelFileUtility;
import GenricUtilities.JsonFileUtility;
import GenricUtilities.SampleDataProvider;
import GenricUtilities.WebDriverUtility;

public class LoginPage 
{
	/*Description: This Page is use for Login The Application
	 * @Author Shobha
	 * @param
	 * */
	JsonFileUtility json = new JsonFileUtility();
	 WebDriverUtility web = new  WebDriverUtility();
	 ExcelFileUtility sp = new ExcelFileUtility();
			 
	 WebDriver driver = null;
	public LoginPage(WebDriver driver)
	{
		this .driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* mouse Over on LoginIcon*/
	@FindBy(xpath="//a[@class='hd-icon-cta hd-profile-cta']")
	private WebElement mouseOvrIcn;
	
	
	/* Click Login Button */
	@FindBy(id="registerPopupLink")
	private WebElement Btnlogin;
	
	/*Login Button*/
	@FindBy(xpath="(//a[@data-modal=\"loginModal\"])[1]")
	private WebElement Btnuser1;
	
	/* text field user name */
	@FindBy(xpath="//input[@name='user[new]']")
	private WebElement tfUserName;
	
	
	/* text field password */
	@FindBy(id="password")
	private WebElement tfpawd;
	
	/*Login Button*/
	@FindBy(id="formSubmit-popup_login_username_form")
	private WebElement Butnlogin;
	
	public void Login(WebDriver driver) throws Throwable
	{
		web.mouseOver(driver, mouseOvrIcn);
		web.ClickableElement(driver, Btnlogin);
		
		//web.waitForElementClickable(driver, Btnuser1);
		web.ClickableElement(driver, Btnuser1);
		tfUserName.sendKeys(json.readDataFromJSon("username"));
		tfpawd.sendKeys(json.readDataFromJSon("Password"));
		web.ClickableElement(driver, Butnlogin);
		
	}
	

}
