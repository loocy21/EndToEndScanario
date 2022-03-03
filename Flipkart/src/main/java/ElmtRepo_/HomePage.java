package ElmtRepo_;

import java.util.ArrayList;
import java.util.List;
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class HomePage 
{
	/**
	 * Description: This class consists of elements and generic methods related to Home page
	 * @author Pavankumar
	 *
	 */
	
		WebDriverUtility wLib = new WebDriverUtility();
		WebDriver driver=null;
		
		public HomePage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		/* register button */
		@FindBy(xpath="//b[text()='Login/Register']")
		private WebElement btnRegister;
		
		/* mobilenumber textfield */
		@FindBy(name="user[new]")
		private WebElement tfMobNum;
		
		/* passsword textfield */
		@FindBy(id="password")
		private WebElement tfPassword;
		
		/* login button */
		@FindBy(id="formSubmit-popup_login_username_form")
		private WebElement btnLogin;
		
		/* Login Img link */
		@FindBy(xpath="//div[@class='hd-profile-cta-wrap']")
		private WebElement lnkLoginImg;
		
		/* arra link */
		@FindBy(xpath="//a[contains(text(),'ARRA')]")
		private WebElement lnkArra;
		
		/* price text */
		@FindBy(xpath="//span[contains(text(),'₹ 8,693')]")
		private WebElement txtPrice;
		
		
		/* Exsisting user link */
		@FindBy(xpath="//a[text()='Existing User? Log In']")
		private WebElement lnkExistingUser;
		
		/* dynamic xpath method for getting all the options of elements*/
		public List<WebElement> optionsOfGender(String value)
		{
		String xpath="//a[contains(text(),'"+value+"')]/../..//div[@id='inner']/div";
		return driver.findElements(By.xpath(xpath));
		}

		/* dynamic xpath method for getting all the types of elements*/
		public WebElement options(String value) {
			String xpath="//a[@rel='meta-"+value+"']";
			return driver.findElement(By.xpath(xpath));
		}
		
		/* dynamic xpath method for getting different SortBYOptions*/
	    public WebElement filterByOptions(String value) 
	    {
		    String xpath="//div[@class='clip__filter-warpper']//label[contains(text(),'"+value+"')]";
			return driver.findElement(By.xpath(xpath));
			}
		
		/* dynamic xpath method for getting different filter options*/
		public WebElement filter(String value) 
		{
			String xpath="//ul[@class='clipFilter__applied-tab']//li[contains(text(),'"+value+"')]";
			return driver.findElement(By.xpath(xpath));
		}
		
		/* dynamic xpath method for getting different filter options*/
		public WebElement filterdProduct(String value) 
		{
			String xpath="//div[@id='productView']//a[contains(text(),'"+value+"')]";
			return driver.findElement(By.xpath(xpath));
		}
		
		/* filterd product name */
		@FindBy(xpath="//div[@id='productView']//a[contains(text(),'Rome 1 Seater Sofa in Maroon Colour')]")
		private WebElement txtFilteredProduct;
		
		/**
		 * Description: This generic method is to get all the categories of different elements
		 * @author Pavankumar
		 * @param value
		 */
		 public void getCategories(String value)
		 {
		    try 
		    { 
		    	for(WebElement wb : optionsOfGender(value) )
		    	{
		    		String Categories = wb.getText();
		    		System.out.println(Categories);
		    	}
		        System.out.println("Able to get categories of "+value);
			}
			catch(Exception e)
			{
				System.out.println("Unable to get categories of "+value);
				Assert.fail("Unable to get categories of "+value);
			}	
		}	
		 
		 /**
		   * Descrption: This method is to click on register button
		   * @author Pavankumar
		   * @param 
		   */
			public void clkCheckBox(String value) {
				try {
					 
					  filterByOptions(value).click();
					   System.out.println("Able to click on "+value);
				}catch(Exception e) {
					  System.out.println("unable click on register button "+value);
					   Assert.fail("unable to click on register button "+value);
				}
			}
		 
		 /**
		    * Descrption: This method is for mouse over on elements like sofa,FURNITURES,
		    * @author Pavankumar
			* @param value
		 * @throws Throwable 
			*/
			public void mouseOverOnElements(String value) throws Throwable {
				try {
					wLib.waitForPageLoad(driver);
					Thread.sleep(1000);
					wLib.mouseOver(driver, options(value));
					System.out.println("Able to mouseOver on "+value);
				}catch(Exception e) {
					System.out.println("unable to mouseOver on "+value);
					Assert.fail("unable to mouseOver on "+value);
				}
			}
		 
		/**
		 * Description: This method is to refresh page
		 * @author Pavankumar
		 * @param
		 */
		 public void refresh()
		 {
	        try 
	        { 
	        	driver.navigate().refresh();
	        	System.out.println("Able to refresh");
			}
			catch(Exception e)
			{
				System.out.println("Unable to refresh");
				Assert.fail("Unable to refresh");
			}	
		 }
		
		  /**
		    * Descrption: This method is for mouse over on login img
		    * @author Pavankumar
			* @param value
		 * @throws Throwable 
			*/
			public void mouseOverOnlnkLoginImg() throws Throwable {
				try {
					wLib.waitForPageLoad(driver);
					wLib.mouseOver(driver, lnkLoginImg);
					System.out.println("Able to mouseOver on lnkLoginImg");
				}catch(Exception e) {
					System.out.println("unable to mouseOver on lnkLoginImg");
					Assert.fail("unable to mouseOver on lnkLoginImg ");
				}
			}
			
		  /**
		   * Descrption: This method is to click on register button
		   * @author Pavankumar
		   * @param 
		   */
			public void clkRegister() {
				try {
					 
					   btnRegister.click();
					   System.out.println("Able to click on register button");
				}catch(Exception e) {
					  System.out.println("unable click on register button ");
					   Assert.fail("unable to click on register button ");
				}
			}
			
			/**
			   * Descrption: This method is to click on ExistingUser link
			   * @author Pavankumar
			   * @param 
			   */
				public void clkExistingUser() {
					try {
						 
						lnkExistingUser.click();
						   System.out.println("Able to click on ExistingUser link");
					}catch(Exception e) {
						  System.out.println("unable click on ExistingUser link ");
						   Assert.fail("unable to click on ExistingUser link ");
					}
				}
				
				/**
				   * Descrption: This method is to enter mobile num
				   * @author Pavankumar
				   * @param 
				   */
					public void setMobileNum(String MobileNum) {
						try {
							 
							tfMobNum.sendKeys(MobileNum);
							   System.out.println("Able to enter mobile num");
						}catch(Exception e) {
							  System.out.println("unable to enter mobile num");
							   Assert.fail("unable to enter mobile num ");
						}
					}
					
				/**
				* Descrption: This method is to enter Password)
			    * @author Pavankumar
		        * @param 
	        	*/
				public void setPassword(String Password) {
				try {
						 Thread.sleep(1000);
						tfPassword.sendKeys(Password);
						System.out.println("Able to enter Password)");
					}catch(Exception e) {
						System.out.println("unable to enter Password)");
					    Assert.fail("unable to enter Password) ");
					}
			   }
						
				/**
				 * Descrption: This method is to click on LoginButton
				 * @author Pavankumar
				* @param 
				*/
				public void clkLoginButton() {
				  try {
							 
						btnLogin.click();
					    System.out.println("Able to click on LoginButton");
				}catch(Exception e) {
					   System.out.println("unable click on LoginButton ");
					   Assert.fail("unable to click on LoginButton");
					}
				}	
							
				/**
				 * Descrption: This method is to click on LoginButton
				 * @author Pavankumar
			     * @param 
				*/
				public void clKArra() {
				  try {
							lnkArra.click();
							System.out.println("Able to click on arra ");
					}catch(Exception e) {
							 System.out.println("unable click on arra ");
							 Assert.fail("unable to click on arra");
						}
					}						

				/**
				 * Description: This method is to scroll down
				 * @author Pavankumar
				 * @param
				 */
				 public void scrolldown()
				 {
					 try 
					 { 
						Thread.sleep(1000);
						Robot r = new Robot();
						r.keyPress(KeyEvent.VK_PAGE_DOWN);
						r.keyRelease(KeyEvent.VK_PAGE_DOWN);
						System.out.println("Able to scroll down ");
					}
					catch(Exception e)
					{
						System.out.println("Unable to scroll down");
						Assert.fail("Unable to scroll down");
					}	
				}
								 
				 /**
				 * Descrption: this method is to get filtered validate
				 * @author Pavankumar
				 * @param 
				 */
				public void getFiltraionsAndValidate(String value)
				{
					try 
					{				
						String actualFilter = filterdProduct(value).getText();
						String appliedFilter = filter(value).getText();
						Assert.assertEquals(actualFilter, appliedFilter);
						System.out.println("Able to verify actual Filtered ");
					}
					catch(Exception e) 
					{
						System.out.println("unable to  verify actual Filtered ");
						Assert.fail("unable to verify actual Filtered ");
					}
				} 
				
				/**
				 * Descrption: this method is to get filtered validate
				 * @author Pavankumar
				 * @param 
				 */
				public void validateFilter(ArrayList<String> expected)
				{
					try 
					{	
						List<WebElement> list = driver.findElements(By.xpath("//ul[@class='clipFilter__applied-tab']/li"));
						ArrayList<String> actual = new ArrayList<String>();
						for(WebElement wb : list )
				    	{
				    		actual.add(wb.getText());
				    		System.out.println(wb.getText());
				    	}
						
					//	ArrayList<String> expected = new ArrayList<String>();
					//		expected.add(Price);
					//		expected.add();
							Assert.assertEquals(expected, actual);
						System.out.println("Able to verify actual Filtered ");
					}
					catch(Exception e) 
					{
						System.out.println("unable to  verify actual Filtered ");
						Assert.fail("unable to verify actual Filtered ");
					}
				} 
								 
				/**
				* Descrption: this method is to get name filtered product
				* @author Pavankumar
				* @param 
				*/
				public void getFilteredProduct(String value)
				{
					try 
				    {	
						String actualFilter = filterdProduct(value).getText();
						System.out.println(actualFilter);
						System.out.println("Able to get actual Filtered Jeans ");
					}
					catch(Exception e) 
					{
						System.out.println("unable to get actual Filtered Jeans");
						Assert.fail("unable to  get actual Filtered Jeans");
					}
				} 
				
				/**
				* Descrption: this method is to get price of filtered product
				* @author Pavankumar
				* @param 
				*/
				public void getFilteredProductPrice(String value)
				{
					try 
				    {	
						String actualFilterPrice = txtPrice.getText();
						System.out.println(actualFilterPrice);
						System.out.println("Able to get actual Filtered sofa ");
					}
					catch(Exception e) 
					{
						System.out.println("unable to get actual Filtered sofa");
						Assert.fail("unable to  get actual Filtered sofa");
					}
				} 
				/**
				 * Description: This method is to click on Filtered product
			     * @author Pavankumar
				 * @param value
				 */
				public void clkFilteredProduct(String value)
				{
					try 
					{ 
						Thread.sleep(1000);
						txtFilteredProduct.click();
					//	filterdProduct(value).click();
						System.out.println("Able to click Filtered sofa");
					}
					catch(Exception e)
					{
						System.out.println("Unable to click on Filtered sofa ");
						Assert.fail("Unable to click on Filtered sofa");
					}	
				}

}
