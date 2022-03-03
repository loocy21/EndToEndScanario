package ElementRepo_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This Page is used for validate the Product
 * @author Shobha
 */
public class ValidationPage 
{
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;

	public ValidationPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/* ring text */
	@FindBy(xpath="//a[text()='The Celestina Ring']")
	private WebElement gettxtName;

	/* ring price */
	@FindBy(xpath="//div[@class=\"new-price\"]")
	private WebElement gettxtprice;

	/* get Size */
	@FindBy(xpath = "//div[text()=' Ring Size ']")
	private WebElement getSize;
	/**
	 * Description:Method is used for validateName
	 * @author Shobha
	 */
	public void validateName()
	{
		try {
			WebElement ele = gettxtName;
			if(ele.isDisplayed())
			{
				System.out.println("ring name is displayed");
			}
			else
			{
				System.out.println("ring name is not displayed");
			}
		}catch(Exception e){
			{
				System.out.println(" Name validation not done");
				Assert.fail("Name validation not done");
			}
		}
	}
	/**
	 * Description:Method is used for validatePrice
	 * @author Shobha
	 */


	public void validatePrice()
	{
		try {
			WebElement ele1 = gettxtprice;
			if(ele1.isDisplayed())
			{
				System.out.println("ring price is displayed");
			}
			else
			{
				System.out.println("ring price is not displayed");
			}
		}catch(Exception e){
			{
				System.out.println("Price validation not done");
				Assert.fail("Price validation not done");
			}
		}
	}
	/**
	 * Description:Method is used for validateSize
	 * @author Shobha
	 */
	public void validateSize()
	{
		try {
			WebElement ele2 = getSize;
			if(ele2.isDisplayed())
			{
				System.out.println("ring size is displayed");
			}
			else
			{
				System.out.println("ring size is not displayed");
			}
		}
		catch(Exception e)
		{
			System.out.println(" Size validation not done");
			Assert.fail("Size validation not done");
		}
		}



			


	}








