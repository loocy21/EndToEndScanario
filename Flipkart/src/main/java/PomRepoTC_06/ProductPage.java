package PomRepoTC_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This page is used for find product
 * @author Shobha
 *
 */

public class ProductPage
{
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* Product mouseOver */
	@FindBy(xpath="//a[text()='Women' and @class='desktop-main']")
	private WebElement mouseOver;
	
	/* Product Click */
	@FindBy(xpath="//a[text()='Indian & Fusion Wear']")
	private WebElement clickText;
	
	/* CheckBox click */
	@FindBy(xpath="//label[text()='Mitera']")
	private WebElement checkBox;
	
	/* Bundle Click */
	@FindBy(xpath="//h4[text()='Bundles']")
	private WebElement clickBundle;
	
	/* Filter Product */
	@FindBy(xpath ="//div[@class='sort-sortBy']")
	private WebElement filterProduct;
	
	/* Discount option click*/
	@FindBy(xpath="//label[text()='Better Discount']")
	private WebElement clickDiscount;
	
	/*First Product click */
	@FindBy(xpath="(//h4[text()='Striped Pure Georgette Saree'])[1]")
	private WebElement clickFirst;
	
	/*AddToCart Button*/
	@FindBy(xpath="//div[text()='ADD TO BAG']")
	private WebElement clickATC;

	/*Bag Button*/
	@FindBy(xpath="//span[text()='Bag']")
	private WebElement clickBag;

	/*PlaceOrder Button*/
	@FindBy(xpath="//div[text()='Place Order']")
	private WebElement clickPlaceOrder;
	
	/**
	 * Description:Method is used for seach product
	 * @author Shobha
	 * @param driver
	 * @throws Throwable
	 */
	public void findProduct() throws Throwable
	{
		try {
		web.mouseOver(driver, mouseOver);
		clickText.click();
		checkBox.click();
		clickBundle.click();
		web.mouseOver(driver, filterProduct);
		clickDiscount.click();
		clickFirst.click();
		System.out.println("=====product found succesfully======");
		
		}catch(Exception e)
		{
			System.out.println("===order not finded===");
			Assert.fail("order not finded");
		}
		
	}
	/**
	 * Description:Method is used for handle window
	 * @author Shobha
	 * @param driver
	 */
	public void WindowHandle()
	{
		try {
		web.switchToWindow(driver, "Buy Mitera Beige & Red Striped Pure Georgette Saree  - Sarees for Women 16310984 | Myntra");
		clickATC.click();
		clickBag.click();
		web.ClickableElement(driver, clickPlaceOrder);
		System.out.println("====order placed succesfully====");
		}catch(Exception e)
		{
			System.out.println("==== order not placed ====");
			Assert.fail("order not placed");
		}
	}
	
		
		
	}

	


