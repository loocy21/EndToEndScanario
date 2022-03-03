package Pom_Class_Meesho;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilities.WebDriverUtility;

public class Product_Page {

	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Product_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* search text field */
	@FindBy(xpath="//span[text()='Jewellery & Accessories']")
	private WebElement mouseOver;

	/*xpath for text field */
	public WebElement mouseOver(String product) {
		String xpathValue ="//span[text()='product']";
		return driver.findElement(By.xpath(xpathValue));
	}
	public WebElement clkOne(String categeory) {
		String xpathValue ="//p[text()='Sunglasses']";
		return driver.findElement(By.xpath(xpathValue));
	}
	@FindBy(xpath="//div[@class='sc-bdvvtL ProductList__PLPContainer-sc-8lnc8o-1 byHcNc eVzmpH']")
	private List<WebElement> allSunglassName;
	
	public WebElement scroll(String selectOne) {
		String xpathValue ="//h5[text()='"+selectOne+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	@FindBy(xpath="//img[@class='ProductCard__ProductImage-sc-camkhj-1 dRbiYq']")
	private WebElement getColour;
	
	/* button add to cart */
	public WebElement btnATC(String button) {
		String xpathValue ="//span[text()='"+button+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	

	public void getTextProductName(String product,String categeory) throws Throwable
	{
		web.mouseOver(driver, mouseOver);
		clkOne(categeory).click();
		
	}
	/**
	 * Description:Method is used for get all text of sunglasses 
	 * @author Shobha
	 */
	public void getText()
	{
	try {
		web.waitForPageLoad(driver);
		
		
		List<WebElement> list =allSunglassName;
		for(WebElement ele:list)
		{
			String s = ele.getText();
			
			System.out.println(s);
			
		}
		System.out.println("=======get all text Succesfully======");
		}catch(Exception e) {
		System.out.println("======not able to get all text====");
		Assert.fail("not able to get all text");
	}
	}
	/**
	 * Description:Method is used for validate the sunglass page
	 * @author Shobha
	 */
	public void validatePage()
	{
		try 
		{
			String actualTitle = "Women Sunglasses - Buy Goggles for Women Online at Best Price | Meesho";
			String expectedTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Able to verify sunglasses Page");
		}
		catch(Exception e) 
		{
			System.out.println("unable to verify sunglasses Page");
			Assert.fail("unable to verify verify sunglasses Page ");
		}
	}
	public void scrollDown(String  selectOne) throws Throwable
	{
		web.ScrollDown(driver);
		scroll(selectOne).click();
	}
	/**
	 * Description:Method is used for validate the colour of sunglass
	 * @author Shobha
	 * @param colour
	 */
	public void validateColour(String colour)
	{
		try 
		{ 
			String color = getColour.getCssValue("colour");
			System.out.println(color);
			Assert.assertEquals(getColour.getText(),"colour", colour);
		    System.out.println("Able to verify color of sunglass");
		}
		catch(Exception e)
		{
			System.out.println("Unable to verify color of sunglass");
			Assert.fail("Unable verify color of sunglass");
		}
	}
		
		public void btnAddTocart(String button)
		{
			try {
				btnATC(button).click();
				System.out.println("able to add to cart");
				}catch(Exception e) {
					System.out.println("unable to add to cart");
					Assert.fail("unable to add to cart");
		}
	 }	
		 
	}

	
		
			
	
	

	
	

