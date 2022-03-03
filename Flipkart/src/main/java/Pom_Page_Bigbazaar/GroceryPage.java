package Pom_Page_Bigbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * This page contains mouseOver on grocery and apply filter and add to cart
 * @author Shobha
 *
 */

public class GroceryPage 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public GroceryPage(WebDriver driver)
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
		String xpath ="//span[text()='"+selectType1+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button filter fruit */
	private WebElement filterFood(String filterFood) {
		String xpath ="//div[text()='"+filterFood+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button filter selectFood */
	private WebElement selectFood(String selectFood) {
		String xpath ="//div[text()='"+selectFood+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* button filter filterFoodNm */
	private WebElement filterFoodNm(String foodName) {
		String xpath ="//span[text()='"+foodName+"']";
		return driver.findElement(By.xpath(xpath));
	}

	@FindBy(xpath="//span[text()='Tasty Treat Pasta Chifferi']")
	private WebElement validateName;
	
	private WebElement addGrocery(String addItem) {
		String xpath ="//div[@class='"+addItem+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* button add to basket */
	private WebElement addintoCart(String addToCart) {
		String xpath ="//span[text()='"+addToCart+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/**
	 * Description:Method is used for mouseOver on item and filter the grocery
	 * @author Shobha
	 * @param category
	 * @param selectType
	 * @param selectType1
	 * @param filterFood
	 * @param selectFood
	 * @param foodName
	 * @throws Throwable
	 */
    public void selectGrocery(String category,String selectType	,String selectType1,	String filterFood	,String selectFood	,String foodName) throws Throwable
    {
	try {
	web.mouseOver(driver, selectCat(category));
	Thread.sleep(5000);
	web.mouseOver(driver, selectTy(selectType));
	web.mouseOver(driver, selectType (selectType1));
	web.ClickableElement(driver, selectTy(selectType1));
	filterFood(filterFood).click();
	selectFood(selectFood).click();
	web.ClickableElement(driver, filterFoodNm(foodName));
	System.out.println("able to mouseOver shopby and select item");
}catch(Exception e) 
{
	System.out.println("unable to mouseOver shopby and select item");
	Assert.fail("unable to mouseOver shopby and select item ");
}
}
/**
 * Description:Method is used for validate the pasta name
 * @author Shobha
 * @param pastaName
 */
public void clickOnName(String pastaName)
{
	try 
	{
		System.out.println(validateName.getText());
		String pastaName1 = pastaName;
         Assert.assertEquals(validateName.getText(), pastaName1);
		System.out.println("Able to verify pasta name");
	}catch(Exception e){
		System.out.println("unable to verify  pasta name ");
		Assert.fail("unable to verify  pasta name ");
	}
}
/**
 * Description:Method is used for add the item into wishlist
 * @author Shobha
 * @param addItem
 * @param addToCart
 */
public void addGrocery(String addItem	,String addToCart)
{
	try {
	addGrocery(addItem).click();
	addintoCart(addToCart).click();
	System.out.println("able to add to basket");
	}catch(Exception e) 
	{
		System.out.println("unable to add to basket  ");
		Assert.fail("unable to add to basket ");
	}
}
}
