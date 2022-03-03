package ElementRepo_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.WebDriverUtility;

	public class BuyNowPage
	{
		/*
		 * Description:Page is used for buy now & validate the buy now Page
		 * @Author Shobha
		 * */
		
		WebDriverUtility web = new WebDriverUtility();
		WebDriver driver = null;
		public BuyNowPage(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
	
		/* get text of Ring Name */
		@FindBy(xpath="//h1[text()='The Celestina Ring']")
		private WebElement getTxtRingNm;
		
		/*get text price of ring */
		@FindBy(id="discountedPriceSpan")
		private WebElement getTxtRingRs;
		
		/* size text box */
		@FindBy(xpath="//span[text()=' Select a Ring Size ']")
		private WebElement sltRingSz;
		
		/* ring size select */
		@FindBy(xpath="//span[text()='11']")
		private WebElement sltSize;
		
		/*button buy now*/
		@FindBy(id="buy-now")
		private WebElement btnByNw;
		
		/**
		 * Description:Method is used for get text of ring and price 
		 * @param driver
		 * @throws Throwable
		 */
		public void getName() throws Throwable
		{
			try {
				web.switchToWindow(driver, "The Celestina Ring");
				WebElement lst=getTxtRingNm;
				System.out.println("RingName=="+lst.getText());
				
				WebElement list=getTxtRingRs;
				System.out.println("RingPrice=="+list.getText());
				
				sltRingSz.click();
				sltSize.click();
				btnByNw.click();
				System.out.println("===able to take get text and buy now===");
			}catch(Exception e)
			{
				System.out.println("not able to get text ");
				Assert.fail("not able to get text ");
				
			}
		}
		/**
		 * Description:Method is used for validate ring name
		 * @author Shobha
		 */
		public void validateProductName()
		{
			try
			{
				String ringName = "The Celestina Ring";
				Assert.assertEquals(getTxtRingNm.getText(),ringName);
				System.out.println("validate ring name succesfully");
			}catch(Exception e) {
				System.out.println("validate ring name succesfully");
				Assert.fail("validate ring name succesfully");
				
			}
			
				
			
				
				
			
		


		
		}
	}
	
