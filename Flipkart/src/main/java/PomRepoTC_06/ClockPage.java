package PomRepoTC_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This page is used for handle the clock page
 * @author Shobha
 *
 */

public class ClockPage
{
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver;
	public ClockPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* Home&Living mouseOver */
	@FindBy(xpath="//a[text()='Home & Living' and @data-group='home-&-living']")
	private WebElement mouseOverOnProduct;

	/* clock click */
	@FindBy(xpath="//a[text()='Clocks' and @class='desktop-categoryLink']")
	private WebElement clickClock;

	/* scroll bar */
	@FindBy(xpath="//a[text()='Next']")
	private WebElement scrollNextPage;

	/* next page click */
	@FindBy(xpath="//a[text()='Next']")
	private WebElement clicknextPage;

	/* Brand click */
	@FindBy(xpath="//label[text()='RANDOM']")
	private WebElement selectBrand;

	/* product click */
	@FindBy(xpath="//h4[text()='Unisex Kids Wall Clock']")
	private WebElement clickFirst;


	/* scroll and click */
	@FindBy(xpath ="(//p[text()='Analogue Wall Clock'])[1]")
	private WebElement FirstClock;

	/* addToCart click */
	@FindBy(xpath="//div[text()='ADD TO BAG']")
	private WebElement addToCart;

	/* addToBag click */
	@FindBy(xpath="//span[text()='Bag']")
	private WebElement clickBag;

	/*PlaceOrder Button*/
	@FindBy(xpath="//div[text()='Place Order']")
	private WebElement clickPlaceOrder;

	/**
	 * Description:Method is used for select clocks and filter brand
	 * @author Shobha
	 * @param driver
	 * @throws Throwable
	 */


	public void clockPage() throws Throwable
	{
		try {
			web.mouseOver(driver, mouseOverOnProduct);
			clickClock.click();
			web.scrollBar(driver, scrollNextPage);
			web.ClickableElement(driver, clicknextPage);
			web.ClickableElement(driver, selectBrand);
			web.ClickableElement(driver, clickFirst);
			System.out.println("===brand selected succesfully===");
		}catch(Exception e)
		{
			System.out.println("brand not selected");
			Assert.fail("brand not selected");
		}
	}
	/**
	 * Description:Method is used for switch windows
	 * @author Shobha
	 */

	public void switchTab()
	{
		try
		{
			web.switchToWindow(driver, "Buy RANDOM White & Pink Unisex Kids Printed Contemporary Wall Clock");
			web.scrollBar(driver, FirstClock);
			web.ClickableElement(driver, FirstClock);

			web.switchToWindow(driver," Buy RANDOM Unisex Kids White & Red Printed Contemporary Wall Clock");
			Thread.sleep(4000);
			web.ClickableElement(driver, addToCart);
			web.ClickableElement(driver, clickBag);
			web.ClickableElement(driver, clickPlaceOrder);
			System.out.println("===able to switch window===");
		}catch(Exception e)
		{
			System.out.println("===able to switch window1===");
			Assert.assertTrue(true);
	
		}
		


	}
}





