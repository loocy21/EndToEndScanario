package Pom_Page_MAX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class Girl_Page 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Girl_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	/* select autoSuggestion  */
	private WebElement selectAS(String logo) {
		String xpathValue1 ="//span[text()='"+logo+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/*filter the browse */
	private WebElement headers(String value) {
		String xpath ="(//span[text()='"+value+"'])[3]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter size */
	private WebElement seltOne(String value2) {
		String xpath ="(//a[text()='"+value2+"'])[2]";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter colour */
	private WebElement filtrPrice(String filterPrice) {
		String xpath ="//div[text()='"+filterPrice+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter discount */
	private WebElement filterDesign(String filterDesign) {
		String xpath ="//div[text()='"+filterDesign+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* button filter discount */
	private WebElement seltDesign(String selectDesign) {
		String xpath ="//input[@value='"+selectDesign+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter discount */
	private WebElement filterColour(String filterColour) {
		String xpath ="//div[text()='"+filterColour+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* button dress name for validation */
	private WebElement selectColour(String selectColour) {
		String xpath ="//input[@value='"+selectColour+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter discount */
	private WebElement filterSize(String filterSize) {
		String xpath ="//div[text()='"+filterSize+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* button filter discount */
	private WebElement selectSize(String selectSize) {
		String xpath ="//input[@value='"+selectSize+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* button filter discount */
	private WebElement filterPromo(String filterPromo) {
		String xpath ="//div[text()='"+filterPromo+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* button dress name for validation */
	private WebElement selectPromo(String selectPromo) {
		String xpath ="//input[@value='"+selectPromo+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	@FindBy(xpath="//a[text()='MAX Printed Full Sleeves Casual Shirt']")
	private WebElement clkfirst;
	
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
	 * Description:Method for filter the product by price or design
	 * @author Shobha
	 * @param logo
	 * @param value
	 * @param value2
	 * @param filterPrice
	 * @param filterDesign
	 * @param selectDesign
	 * @throws Throwable
	 */
	public void selectlogoApplyFilter(String logo,String value,String value2,String	filterPrice,String filterDesign	,String selectDesign) throws Throwable
	{
		try {
		selectAS(logo).click();
		
		web.mouseOver(driver, headers(value));
		seltOne(value2).click();
		filtrPrice(filterPrice).click();
		filterDesign(filterDesign).click();
		seltDesign(selectDesign).click();
		System.out.println("able to filter the product by price or design");
		}catch(Exception e) {
			System.out.println("unaable to filter the product by price or design");
			Assert.fail("unable to filter the product by price or design");
		}
		}
	/**
	 * Description:Method is used for filter the product by colour or size
	 * @author Shobha
	 * @param filterColour
	 * @param selectColour
	 * @param filterSize
	 * @param selectSize
	 * @param filterPromo
	 * @param selectPromo
	 */
		
		public void applyFilter(String	filterColour,String	selectColour,String	filterSize	,String selectSize	,String filterPromo	,String selectPromo)
		{
			
		try {
		filterColour(filterColour).click();
		selectColour(selectColour).click();
		filterSize(filterSize).click();
		selectSize(selectSize).click();
		filterPromo(filterPromo).click();
		selectPromo(selectPromo).click();
		System.out.println("able to filter the product by colour or size");
		}catch(Exception e) {
			System.out.println("unaable to filter the product by colour or size");
			Assert.fail("unable to filter the product by colour or size");
		}
	}
		/**
		 * Description:Method is used for validate the name of filtered product 
		 * @author Shobha
		 */
	public void validateFilter()
	{
		try 
		{	
			System.out.println(clkfirst.getText());
			String dressName = "MAX Printed Full Sleeves Casual Shirt";
			Assert.assertEquals(clkfirst.getText(), dressName);
			clkfirst.click();	
			System.out.println("Able to verify actual Filtered ");
		}
		catch(Exception e) 
		{
			System.out.println("unable to  verify actual Filtered ");
			Assert.fail("unable to verify actual Filtered ");
		}
		
	}
/**
 * Description:Method is used for switch the window and add to cart
 * @author Shobha
 * @param seltSize
 * @param addProduct
 * @throws Throwable
 */
	public void switchingWindow(String seltSize,String addProduct) throws Throwable
	{
		try {
	    Thread.sleep(6000);
		web.switchToWindow(driver, "1000009926763-Pink-Peachap | Shirts | Tops | Girls | Online Shopping at Max");
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