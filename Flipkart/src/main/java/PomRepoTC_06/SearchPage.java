package PomRepoTC_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page is used for search Product
 * @author Shobha
 *
 */

public class SearchPage
{
	WebDriverUtility web = new WebDriverUtility();
	JsonFileUtility jsonLib = new JsonFileUtility();
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* Search Text Field */
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	private WebElement searchBox;

	/*SearchBar Box */
	@FindBy(xpath="//a[@class='desktop-submit']")
	private WebElement searchBar;

	/* scroll bar */
	@FindBy(xpath="//span[text()='Discount Range']")
	private WebElement scrollBar; 

	/* CheckBox Click */
	@FindBy(xpath="//label[text()='10% and above']")
	private WebElement clickBox;

	/* logo Click*/
	@FindBy(xpath="//h4[text()='Better Cotton Initiative']")
	private WebElement clicklogo;

	/* Check Box click */
	@FindBy(xpath="//label[text()='Better Cotton Initiative']")
	private WebElement clickCheckBox;

	/* Product click */
	@FindBy(xpath="//h4[text()='Women High-Rise Boyfriend Jeans']")
	private WebElement clickFirstPrdt;

	/* Size Button */
	@FindBy(xpath="//p[text()='26']")
	private WebElement selectSize;

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
	 * Description:Method is used for Search Product
	 * @author Shobha
	 * @throws Throwable
	 */

	public void searchPage() throws Throwable
	{
		try {
			searchBox.sendKeys(jsonLib.readDataFromJSon("name1"));
			searchBar.click();
			web.scrollBar(driver, scrollBar);
			web.ClickableElement(driver, clickBox);
			web.ClickableElement(driver, clicklogo);
			web.ClickableElement(driver, clickCheckBox);
			web.ClickableElement(driver, clickFirstPrdt);
			System.out.println("product searched succesfully");
		}catch(Exception e)
		{
			System.out.println("product not search");
			Assert.fail("product not search");
		}

	}

	/**
	 * Description:handling new window and add to Cart Product
	 * @author Shobha
	 * @param driver
	 */
	public void newTab(WebDriver driver)
	{
		try {
			web.switchToWindow(driver, "Buy DressBerry Women Stunning Blue High Rise Boyfriend Fit Stretchable Jeans");
			selectSize.click();
			clickATC.click();
			clickBag.click();
			web.ClickableElement(driver, clickPlaceOrder);
			System.out.println("window handled succesfully");
		}catch(Exception e)
		{
			System.out.println("new window not handled");
			Assert.fail("new window not handled");
			{


			}

		}
	}
}





















































