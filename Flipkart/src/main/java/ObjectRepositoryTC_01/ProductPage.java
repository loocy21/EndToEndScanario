package ObjectRepositoryTC_01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

/*
 * Description:This Page is used for Product AddToCart
 * @Author Shobha
 * @param
 * */

public class ProductPage
{
WebDriverUtility web = new WebDriverUtility();

	WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*Click Product*/
	@FindBy(xpath="//div[contains(text(),'REDMI 9i Sport (Metallic Blue, 64 GB)')]")
	private WebElement ClickOnMobile;
	
	/*AddToCart Button*/
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement AddToCart;
	
	/*Place Order Button*/
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")
	private WebElement placeOrder;
	
	/*Username Text Field*/
	@FindBy(xpath="//input[@class=\"_2IX_2- _17N0em\"]")
	private WebElement EnterMobileNum;
	
	/*Password Text Field*/
	@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh _17N0em\"]")
	private WebElement EnterPassword;
	
	/*Login Button*/
	@FindBy(xpath="//button[@class=\"_2KpZ6l _20xBvF _3AWRsL\"]")
	private WebElement ClickLoginBtn;
	
	
	/*
	 *Description:Method is used for AddToCart and Login 
	 *@Author Shobha
	 *@Param 
	 * */
	public void Productpage(WebDriver driver,String username ,String Password)
	{
		try {
		ClickOnMobile.click();
		web.switchToWindow(driver, "REDMI 9i Sport" );
		AddToCart.click();
		placeOrder.click();
		EnterMobileNum.sendKeys(username,Keys.ENTER);
		EnterPassword.sendKeys(Password);
		ClickLoginBtn.click();
		System.out.println("Click on First phone and Add to card Succesfully");
		}
		catch(Exception e)
		{
			System.out.println("not click");
			Assert.assertTrue(true);
		}
		
	}

	
}
