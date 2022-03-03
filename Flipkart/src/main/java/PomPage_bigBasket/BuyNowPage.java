package PomPage_bigBasket;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class BuyNowPage 
{
	WebDriverUtility web = new WebDriverUtility();

	WebDriver driver;
	public BuyNowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/* validate name */
	@FindBy(xpath="//h1[text()='Fresho Guava - Thai, 1 pc  ']")
	private WebElement validateName;
	
	/* validate price */
	@FindBy(xpath="//tr[@class='_157dw']")
	private WebElement validatePrice;
	
	/* validate clr */
	@FindBy(xpath="//img[@alt='Fresho Guava - Thai, 1 pc  ' ]")
	private WebElement validateClr;
	
	
	/* add To Basket */
	@FindBy(xpath="//div[@data-qa='addToBasket']")
	private WebElement addToBskt;
	
	/**
	 * Description:Method is used for click First product and switching window
	 * @author Shobha
	 */
	public void switchWindow()
	{
		try {
	
		web.switchToWindow(driver, "Buy Fresho Guava Thai 1 Pc Online at the Best Price - bigbasket");
		System.out.println("sucessfully swiching window");
		} catch (Exception e) {
			System.out.println("unable to swiching window");
			Assert.fail("unable to swiching window");
	}
	}
	
	/*
	 *Description:Method is used for validate the product name 
	 *@Author Shobha
	 *@Param 
	 * */
	public void getProductName() {
		try {
			System.out.println(validateName.getText());	
			String productName = "Fresho Guava - Thai, 1 pc  ";
			Assert.assertEquals(validateName.getText(), productName);
			System.out.println("sucessfully validate product price");
		} catch (Exception e) {
			System.out.println("unable validate product price");
			Assert.fail("unable validate product price");
		}
	}
	/**
	 * Description:Method is used for validate the price 
	 * @author Shobha
	 */
		
		public void getProducPrice() {
			try {
				System.out.println(validatePrice.getText());	
				String productPrice = "Fresho Guava - Thai, 1 pc  ";
				Assert.assertEquals(validatePrice.getText(), productPrice);
				System.out.println("sucessfully validate product price");
			} catch (Exception e) {
				System.out.println("unable validate product price");
				Assert.fail("unable validate product price");
			}
		}
		/**
		 * Description:Method is used for validate the Product colour
		 * @param expectedColor
		 */
			 public void getColor() 
			 {
				try 
				{ 
					System.out.println(validateClr.getText());	
					String producColour = "green ";
					Assert.assertEquals(validateClr.getCssValue(producColour), producColour);
				    System.out.println("Able to verify color of filtered Product");
				}
				catch(Exception e)
				{
					System.out.println("Unable to verify color of filtered product");
					Assert.fail("Unable verify color of filtered product");
				}
				addToBskt.click();
			 }	
		
	}
		

	
	
	
	
	
	
	

	


