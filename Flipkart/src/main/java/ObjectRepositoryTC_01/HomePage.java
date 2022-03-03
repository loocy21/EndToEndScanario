package ObjectRepositoryTC_01;

import static org.testng.Assert.assertEquals;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenricUtilities.WebDriverUtility;

/*
 * Description:Page used for Search Product
 * @Author Shobha
 * @Param
 * */

public class HomePage 
{
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Pop Up*/
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement CancelPopupbtn;
	
	/*Search Box*/
	@FindBy(name="q")
	private WebElement searchProduct;
	
	/*Search Button*/
	@FindBy(xpath="//button[@class=\"L0Z3Pu\"]")
	private WebElement searchBtn;
	
	
	/*
	 * Description:Method is used for Search Product
	 * @Author Shobha
	 * @Param
	 * */
	
	public void HomePage(WebDriver driver , WebElement element)
	{
		try {
		CancelPopupbtn.click();
		searchProduct.sendKeys("mobiles");
		searchBtn.click();
		System.out.println("search mobile succesfully");
		
		}
		catch(NoSuchElementException e)
		{
			CancelPopupbtn.click();
			System.out.println("not seach");
		}
		
		/*
		 * validate the HomePage
		 * */
		String actualtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String expectedtitle =driver.getTitle();
		assertEquals(actualtitle, expectedtitle);
		System.out.println("actualtitle="+actualtitle);
		
		
		
		
		
		
	
		
		
		
		
		
	}











}









