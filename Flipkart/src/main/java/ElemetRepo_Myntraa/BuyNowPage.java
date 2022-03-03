package ElemetRepo_Myntraa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains validation for filtered Product
 * @author Shobha
 *
 */
public class BuyNowPage 
{
	WebDriverUtility web = new WebDriverUtility();
	JsonFileUtility jsonLib = new JsonFileUtility();
	WebDriver driver;
	public BuyNowPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	/* first Product Click */
	@FindBy(xpath="(//img[@title='Roadster Men Blue Skinny Fit Mid-Rise Mildly Distressed Stretchable Jeans'])[1]")
	private WebElement clkFst;

	/* product name */
	@FindBy(xpath="//h1[text()='Men Blue Skinny Fit Mid-Rise Mildly Distressed Stretchable Jeans']")
	private WebElement jeansName;

	
	/* product price */
	@FindBy(xpath="//span[text()='Rs. 679']")
	private WebElement jeansPrice;
	
	
	/* product Size */
	@FindBy(xpath="//p[text()='30']")
	private WebElement jeansSize;
	
	
	/* text field pin code */
	@FindBy(xpath="//input[@placeholder='Enter a PIN code']")
	private WebElement pinCodetb;
	
	

	/* check click */
	@FindBy(xpath="//button[text()='CHECK']")
	private WebElement ckOptClk;
	
	/**
	 * Description:Method is used for validate the filtered product
	 * @author Shobha
	 */
	
	
	public void ValidateName()
	{
		try {
		web.switchToWindow(driver, "result");
		String ActualSofaName = jeansName.getText();
		Assert.assertEquals(ActualSofaName,"Men Blue Skinny Fit Mid-Rise Mildly Distressed Stretchable Jeans");
		System.out.println("Able to verify filtered jeans name ");
	}catch(Exception e) {
		System.out.println("unable to verify filtered jeans name ");
		Assert.fail("unable to verify filtered jeans name ");
	}
	}
	/**
	 * Description:Method is used for validate the filtered product price
	 * @author Shobha
	 */
	
	public void validatePrice()
	{
		try {
		System.out.println(jeansPrice.getText());
		String ActualPrice = jeansPrice.getText();
		Assert.assertEquals(ActualPrice,"Rs. 679");
		System.out.println("===succesfully validate jeans price===");
		}catch(Exception e)
		{
			System.out.println("==not validate jeans price==");
			Assert.fail("==not validate jeans name==");
		}
		
	}
	/**
	 * Description:This method is used for validate the jeans colour
	 * @param expectedColor
	 */
	 public void getColorOfProdt(String expectedColor) 
	 {
		try 
		{ 
			String color = clkFst.getCssValue("color");
			System.out.println(color);
			Assert.assertEquals(color,expectedColor,"color should be match");
		    System.out.println("Able to verify color of filtered jeans");
		}
		catch(Exception e)
		{
			System.out.println("Unable to verify color of filtered jeans");
			Assert.fail("Unable verify color of filtered jeans");
		}	
	 }	
	 /**
		 * Description:Method is used for validate the filtered product Size
		 * @author Shobha
		 */
		
		
		public void ValidateSize()
		{
			try {
				System.out.println(jeansSize.getText());
				String jeansSize1 = "30";
				Assert.assertEquals(jeansSize.getText(), jeansSize1);
				System.out.println("===succesfully validate jeans price===");
				}catch(Exception e)
				{
					System.out.println("==not validate jeans price==");
					Assert.fail("==not validate jeans name==");
				}
		}
		public void setPincodeAndVerify(String Pincode,String expectedDeliveryBy)
		{
		   try 
		   { 
			   pinCodetb.sendKeys(Pincode);
			   ckOptClk.click();
			    String ActualDeliveryBy = pinCodetb.getText();
				Assert.assertEquals(ActualDeliveryBy, expectedDeliveryBy);
				
				System.out.println("Able to enter on pincode and verify delivery by msg");
			}
			catch(Exception e)
			{
			    System.out.println("Unable to enter on pincode and verify delivery by msg");
				Assert.fail("Unable to enter on pincode and verify delivery by msg");
			}	
		}	
}


