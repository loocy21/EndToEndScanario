package ElementRepo_Ajio;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class FilterPage 
{
	
		/*
		 * Description:Page is used for filter record and Select Product
		 * @Author Shobha
		 * */
		
		WebDriverUtility web = new WebDriverUtility();
		WebDriver driver = null;
		public FilterPage(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
	
		/* select gender */
		@FindBy(xpath="//label[@for='Men']")
		private WebElement cbGender;
		
		/* expand price */
		@FindBy(xpath="//span[text()='price']")
		private WebElement clkPrice;
		
		/* select price */
		@FindBy(xpath="//label[@for='Below Rs.500']")
		private WebElement cbPrice;
		
		/* expand brands */
		@FindBy(xpath="//span[text()='brands']")
		private WebElement clkBrands;
		
		/* select brand */
		@FindBy(xpath="//label[@for='F-GEAR']")
		private WebElement cbBrand;
		
		/* select brand */
		@FindBy(xpath="//label[@for='FIG']")
		private WebElement cbBrand1;
		
		/* expand discount */
		@FindBy(xpath="(//span[@class='facet-left-pane-label'])[6]")
		private WebElement clkDiscunt;
		
		
		/* select discount */
		@FindBy(xpath="//label[@for='51-80%']")
		private WebElement cbDiscunt;
		
		/* get text bags */
		@FindBy(xpath="//div[@class='nameCls']")
		private List<WebElement> gettextall;
		
		/* select first bag */
		@FindBy(xpath="//div[@class='imgHolder']")
		private WebElement clkFirst;
		
		/**
		 * Description:Method is used for Filter the product 
		 * @author Shobha
		 */
		public void fltrProduct()
		{
			try {
			cbGender.click();
			web.ClickableElement(driver, clkPrice);
			web.ClickableElement(driver, cbPrice);
			web.ClickableElement(driver, clkBrands);
			web.ClickableElement(driver, cbBrand);
			web.ClickableElement(driver, cbBrand1);
			web.ClickableElement(driver, clkDiscunt);
			web.ClickableElement(driver, cbDiscunt);
			System.out.println("filter Product Succesfully");
			}catch(Exception e)
			{
				System.out.println("product not filtered");
				Assert.fail("product not filtered");
			}

		}
		/**
		 * Description:Method is used for get all text in the page
		 * @author Shobha
		 */
		public void gettxtall()
		{
			List<WebElement> list =gettextall;
			try {
				for(WebElement ele:list)
				{
					String s = ele.getText();
					System.out.println(s);

				}
				System.out.println("===get all text Succesfully and select First one===");
			}catch(Exception e)
			{
				System.out.println("not able to take all list");
				Assert.fail("not able to take all list");
			}
			
			web.ClickableElement(driver, clkFirst);
			}
}



	