package PomRepoTC_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;
/**
 * LoginPage
 * Description:This page is used for Login The Application
 * @author Shobha
 *
 */

public class LoginPage 
{
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

	/* Product Click */
	@FindBy(xpath="//img[@src=\"https://assets.myntassets.com/w_245,c_limit,fl_progressive,dpr_"
			+ "2.0/assets/images/2022/1/25/ecb6ec02-06c3-4cbf-a60c-bd27eb962e1e1643087844855-Top-Banner_02.jpg\"]")
	private WebElement imgScrollBar;

	/* mouseOver on Filter */
	@FindBy(xpath="//div[@class='sort-sortBy']")
	private WebElement filterOption;

	/* Click Price */
	@FindBy(xpath="//label[text()='Price: High to Low']")
	private WebElement selectPrice;

	/* Click Product */
	@FindBy(xpath="//img[@alt='Mitera Women Blue & Pink Floral Pure Silk Hand Woven Jamdani Saree']")
	private WebElement clickFirstProduct;

	/*Get Text Product*/
	@FindBy(xpath="//h1[@class='pdp-name']")
	private WebElement getTextProduct;

	/*Click wishList*/
	@FindBy(xpath="//span[text()='WISHLIST']")
	private WebElement addWishlist;

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
			usernameBox.sendKeys(jsonLib.readDataFromJSon("username"));
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
	/**
	 * Description:Method is used for searchProduct and switchWindow
	 * @author Shobha
	 * @throws Throwable
	 */

	public void SearchProduct() throws Throwable
	{

		try {
			web.ClickableElement(driver, imgScrollBar);
			web.mouseOver(driver, filterOption);
			selectPrice.click();
			clickFirstProduct.click();
		}catch(Exception e)
		{
			System.out.println("first product not click");
			Assert.fail("first product not click");
		}
	}
	public void getText()
	{
		try {

			/*switch window one to another Page*/
			web.switchToWindow(driver, "Buy Mitera Women Blue & Pink Floral Pure Silk Hand Woven Jamdani Saree");
			WebElement lst=getTextProduct;
			System.out.println(lst.getText());

			addWishlist.click();
			System.out.println("search product switch window Successfully");
		}catch(Exception e)
		{
			System.out.println("search product switch window not Successfully");
			Assert.fail("search product switch window not Successfully");
		}

	}

}

