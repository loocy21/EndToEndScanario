package Pom_Page_MAX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This method contains end to end scenario
 * @author Shobha
 *
 */

public class SearchProduct 
{


	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public SearchProduct(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* text field search box */
	@FindBy(name="q")
	private WebElement clkOnCategeory;
	
	/* select autoSuggestion  */
	private WebElement selectAS(String autoSuggestion) {
		String xpathValue1 ="//div[text()='"+autoSuggestion+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/*filter the browse */
	private WebElement filterBrowser(String filterBrowse) {
		String xpath ="//div[text()='"+filterBrowse+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter size */
	private WebElement seltBrowse(String selectBrowse) {
		String xpath ="//div[text()='"+selectBrowse+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter colour */
	private WebElement filtrSize(String filterSize) {
		String xpath ="//div[text()='"+filterSize+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter discount */
	private WebElement seltSize(String selectSize) {
		String xpath ="//div[text()='"+selectSize+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* button filter discount */
	private WebElement filterDisc(String filterDiscouont) {
		String xpath ="//div[text()='"+filterDiscouont+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter discount */
	private WebElement seltDisc(String selectDiscount) {
		String xpath ="//div[text()='"+selectDiscount+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* button dress name for validation */
	private WebElement FilteredProduct(String actualDressName) {
		String xpath ="//a[text()='"+actualDressName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* click first product*/
	@FindBy(xpath="//img[@alt='MAX Washed Denim Shorts with Chain Belt']")
	private WebElement clkProduct;
	
	/* button dress name */
	private WebElement FilteredName(String dressName) {
		String xpath ="//img[@alt='"+dressName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/*Button add to cart */
	private WebElement addToBag(String addProduct) {
		String xpathValue1 ="//span[text()='"+addProduct+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	/*button select size*/
	private WebElement chooseSize(String selectSize1) {
		String xpathValue1 ="//span[text()='"+selectSize1+"']";
		return driver.findElement(By.xpath(xpathValue1));
		}
	
	/**
	 * Description:Method is used for search and filter the dress
	 * @author Shobha
	 * @param search
	 * @param autoSuggestion
	 * @param filterBrowse
	 * @param selectBrowse
	 * @param filterSize
	 * @param selectSize
	 * @param filterDiscouont
	 * @param selectDiscount
	 * @throws Throwable
	 */
	public void searchApplyFilter(String search	,String autoSuggestion,String filterBrowse	,String selectBrowse	
			,String filterSize,String selectSize,String	filterDiscouont,String	selectDiscount) throws Throwable
	{
	    try {
		clkOnCategeory.sendKeys(search);
		web.mouseOver(driver, selectAS(autoSuggestion));
		selectAS(autoSuggestion).click();
		filterBrowser(filterBrowse).click();
		seltBrowse(selectBrowse).click();
		filtrSize(filterSize).click();
		seltSize(selectSize).click();
	
		filterDisc(filterDiscouont).click();
		seltDisc(selectDiscount).click();
		System.out.println("===able to search product and apply filter Succesfully===");
		}catch(Exception e)
		{
			System.out.println("not able to search product and apply filter");
			Assert.fail("not able to search product and apply filter");
		}
		
		
}
	/**
	 * Description:Method is used for click the filtered dress
	 * @author Shobha
	 * @param dressName
	 * @throws Throwable
	 */
	public void clkFirstProduct(String dressName) throws Throwable
	{
		try {
		web.ScrollDown(driver);
		web.mouseOver(driver, FilteredName(dressName));
		web.ClickableElement(driver, FilteredName(dressName));
		System.out.println("===able to click the product Succesfully===");
		}catch(Exception e)
		{
			System.out.println("not able to click the product Succesfully");
			Assert.fail("not able to  click the product Succesfully");
		}
		
	}
	/**
	 * Description:Method is used for validate the actual name
	 * @author Shobha
	 * @param actualDressName
	 */
	public void validateFilteredJeans(String actualDressName)
	{
		try 
		{
			System.out.println(FilteredProduct(actualDressName).getText());
			String jeansName = "MAX Washed Denim Shorts with Chain Belt";

			Assert.assertEquals(FilteredProduct(actualDressName).getText(), jeansName);
			System.out.println("Able to verify dress name");
		}
		catch(Exception e) 
		{
			System.out.println("unable to  verify  dress name ");
			Assert.fail("unable to verify  dress name ");
		}
		clkProduct.click();
	} 
	/**
	 * Description:Method is used for switch the window and add to cart 
	 * @author Shobha
	 * @param addProduct
	 * @param selectSize1
	 */
	public void switchToWindow(String addProduct,String selectSize1 )
	{
		try {
		Thread.sleep(6000);
	     web.switchToWindow(driver, "1000008640709-Blue-LightBlue | Shorts &amp; Skirts | Bottoms | Women | Online Shopping at Max");

		web.waitForElementClickable(driver,  chooseSize(selectSize1));
	
		web.ClickableElement(driver, chooseSize(selectSize1));
	
	
		Thread.sleep(3000);
		addToBag(addProduct).click();
		System.out.println("===able to switch the window and add to cart Succesfully===");
		}catch(Exception e)
		{
			System.out.println("not able to switch the window and add to cart");
			
		}
	}
	}



	
	
	
	
	


	
	
	
	
	
	
	
	

	
	
	

	

	
	
	

	
	
	
	
