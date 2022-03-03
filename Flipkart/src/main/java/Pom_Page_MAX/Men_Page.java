package Pom_Page_MAX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class Men_Page 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Men_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	/* select autoSuggestion  */
	private WebElement selectAS(String Category) {
		String xpathValue1 ="//span[text()='"+Category+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/*filter the browse */
	private WebElement headers(String selectType) {
		String xpath ="(//span[text()='"+selectType+"'])[2]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter size */
	private WebElement seltOne(String shop) {
		String xpath ="//a[text()='"+shop+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter colour */
	private WebElement filtrPrice(String filterPrice) {
		String xpath ="//div[text()='"+filterPrice+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter discount */
	private WebElement filtertype(String filterType) {
		String xpath ="//div[text()='"+filterType+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* button filter discount */
	private WebElement seltType(String selecttype) {
		String xpath ="//input[@value='"+selecttype+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter discount */
	private WebElement filterDesign(String filterDesign) {
		String xpath ="//div[text()='"+filterDesign+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* button dress name for validation */
	private WebElement selectDesign(String selectDesign) {
		String xpath ="//input[@value='"+selectDesign+"']";
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
	 * Description:Method is used for search and filter the product
	 * @author Shobha
	 * @param Category
	 * @param selectType
	 * @param shop
	 * @param filterPrice
	 * @param filterType
	 * @param selecttype
	 * @param filterDesign
	 * @param selectDesign
	 * @throws Throwable
	 */
	public void selectBrandandfilter(String Category,String	selectType,String shop,String	filterPrice,String	filterType,String	selecttype,String filterDesign,String	selectDesign) throws Throwable
	{
		try {
		selectAS(Category).click();
		
		web.mouseOver(driver, headers(selectType));
		seltOne(shop).click();
		filtrPrice(filterPrice).click();
		filtertype(filterType).click();
		seltType(selecttype).click();
		filterDesign(filterDesign).click();
		selectDesign(selectDesign).click();
		System.out.println("===able to search product and apply filter Succesfully===");
		}catch(Exception e)
		{
		System.out.println("not able to search product and apply filter");
		Assert.fail("not able to search product and apply filter");
	}
	}
	/**
	 * Description:Method is used forswitch the window select size and add to cart
	 * @author Shobha
	 * @param dressName
	 * @param selectSize
	 * @param addProduct
	 */
	public void clkProduct(String dressName	,String selectSize	,String addProduct)
	{
		try {
			clkFirst(dressName).click();
		    Thread.sleep(6000);
			web.switchToWindow(driver, "1000010861461-Green-TEAL | Young | Men | Online Shopping at Max");
			
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

