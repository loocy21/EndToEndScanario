package ElmtRepo_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class filterPage 
{
	/**
	 * Description: This class consists of elements and generic methods related to Required Filtered sofa page
	 * @author Pavankumar
	 *
	 */

		
		WebDriverUtility wLib = new WebDriverUtility();
		WebDriver driver = null;

		
		public filterPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		 
		
		/* cart Sofa name text */
		@FindBy(xpath="//a[text()='Rome 1 Seater Sofa in Maroon Colour by ARRA']")
		private WebElement txtCartSofaName;	
		
		/* CartPrice text*/
		@FindBy(xpath="//span[text()=' ₹ 20,454']")
		private WebElement txtCartPrice;
		
		/* sofa img*/
		@FindBy(xpath="//img[@class='loaded']")
		private WebElement imgsofa;
		
		/*  cart quantity text */
		@FindBy(className="quntity-input")
		private WebElement txtCartQuantity;
		
		  /**
			* Descrption: This method is to get filtered sofa name and validate it
			* @author Pavankumar
			* @param expectedJeansName
			*/
			public void getCartSofaNameAndValidate( String expectedSofaName) {
				try {
				
					String ActualSofaName = txtCartSofaName.getText();
					Assert.assertEquals(ActualSofaName,expectedSofaName ,"filtered sofa name is not Matched with expected sofa name");
					System.out.println("Able to verify filtered sofa name ");
				}catch(Exception e) {
					System.out.println("unable to verify filtered sofa name ");
					Assert.fail("unable to verify filtered sofa name ");
				}
			}
			
			/**
			 * Descrption: This method is to get cart filtered sofa price and validate it
			 * @author Pavankumar
			 * @param expectedJeansPrice
			 */
			public void getCartSofaPriceAndValidate(String expectedSofaPrice) {
				try {
					
					String SofaPrice = txtCartPrice.getText();
					Assert.assertEquals(SofaPrice,expectedSofaPrice," cart filtered sofa price is not Matched with expected sofa price");
					System.out.println("Able to verify filtered sofa price");
				}catch(Exception e) {
					System.out.println("unable to verify cart filtered sofa price");
					Assert.fail("unable to verify cart filtered sofa price ");
				}
			}
			
			/**
			 * Descrption: This method is to get cart filtered sofa quantity and validate it
			 * @author Pavankumar
			 * @param expectedJeansPrice
			 */
			public void getCartSofaQuantityAndValidate(String expectedSofaQuantity) {
				try {
					
					String SofaQuantity = txtCartQuantity.getText();
					Assert.assertEquals(SofaQuantity,expectedSofaQuantity," cart filtered sofa price is not Matched with expected sofa price");
					System.out.println("Able to verify filtered sofa price");
				}catch(Exception e) {
					System.out.println("unable to verify cart filtered sofa price");
					Assert.fail("unable to verify cart filtered sofa price ");
				}
			}
			
			 
			 /**
			 * Description: This method is to vaidate color of filterd sofa
			 * @author Pavankumar
			 */
			 public void getColorOFSofaAndValidate(String expectedColor) 
			 {
				try 
				{ 
					String color = imgsofa.getCssValue("color");
					System.out.println(color);
					Assert.assertEquals(color,expectedColor," cart sofa color is not Matched with expected sofa color");
				    System.out.println("Able to verify color of filtered sofa price");
				}
				catch(Exception e)
				{
					System.out.println("Unable to verify color of filtered sofa price");
					Assert.fail("Unable verify color of filtered sofa price");
				}	
			 }	
				 
		    	  
	}


