package Pom_Class_Zomato;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class Food_Page 
{

	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Food_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* click pizza */
	@FindBy(xpath="//p[text()='Pizza']")
	private WebElement logoPizza;
	
	/* click first pizza */
	@FindBy(xpath="(//img[@alt='Restaurant Card'])[1]")
	private WebElement btnPizza;
	
	/*xpath for PizzaName*/
	private WebElement pizzaName(String pizzaName) {
		String xpathValue ="//h1[text()='"+pizzaName+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	
	/* button add */
	@FindBy(xpath="(//div[@class='jumbo-tracker'])[1]")
	private WebElement btnAdd;
	
	/**
	 * Description:Method is used for click on pizza 
	 * @author Shobha
	 * @param pizzaName
	 * @throws Throwable
	 */
	
	public void addFood(String pizzaName) throws Throwable
	{
		try {
		Thread.sleep(3000);
		web.scrollBar(driver, logoPizza);
		web.ClickableElement(driver, logoPizza);
		btnPizza.click();
		pizzaName(pizzaName).click();
		System.out.println("scroll the screen and click on pizza succesfully ");
		}catch(Exception e)
		{
			System.out.println("unable to scroll the screen and click on pizza");
			Assert.fail("unable toscroll the screen and click on pizza");
		}
	} 
	/**
	 * Description:Method is used for validate the pizza name
	 * @author Shobha
	 * @throws Throwable 
	 */
	public void validateName() throws Throwable
	{
		try {
		String actualName = "Ovenstory Pizza, Shanti Nagar order online - Zomato";
		String expectedName = driver.getTitle();
		Assert.assertEquals(actualName, expectedName);
		System.out.println("actualName="+actualName);
		System.out.println(" pizza name validate succesfully ");
		}catch(Exception e)
		{
			System.out.println("unable to validate pizza name");
			Assert.fail("unable to validate pizza name");
		}
		web.ScrollDown(driver);
		web.ClickableElement(driver, btnAdd);
	
	}
}
