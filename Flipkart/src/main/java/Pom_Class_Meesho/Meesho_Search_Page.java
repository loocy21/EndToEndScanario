package Pom_Class_Meesho;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * Description:this page contains perform end to end scanario
 * @author Shobha
 *
 */

public class Meesho_Search_Page 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Meesho_Search_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* search text field */
	@FindBy(xpath="//input[@type='text']")
	private WebElement tfSearch;

	/*xpath for text field */
	public WebElement tfSearch1(String search) {
		String xpathValue ="//input[@type='"+search+"']";
		return driver.findElement(By.xpath(xpathValue));
	}

	/* auto Suggestion */
	@FindBy(xpath="//p[text()='clothes for women']")
	private WebElement autoSuggCloth;

	/*xpath for auto suggestion */
	public WebElement seltClothes(String clothe) {
		String xpathValue ="//p[@type='"+clothe+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	/* text mouse Over */
	@FindBy(xpath="(//div[@class='sc-bdvvtL byHcNc'])[2]/descendant::span[text()='Women Ethnic']")
	private WebElement subTitle;

	/*xpath for mouse Over */
	public WebElement mouseOver(String subTitle) {
		String xpathValue ="(//div[@class='sc-bdvvtL byHcNc'])[2]/descendant::span[text()='"+subTitle+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	/* select One Element */
	@FindBy(xpath="//p[text()='All Kurtis']")
	private WebElement clkOneProduct;

	/*xpath for dress name */
	public WebElement clkOneProduct(String dressName) {
		String xpathValue ="//p[text()='"+dressName+"']";
		return driver.findElement(By.xpath(xpathValue));
	}

	/* btn dress */
	public WebElement clkfirstProduct(String firstDressName) {
		String xpathValue ="//p[text()='"+firstDressName+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	/* get text dress name */
	@FindBy(xpath="//span[text()='Printed Anarkali Kurti for Women Ethnic Wear Rayon Fabric ']")
	private WebElement dressName1;

	/* get text dress name */
	@FindBy(xpath="//h4[text()='279']")
	private WebElement dressPrice;



	/*xpath for auto suggestion */
	public WebElement seltsize(String size) {
		String xpathValue ="//span[text()='"+size+"']";
		return driver.findElement(By.xpath(xpathValue));


	}

	/* button add to cart */
	public WebElement btnATC(String button) {
		String xpathValue ="//span[text()='"+button+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	/**
	 * Description:Method is used for search the product and select one auto suggestion
	 * @author Shobha
	 * @param search
	 * @param clothe
	 * @param subTitle
	 * @param dressName
	 * @param firstDressName
	 * @throws Throwable
	 */
	
	public void searchPage(String search,String clothe,String subTitle,String dressName,String firstDressName) throws Throwable
	{
		try {
		tfSearch.sendKeys(search,Keys.ENTER);
		Thread.sleep(3000);
		web.mouseOver(driver, mouseOver(subTitle));
		clkOneProduct(dressName).click();
		clkfirstProduct(firstDressName).click();
		System.out.println("able to search clothes");
		}catch(Exception e) {
			System.out.println("unable to search clothes");
			Assert.fail("unable to search clothes");
		}

	}
	/**
	 * Description:Method is used for validate the name of dress
	 * @author Shobha
	 */
	public void validateDressname()
	{
		try 
		{
			System.out.println(dressName1.getText());
			String dressName = "Printed Anarkali Kurti for Women Ethnic Wear Rayon Fabric";

			Assert.assertEquals(dressName1.getText(), dressName);
			System.out.println("Able to verify dress name");
		}
		catch(Exception e) 
		{
			System.out.println("unable to  verify  dress name ");
			Assert.fail("unable to verify  dress name ");
		}
	} 
	/*
	 * Description:Method is used for validate the dress price
	 * @author Shobha
	 */
	public void validatePrice()
	{
		try 
		{
			System.out.println(dressPrice.getText());
			String dressPrice1 = "₹279";

			Assert.assertEquals(dressPrice.getText(), dressPrice1);
			System.out.println("Able to verify dress Price");
		}
		catch(Exception e) 
		{
			System.out.println("unable to  verify  dressPrice ");
			Assert.fail("unable to verify  dressPrice ");
		}
	}

	/**
	 * Description:Method is used for select size and add to cart
	 * @author Shobha
	 * @param size
	 * @param button
	 */
	public void selectSizeandAddtoCart(String size,String button)
	{
		try {
		seltsize(size).click();
		btnATC(button).click();
		System.out.println("able to select size and add to cart");
		}catch(Exception e) {
			System.out.println("unable to search size and add to cart");
			Assert.fail("unable to search size and add to cart");

	}
}
}


