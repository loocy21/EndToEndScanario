package ElemetRepo_Myntraa;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;
/**
 * HomePage
 * Description:This page contains all mouseOver and get text action
 * @author Shobha
 *
 */

public class Product_Page 
{
	WebDriverUtility web = new WebDriverUtility();
	JsonFileUtility jsonLib = new JsonFileUtility();
	WebDriver driver;
	public Product_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* Men MouseOver */
	@FindBy(xpath="//a[text()='Men' and @class='desktop-main']")
	private WebElement mnMouseOver;

	/* element get text */
	@FindBy(xpath="//div[@class='desktop-categoryContainer']")
	private	List< WebElement> getTxt;

	/* Women MouseOver */
	@FindBy(xpath="//a[text()='Women' and @class='desktop-main']")
	private WebElement wmnMouseOver;

	/* element all  get text */
	@FindBy(xpath="//div[@class='desktop-categoryContainer']")
	private List< WebElement> getTxt1;
	
	/* kids MouseOver */
	@FindBy(xpath="//a[text()='Kids' and @class='desktop-main']")
	private WebElement kidsMouseOver;

	/* element all  get text  */
	@FindBy(xpath="//div[@class='desktop-categoryContainer']")
	private	List< WebElement> getTxt2;

	/* H&L MouseOver */
	@FindBy(xpath="//a[text()='Home & Living' and @class='desktop-main']")
	private WebElement hlMouseOver;

	/* element all  get text */
	@FindBy(xpath="//div[@class='desktop-categoryContainer']")
	private List< WebElement> getTxt3;
	
	/* Beauty MouseOver */
	@FindBy(xpath="//a[text()='Beauty' and @class='desktop-main']")
	private WebElement btyMouseOver;

	/* element all get text */
	@FindBy(xpath="//div[@class='desktop-categoryContainer']")
	private List< WebElement> getTxt4;
	
	/**
	 * Description:Method is used for mouseOver on men and get text all element
	 * @author Shobha
	 * @throws Throwable
	 */
	
	public void menGetAllText() throws Throwable
	{
		try {
		web.mouseOver(driver, mnMouseOver);	
		for (WebElement webElement : getTxt)
		{
			System.out.println(webElement.getText());
		}
		System.out.println("get text all men categerious succesfully");
		}catch(Exception e)
		{
			System.out.println("get text all men categerious not done");
			Assert.fail("get text all men categerious not done");
		}
	}
	/**
	 * Description:Method is used for mouseOver on women and get text all element
	 * @author Shobha
	 * @throws Throwable
	 */
	public void wmnsGetAllText() throws Throwable
	{
		try {
			web.mouseOver(driver, wmnMouseOver);	
			for (WebElement webElement : getTxt1)
			{
				System.out.println(webElement.getText());
			}
			System.out.println("get text all woman categerious succesfully");
			}catch(Exception e)
			{
				System.out.println("get text all woman categerious noy done");
				Assert.fail("get text all woman categerious noy done");
			}
	}
	/**
	 * Description:Method is used for mouseOver on kids and get text all element
	 * @author Shobha
	 * @throws Throwable
	 */	
		
		
		
	public void kidsGetAllText() throws Throwable
	{
		try {
			web.mouseOver(driver, kidsMouseOver);	
			for (WebElement webElement : getTxt2)
			{
				System.out.println(webElement.getText());
			}
			System.out.println("get text all kids categerious succesfully");
			}catch(Exception e)
			{
				System.out.println("get text all kids categerious noy done");
				Assert.fail("get text all kids categerious noy done");
			}
	}
	/**
	 * Description:Method is used for mouseOver on home and get text all element
	 * @author Shobha
	 * @throws Throwable
	 */	
	public void hlGetAllText() throws Throwable
	{
		try {
			web.mouseOver(driver, hlMouseOver);	
			for (WebElement webElement : getTxt3)
			{
				System.out.println(webElement.getText());
			}
			System.out.println("get text all kids categerious succesfully");
			}catch(Exception e)
			{
				System.out.println("get text all kids categerious noy done");
				Assert.fail("get text all kids categerious noy done");
			}
	}
		/**
		 * Description:Method is used for mouseOver on beauty and get text all element
		 * @author Shobha
		 * @throws Throwable
		 */	
	public void btyGetAllText() throws Throwable
	{
		try {
			web.mouseOver(driver, btyMouseOver);	
			for (WebElement webElement : getTxt4)
			{
				System.out.println(webElement.getText());
			}
			System.out.println("get text all beauty categerious succesfully");
			}catch(Exception e)
			{
				System.out.println("get text all beauty categerious noy done");
				Assert.fail("get text all beauty categerious noy done");
			}
}
}
	
		
		
		
		

	

