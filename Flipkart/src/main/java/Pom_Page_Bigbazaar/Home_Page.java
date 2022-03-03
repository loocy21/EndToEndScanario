package Pom_Page_Bigbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * This page contains mouseOver on fruit and select filter the fruit
 * @author Shobha
 *
 */
public class Home_Page {
	
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	/* select autoSuggestion  */
	private WebElement selectCat(String category) {
		String xpathValue1 ="//a[text()='"+category+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/*filter the fruit */
	private WebElement selectTy(String selectType) {
		String xpath ="//span[text()='"+selectType+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/*filter the veg */
	private WebElement selectType(String selectType1) {
		String xpath ="//div[text()='"+selectType1+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter fruit */
	private WebElement filterFruit(String filterFruits) {
		String xpath ="//div[text()='"+filterFruits+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* get text fruit name */
	
	@FindBy(xpath="//span[@title='  Sweet Lime']")
	private WebElement validateName;
	
	/* buttton fruit */
	private WebElement selectFruit(String selectFruits) {
		String xpath ="//span[@title='"+selectFruits+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* button add */
	private WebElement addFiteredFruit(String addFruit) {
		String xpath ="//div[@class='"+addFruit+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button add to basket */
	private WebElement addintoCart(String addToCart) {
		String xpath ="//span[text()='"+addToCart+"']";
		return driver.findElement(By.xpath(xpath));
	}
  /**
   * Description:Method is used for select the categery and apply filter 
   *@author Shobha
   * @param category
   * @param selectType
   * @param selectType1
   * @param filterFruits
   * @param selectFruits
   * @throws Throwable
   */
	public void searchPage(String category	,String selectType,String selectType1,	String filterFruits	,String selectFruits) throws Throwable
	{
		try {
	
		web.mouseOver(driver, selectCat(category));
		Thread.sleep(5000);
		web.mouseOver(driver, selectTy(selectType));
		web.ClickableElement(driver, selectTy(selectType));
		selectType(selectType1).click();
		filterFruit(filterFruits).click();
		selectFruit(selectFruits).click();
		System.out.println("able to mouseOver shopby and select item");
		}catch(Exception e) 
		{
			System.out.println("unable to mouseOver shopby and select item");
			Assert.fail("unable to mouseOver shopby and select item ");
		}
	}
	/**
	 * Description:Method is used for validate the filtered fruit
	 * @author Shobha
	 */
	public void validateFilteredFruit()
	{
		
			try 
			{
				System.out.println(validateName.getText());
				String FruitName = "Sweet Lime";

				Assert.assertEquals(validateName.getText(), FruitName);
				System.out.println("Able to verify fruit name");
			}
			catch(Exception e) 
			{
				System.out.println("unable to  verify  fruit name ");
				Assert.fail("unable to verify  fruit name ");
			}
	}
    /**
     * Description:Method is used for add the fruit into basket
     * @author Shobha
     * @param addFruit
     */
	public void addFruit(String addFruit)
	{
	try {
     web.ClickableElement(driver, addFiteredFruit(addFruit));
		System.out.println("click the addToCart button");
	}
		catch(Exception e) 
		{
			System.out.println("unable to  verify click the addToCart button  ");
			Assert.fail("unable toclick the addToCart button");
		}
	}
	/**
	 * Description:Method is used for add to basket
	 * @author Shobha
	 * @param addToCart
	 */
	public void addToCart(String addToCart)
	{
		try {
		addintoCart(addToCart).click();
		System.out.println("able to add to basket");
		}catch(Exception e) 
		{
			System.out.println("unable to add to basket  ");
			Assert.fail("unable to add to basket ");
		}
	}
	}


