package ElementRepoTC_02.java;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class ProductLandingPage 
{
	/*
	 * Description:This page is used for ProductDescriptionPage
	 * @Author Shobha
	 * @param
	 * */
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;
	public ProductLandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*Click Button*/
	@FindBy(xpath="//div[contains(text(),'MSI GF63 Thin Core i7 10th Gen - (16 GB/512 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce RTX 30...')]")
	private WebElement SelectFirstLaptop;
	
	/*AddToCart Button*/
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement AddToCart;
	
	/*PlaceOrder Button*/
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")
	private WebElement placeOrder;
	
	/*MobileNum text Field*/
	@FindBy(xpath="//input[@class=\"_2IX_2- _17N0em\"]")
	private WebElement EnterMobileNum;
	
	/*Password Text Field*/
	@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh _17N0em\"]")
	private WebElement EnterPassword;
	
	/* Login Button*/
	@FindBy(xpath="//button[@class=\"_2KpZ6l _20xBvF _3AWRsL\"]")
	private WebElement ClickLoginBtn;
	
	
	
	
	public void ProductPage(WebDriver driver, String username ,String Password)
	{
		/*
		 * validate the HomePage
		 * */
		String actualtitle1 = "Laptop- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		String expectedtitle1 =driver.getTitle();
		assertEquals(actualtitle1, expectedtitle1);
		System.out.println("actualtitle1="+actualtitle1);
		/*
		 * Description:method to AddToCart Product
		 * @Author Shobha
		 * @param
		 * */
		try {
		SelectFirstLaptop.click();
		web.switchToWindow(driver, "MSI GF63 Thin Core i7 10th Gen");
		web.waitForPageLoad(driver);
		AddToCart.click();
		placeOrder.click();
		
		EnterMobileNum.sendKeys(username,Keys.ENTER);
		EnterPassword.sendKeys(Password);
		ClickLoginBtn.click();
		System.out.println("After Seaching Product able to Product Add to cart");
		}catch(Exception e)
		{
			System.out.println("not able to Add to cart");
			Assert.fail("not able to Add to cart");
		}
		
		/*
		 * validate the Product Landing PAge
		 * @Author Shobha
		 * */
		String actualtitle = "Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order";
		String expectedtitle =driver.getTitle();
		assertEquals(actualtitle, expectedtitle);
		System.out.println("actualtitle="+actualtitle);
		
		
		
		
	}
}
