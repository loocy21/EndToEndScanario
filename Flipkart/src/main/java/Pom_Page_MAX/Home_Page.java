package Pom_Page_MAX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

/**
 * Description:This page contains search product and filter product and add to cart
 * @author Shobha
 *
 */

public class Home_Page 
{
	
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* button woman */
	@FindBy(xpath="//span[text()='Women']")
	private WebElement clkOnCategeory;
	
	
	
	/*xpath for select gender*/
	private WebElement selectGndr(String gender) {
		String xpathValue1 ="//span[text()='"+gender+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	

	/* button Shop for */
	private WebElement seltShop(String ShopFor) {
		String xpath ="//div[text()='"+ShopFor+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Button filter browse */
	@FindBy(xpath="//div[text()='Browse']")
	private WebElement clkBrowser;
	
	/*filter the browse */
	private WebElement filterBrowser(String filterBrowse) {
		String xpath ="//div[text()='"+filterBrowse+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	
	/* button Size */
	@FindBy(xpath="//div[text()='Size']")
	private WebElement btnSize;
	
	/* button filter size */
	private WebElement filterSize(String filterSize) {
		String xpath ="//div[text()='"+filterSize+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button colour */
	@FindBy(xpath="//div[text()='Color']")
	private WebElement btnColour;
	
	
	/* button filter colour */
	private WebElement filterColour(String filterColour) {
		String xpath ="//div[text()='"+filterColour+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button Fit */
	@FindBy(xpath="//div[text()='Fit']")
	private WebElement btnDiscount;
	
	/* button filter discount */
	private WebElement filterDisc(String discount) {
		String xpath ="//div[text()='"+discount+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button first dress*/
	private WebElement clkFirst(String dressName) {
		String xpath ="(//img[@alt='"+dressName+"'])[1]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*Button add to cart */
	private WebElement addToBag(String addProduct) {
		String xpathValue1 ="//span[text()='"+addProduct+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	/*button size*/
	private WebElement chooseSize(String selectSize) {
		String xpathValue1 ="//span[text()='"+selectSize+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	/**
	 * Description:Method is used for select gender and filter the product
	 * @author Shobha
	 * @param gender
	 * @param ShopFor
	 * @param filterBrowse
	 * @param filterSize
	 * @param filterColour
	 * @param discount
	 * @param dressName
	 * @throws Throwable
	 */

	

	public void selectProduct(String gender,String ShopFor	,String filterBrowse,String filterSize	,String filterColour,String discount,String dressName ) throws Throwable
	{
	
		try {
		selectGndr(gender).click();
		
		web.ScrollDown(driver);
	
		web.ClickableElement(driver, seltShop(ShopFor));
		web.ClickableElement(driver, clkBrowser);
	
		web.ClickableElement(driver, filterBrowser(filterBrowse));
	    web.ClickableElement(driver, btnSize);
		web.ClickableElement(driver, filterSize(filterSize));
		web.ClickableElement(driver, btnColour);
		web.ClickableElement(driver, filterColour(filterColour));
		web.ClickableElement(driver, btnDiscount);
		web.ClickableElement(driver, filterDisc(discount));
		web.ClickableElement(driver, clkFirst(dressName));
		System.out.println("===able to search product and apply filter Succesfully===");
		}catch(Exception e)
		{
			System.out.println("not able to search product and apply filter");
			Assert.fail("not able to search product and apply filter");
		}
	}
	
	public void validateaddToCartPage()
	{
		try {
			String actualName = "Indian Wear | Women";
			String expectedName = driver.getTitle();
			Assert.assertEquals(actualName, expectedName);
			System.out.println("actualName="+actualName);
			System.out.println(" add to cart page validate succesfully ");
			}catch(Exception e)
			{
				System.out.println("unable to validate add to cart page ");
				Assert.fail("unable to validate add to cart page ");
			}
	}
	/**
	 * Description:Method is used for switch the new window and select size and add to cart
	 * @author Shobha
	 * @param filterSize
	 * @param addProduct
	 * @param selectSize
	 * @throws Throwable
	 */
	
	public void switchingWindow(String filterSize,String addProduct,String selectSize) throws Throwable
	{
		try {
	    Thread.sleep(6000);
		web.switchToWindow(driver, "1000010834788-Green-Emerald | Mixnmatch | Women | Online Shopping at Max");
		
		web.waitForElementClickable(driver,  chooseSize(selectSize));
	
		web.ClickableElement(driver, chooseSize(selectSize));
		Thread.sleep(3000);
		addToBag(addProduct).click();
		System.out.println("===able to switch the window and add to cart Succesfully===");
		}catch(Exception e)
		{
			System.out.println("not able to switch the window and add to cart");
			Assert.fail("not able to switch the window and add to cart");
		}
		
	}
}
