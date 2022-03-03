package Pom_Page_Bigbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains mouseOver on sweet and apply filter and addto cart
 * @author Shobha
 *
 */

public class Sweet_Page
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Sweet_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	/* select mouseOver */
	private WebElement selectCat(String category) {
		String xpathValue1 ="//a[text()='"+category+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/*button sweet */
	private WebElement selectTy(String selectType) {
		String xpath ="//span[text()='"+selectType+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* scroll down page */
	private WebElement scrollBar(String scroll) {
		String xpath ="//div[text()='"+scroll+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*filter the brand */
	private WebElement filterBrand(String brand) {
		String xpath ="//span[text()='"+brand+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* scroll down */
	private WebElement filterType1(String filterType) {
		String xpath ="(//div[@class='"+filterType+"'])[3]";
		return driver.findElement(By.xpath(xpath));
	}
	/* button filter type  */
	private WebElement filterType(String types) {
		String xpath ="//span[text()='"+types+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button filter size */
	private WebElement filterSize(String size) {
		String xpath ="//span[text()='"+size+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button filter discount */
	private WebElement filterDisc(String discount) {
		String xpath ="//span[text()='"+discount+"']";
		return driver.findElement(By.xpath(xpath));
	}
     /*validate sweet name*/
	@FindBy(xpath="//span[text()='Lal Sweets Dryfruit Halwa - Aromatic']")
	private WebElement validateName;
	
	/*get text sweet name*/
	private WebElement sweetName(String sweetName) {
		String xpath ="//span[@title='"+sweetName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button add to basket */
	private WebElement addButton(String addItem) {
		String xpath ="//span[text()='"+addItem+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button add  */
	private WebElement addintoCart(String addToCart) {
		String xpath ="//span[text()='"+addToCart+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/**
	 * Description:Method is used for mouseOver into sweet
	 * @author Shobha
	 * @param category
	 * @param selectType
	 * @param scroll
	 * @param brand
	 * @param filterType
	 * @param types
	 * @throws Throwable
	 */
	public void mouseOverAndFilter(String category	,String selectType	,String scroll,String brand	,String filterType,String types) throws Throwable
	{
		try {
			
			web.mouseOver(driver, selectCat(category));
			Thread.sleep(5000);
			web.mouseOver(driver, selectTy(selectType));
			web.ClickableElement(driver, selectTy(selectType));
		
			web.scrollBar(driver, scrollBar(scroll));
			web.ClickableElement(driver, filterBrand(brand));
			web.scrollBar(driver, filterType1(filterType));
			Thread.sleep(3000);
			web.ClickableElement(driver, filterType(types));
			System.out.println("able to mouseOver shopby and select item");
		}catch(Exception e) 
		{
			System.out.println("unable to mouseOver shopby and select item");
			Assert.fail("unable to mouseOver shopby and select item ");
		}
	}
	/**
	 * Description :Method is used for filter the swweet
	 * @author Shobha
	 * @param types
	 * @param size
	 * @param discount
	 * @throws Throwable
	 */
		public void filterSweet(String types,String size,String discount) throws Throwable
		{
			try {
			filterType(types).click();
			web.ScrollDown(driver);
			filterSize(size).click();
			web.ScrollDown(driver);
			filterDisc(discount).click();
			System.out.println("able to filter the sweet");
			}catch(Exception e) 
			{
				System.out.println("unable to  filter the sweet");
				Assert.fail("unable to filter the sweet ");
			}
		}
		/**
		 * Description:Method is used for click the sweet and add to bag
		 * @author Shobha
		 * @param sweetName
		 * @param addItem
		 * @param addToCart
		 */
		
			public void clkOnSweetAddToCart(String sweetName,String addItem	,String addToCart)
			{
			try {
			sweetName(sweetName).click();
			addButton(addItem).click();
			addintoCart(addToCart).click();
			System.out.println("able to mouseOver shopby and select item");
			}catch(Exception e) 
			{
				System.out.println("unable to mouseOver shopby and select item");
				Assert.fail("unable to mouseOver shopby and select item ");
			}
		}
			/**
			 * Description:Method is used for validate the swwet name
			 * @author Shobha
			 * @param sweetName
			 */
			public void validateSweetName(String sweetName)
			{
				try 
				{
					System.out.println(validateName.getText());
					String SweetName1 = sweetName;
			         Assert.assertEquals(validateName.getText(), SweetName1);
					System.out.println("Able to verify sweet name");
				}catch(Exception e){
					System.out.println("unable to verify  sweet name ");
					Assert.fail("unable to verify  sweet name ");
				}
			}
	}


