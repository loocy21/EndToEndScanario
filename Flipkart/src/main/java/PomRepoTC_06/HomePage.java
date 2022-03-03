package PomRepoTC_06;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This page is used for Perform end to end Scanario
 * @author Shobha
 *
 */

public class HomePage 
{
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/* logo MouseOver */
	@FindBy(xpath="//a[text()='Women' and @class='desktop-main']")
	private WebElement mouseOver;
	
	/* option Click */
	@FindBy(xpath="//a[text()='Indian & Fusion Wear']")
	private WebElement clickText;
	
	/*get all Text*/
	@FindBy(xpath="//h4[@class='product-product']")
	private List<WebElement> allText;
	
	/* Check box click */
	@FindBy(xpath="//label[text()='Sarees']")
	private WebElement clickCheckBox;
	
	/* Product image */
	@FindBy(xpath="//img[@alt='Saree mall Mustard Party Wear Saree with Matching Blouse']")
	private WebElement clickFirstProduct;
	
	/*addToCart Button */
	@FindBy(xpath="//div[text()='ADD TO BAG']")
	private WebElement addToCartClick;
	
	
	/* WishList Button */
	@FindBy(xpath="//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist']")
	private WebElement moveToWishList;
	
	/**
	 * Description:Method is used for mouse of perform mouseOver
	 * @param driver
	 * @throws Throwable
	 */
	public void homepage() throws Throwable
	{
		try
		{
		web.waitForPageLoad(driver);
		web.mouseOver(driver, mouseOver);
		clickText.click();
		System.out.println("===mouseOver on fusion wear=====");
		}catch(Exception e)
		{
			System.out.println("mouseOver on fusion wear");
			Assert.fail("mouseOver on fusion wear");
		}
		
	}
	/*
	 * Description:Method is used for get all text of dress
	 * @Author Shobha
	 * */
	public void getAllText()
	{
		try {
		for (WebElement webElement : allText)
		{
			System.out.println(webElement.getText());
		}
		clickCheckBox.click();
		clickFirstProduct.click();
		System.out.println("===get text all product succesfully===");
		}catch(Exception e)
		{
			System.out.println("get text all product not succesfully");
			Assert.fail("get text all product not succesfully");
		}
	}
	/**
	 * Description:Method is used for switchToWindow 
	 * @author Shobha
	 * @param driver
	 */
	public void WindowHandling()
	{
		try {
		web.switchToWindow(driver, "Buy Saree Mall Mustard Party Wear Saree With Matching Blouse  - Sarees for Women 14984834 | Myntra");
		web.ClickableElement(driver, addToCartClick);
		web.ClickableElement(driver, moveToWishList);
		System.out.println("====switch Tab Succesfully====");
		}catch(Exception e)
		{
			System.out.println("===window not switching===");
			
		}
		
	}


}



