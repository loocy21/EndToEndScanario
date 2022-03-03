package Pom_Page_MAX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class Boys_Page 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Boys_Page(WebDriver driver)
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
		String xpath ="(//span[text()='"+selectType+"'])[4]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter size */
	private WebElement seltOne(String shop) {
		String xpath ="(//a[text()='"+shop+"'])[5]";
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
	 * Description:Method is used for click logo search and apply filter 
	 * @author Shobha
	 * @param Category
	 * @param selectType
	 * @param shop
	 * @param filterPrice
	 * @param filterType
	 * @param selecttype
	 * @param filterDesign
	 * @param selectDesign
	 * @param dressName
	 * @param selectSize
	 * @param addProduct
	 * @throws Throwable
	 */
public void filterBoysdress(String Category,String	selectType	,String shop,String	filterPrice,String 	filterType,String	selecttype,
		String filterDesign	,String selectDesign,	String dressName	,String selectSize	,String addProduct) throws Throwable

{
	try {
		selectAS(Category).click();
		Thread.sleep(3000);
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
 * Description:Method is used for switch the window and add to cat
 * @author Shobha
 * @param dressName
 * @param seltSize
 * @param addProduct
 * @throws Throwable
 */
public void switchingWindow(String dressName ,String seltSize,String addProduct) throws Throwable
{
	clkFirst(dressName).click();
	try {
    Thread.sleep(6000);
	web.switchToWindow(driver, "1000010503832-Blue-NAVY | Jackets | Indian Wear | Boys | Online Shopping at Max");
	web.waitForElementClickable(driver,  chooseSize(seltSize));
     web.ClickableElement(driver, chooseSize(seltSize));
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


