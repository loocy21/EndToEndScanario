package ElmtRepo_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class BuyNowPage 
{
	/**
	 * Description: This class consists of elements and generic methods related to Required Filtered sofa page
	 * @author Pavankumar
	 *
	 */

		
		WebDriverUtility wLib = new WebDriverUtility();
		WebDriver driver=null;

		
		public BuyNowPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		 
	

		/* filtered Sofa name text */
		@FindBy(xpath="//h1[text()='Rome 1 Seater Sofa in Maroon Colour']")
		private WebElement txtFilteredSofaName;	
		
		/* Price text*/
		@FindBy(xpath="//div[@class='vipPrice']//span[text()='₹ 8,693']")
		private WebElement txtPrice;
		
		/* apply link */
		@FindBy(id="vipPincodeSub")
		private WebElement lnkApply;
		
		/* pincode textField */
		@FindBy(id="pincode")
		private WebElement tfPincode;
		
		/* delivery by text*/
		@FindBy(xpath="//div[text()='Delivery - FREE For Today | Get it by ']")
		private WebElement txtDeliveryBy;
		
		/* add to CART button */
		@FindBy(xpath="//a[text()='ADD TO CART']")
		private WebElement btnAddToCart;
		
		/* go to CART button */
		@FindBy(xpath="//a[text()='ADD TO CART']/following-sibling::a[text()='GO TO CART']")
		private WebElement btnGoToCart;
		
		/* quantity dropdown */
		@FindBy(id="quantity")
		private WebElement ddQuantity;
		
		  /**
			* Descrption: This method is to get filtered sofa name and validate it
			* @author Pavankumar
			* @param expectedJeansName
			*/
			public void getSofaNameAndValidate( String expectedSofeName) {
				try {
				//	String expectedJeansName = jp.getTxtFilteredJeans().getText();
					//wLib.waitForNoOfWindowsToBe(driver, 2);
					wLib.switchToWindow(driver,"rome-1-seater-sofa-in-maroon-colour");
					String ActualSofaName = txtFilteredSofaName.getText();
					Assert.assertEquals(ActualSofaName,expectedSofeName,"filtered sofa name is not Matched with expected sofa name");
					System.out.println("Able to verify filtered sofa name ");
				}catch(Exception e) {
					System.out.println("unable to verify filtered sofa name ");
					Assert.fail("unable to verify filtered sofa name ");
				}
			}
			
			/**
			 * Descrption: This method is to get filtered sofa price and validate it
			 * @author Pavankumar
			 * @param expectedJeansPrice
			 */
			public void getSofaPriceAndValidate(String expectedJeansPrice) {
				try {
					
					String SofaPrice = txtPrice.getText();
					Assert.assertEquals(SofaPrice,expectedJeansPrice,"filtered sofa price is not Matched with expected jeans price");
					System.out.println("Able to verify filtered sofa price");
				}catch(Exception e) {
					System.out.println("unable to verify filtered sofa price");
					Assert.fail("unable to verify filtered sofa price ");
				}
			}
			
			 
			 /**
			 * Description: This method is to select the quantity
			 * @author Pavankumar
			 */
			 public void setQuantity(String Quantity) 
			 {
				try 
				{ 
				    wLib.selectByVisibleText(Quantity, ddQuantity);
				    System.out.println("Able to select the quantity");
				}
				catch(Exception e)
				{
					System.out.println("Unable to select the quantity");
					Assert.fail("Unable to select the quantity");
				}	
			 }	
				 
		    /**
			 * Description: This method is to enter pincode and verify delivery by msg
			 * @author Pavankumar
			 * @param  Pincode
			 * @param  expectdPincodeLine
			 * @param  notDeliverableLine
			 */
			public void setPincodeAndVerify(String Pincode,String expectedDeliveryBy)
			{
			   try 
			   { 
				    tfPincode.sendKeys(Pincode);
				    lnkApply.click();
				    String ActualDeliveryBy = txtDeliveryBy.getText();
					Assert.assertEquals(ActualDeliveryBy, expectedDeliveryBy);
					
					System.out.println("Able to enter on pincode and verify delivery by msg");
				}
				catch(Exception e)
				{
				    System.out.println("Unable to enter on pincode and verify delivery by msg");
					Assert.fail("Unable to enter on pincode and verify delivery by msg");
				}	
			}	
					 		 
			/**
		      * Description: This method is to click on add to cart
			  * @author Pavankumar
			  * @param
			  */
			  public void clkAddToCart()
			  {
				 try 
				{ 
				   btnAddToCart.click();
				   System.out.println("Able to click on AddToCart");
				}
				catch(Exception e)
				{
					System.out.println("Unable to click on AddToCart");
					Assert.fail("Unable to click on AddToCart");
				}	
			}
			  
			  /**
			      * Description: This method is to click on go to cart
				  * @author Pavankumar
				  * @param
				  */
				  public void clkGoToCart()
				  {
					 try 
					{ 
					   btnGoToCart.click();
					   System.out.println("Able to click on GoToCart");
					}
					catch(Exception e)
					{
						System.out.println("Unable to click on GoToCart");
						Assert.fail("Unable to click on AddToCGoToCartart");
					}	
				}			  
	}

