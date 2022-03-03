package ElementRepo_Ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This page is used for validate and addTobag Product
 * @author Shobha
 *
 */

public class AddToBagPage 
{

	WebDriverUtility web = new WebDriverUtility();
	
	WebDriver driver = null;
	
	public AddToBagPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	/* get text of Bag name */
	@FindBy(xpath="//h1[text()='Sling Pouch with Insert Pocket']")
	private WebElement gettxtname;
	
	/*get text price of Bag */
	@FindBy(xpath="//div[@class='prod-sp']")
	private WebElement getTxtBagRs;
	
	/* Button pin code */
	@FindBy(id="edd")
	private WebElement pincdButton;
	
	/* text field pin code */
	@FindBy(xpath="//input[@type='number']")
	private WebElement tfpinCd;

	/* submit Button */
	@FindBy(xpath="//button[text()='CONFIRM PINCODE']")
	private WebElement clkCP;
	
	/* change pincode */
	@FindBy(xpath="//span[text()='Change Pincode']")
	private WebElement clkchangePin;
	
	
	
	/* Button addToBag*/
	@FindBy(xpath="//span[text()='ADD TO BAG']")
	private WebElement addToBag;
	
	
	/**
	 * Description :Method is used for handling the window
	 * @author Shobha
	 */
	public void switchToWndo()
	{
		try {
		web.switchToWindow(driver, "Buy Blue Sports & Utility Bag for Men by F Gear Online | Ajio.com");
		System.out.println("===window switched succesfully===");
		}catch(Exception e)
		{
			System.out.println("===window not switched===");
			Assert.fail("===window not switched===");
		}
	}

	/**
	 * Description:Method is used for get text of Bag name and Price
	 * @author Shobha
	 */
	
	public void getTxtBag()
	{
		try {
		WebElement lst=gettxtname;
		System.out.println("BagName=="+lst.getText());
		
		WebElement ele=getTxtBagRs;
		System.out.println("BagName=="+ele.getText());
		System.out.println("===able to take get text===");
		}catch(Exception e)
		{
			System.out.println("not able to get text ");
			Assert.fail("not able to get text ");
		}
	}
	/**
	 * Description:Method is used for validate the First Bag name
	 * @author Shobha
	 */
	
	public void validateBagName()
	{
		try {
		System.out.println(gettxtname.getText());
		String BagName = "Sling Pouch with Insert Pocket";
		Assert.assertEquals(gettxtname.getText(), BagName);
		System.out.println("validate Bag name Succesfully");
		}catch(Exception e)
		{
			System.out.println("validate Bag name not Succesfully");
			Assert.fail("validate Bag name not Succesfully");
		}
		
		
	}
	/**
	 * Description:Method is used for validate the First Bag price
	 * @author Shobha
	 */
	public void validateBagPrice()
	{
		try {
		System.out.println(getTxtBagRs.getText());
		String bagPrice = "Sling Pouch with Insert Pocket";
		Assert.assertEquals(getTxtBagRs.getText(), bagPrice);
		System.out.println("validate Bag Price Succesfully");
		}catch(Exception e)
		{
			System.out.println("validate Bag Price not Succesfully");
			Assert.fail("validate Bag Price not Succesfully");
		}
		}
	/**
	 * Description:Method is used for pass the Diffrent PinCode
	 * @author Shobha
	 * @param pinCode1
	 * 
	 */
	public void pinCodeTb(String pinCode1)
	{
		try{
			pincdButton.click();
		
			tfpinCd.sendKeys(pinCode1);
		 {
			 System.out.println("==accept pin code1 succesfully==");
		 }
		 }catch(Exception e)
		 {
			 System.out.println("==not accepted first pin code==");
			 Assert.fail("not accepted first pin code");
		 }
		web.ClickableElement(driver, clkCP);
		clkchangePin.click();
	}
	/**
	 * Description:Method is used for change PinCode
	 * @author Shobha
	 * @param pinCode2
	 */
	public void pinCodeChnge(String pinCode2)
	{
		try{
			//pincdButton.click();
		
			tfpinCd.sendKeys(pinCode2);
		 {
			 System.out.println("==accept pin code1 succesfully==");
		 }
		 }catch(Exception e)
		 {
			 System.out.println("==not accepted first pin code==");
			 Assert.fail("not accepted first pin code");
		 }
		addToBag.click();
			
		}
		
	
		 
	

	}




