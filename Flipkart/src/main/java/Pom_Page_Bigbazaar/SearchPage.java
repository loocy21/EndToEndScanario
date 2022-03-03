package Pom_Page_Bigbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains search maggi and apply filter and addto cart
 * @author Shobha
 *
 */

public class SearchPage 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;

	public SearchPage(WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	/* search box */
	private WebElement selectCat(String category) {
		String xpathValue1 ="(//input[@type='"+category+"'])[2]";
		return driver.findElement(By.xpath(xpathValue1));
	}

	/*text field  */
	private WebElement selectTy(String selectType) {
		String xpath ="//li[text()='"+selectType+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* Button view all */
	private WebElement clkView(String button) {
		String xpath ="//div[text()='"+button+"']";
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

	/*validate maggi name*/
	@FindBy(xpath="//span[text()='Maggi Instant Noodles  Masala']")
	private WebElement validateName;

	/*get text maggi name*/
	private WebElement sweetName(String maggiName) {
		String xpath ="//span[@title='"+maggiName+"']";
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
	 * Description:Method is used for search the maggi 
	 * @author Shobha
	 * @param category
	 * @param selectType
	 * @throws Throwable
	 */

	public void searchProduct(String category,String selectType) throws Throwable
	{
		try {
			web.mouseOver(driver, selectCat(category));
			selectCat(category).click();
			web.mouseOver(driver, selectTy(selectType));
			selectTy(selectType).click();
			System.out.println("able to search the product");
		}catch(Exception e) 
		{
			System.out.println("unable to search the product");
			Assert.fail("unable to search the product ");
		}
	}
	/**
	 * Description:Method is used for view maggi page and apply filter
	 * @author Shobha
	 * @param button
	 * @param scroll
	 * @param brand
	 * @param types
	 * @param size
	 * @throws Throwable
	 */
	public void clickViewAndFilter(String button,String scroll,String brand,String	types,String size) throws Throwable
	{
		try {

			clkView(button).click();
			web.scrollBar(driver, scrollBar(scroll));
			web.ClickableElement(driver, filterBrand(brand));
			//web.scrollBar(driver, filterType1(filterType));
			filterType(types).click();
			web.ScrollDown(driver);
			filterSize(size).click();
			System.out.println("able to naviagate maggi page and apply filters");
		}catch(Exception e) 
		{
			System.out.println("unable to naviagate maggi page and apply filters");
			Assert.fail("unable toto naviagate maggi page and apply filters ");
		}
	}
	/**
	 * Description:Method is used for add the product into cart
	 * @author Shobha
	 * @param maggiName
	 * @param addItem
	 * @param addToCart
	 */
	public void addToCartFilteredMaggi(String maggiName,String	addItem,String addToCart)
	{
		try {

			sweetName(maggiName).click();
			addButton(addItem).click();
			addintoCart(addToCart).click();	
			System.out.println("able to add to cart product");
		}catch(Exception e) 
		{
			System.out.println("unable to add to cart product");
			Assert.fail("unable to add to cart product ");
		}

	}
	/**
	 * Description:Method is used for validate the filtered product name
	 * @author Shobha
	 * @param maggiName
	 */
	public void validateMaggiName(String maggiName)
	{
		try 
		{
			System.out.println(validateName.getText());
			String ProductName = maggiName;
			Assert.assertEquals(validateName.getText(), ProductName);
			System.out.println("Able to verify maggi name");
		}catch(Exception e){
			System.out.println("unable to verify  maggi name ");
			Assert.fail("unable to verify  maggi name ");
		}
	}

}
