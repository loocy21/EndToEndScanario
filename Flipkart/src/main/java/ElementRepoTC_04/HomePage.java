package ElementRepoTC_04;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilities.WebDriverUtility;

public class HomePage
{
	/*
	 * Description:Page is used for Search Product
	 * @Author Shobha
	 * */
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/* All Button */
	@FindBy(id="nav-hamburger-menu")
	private WebElement allbtn;
	
	/* Computer Click*/
	@FindBy(xpath="//div[text()='Computers']")
	private WebElement clickBtn;
	
	/*Monitor Click*/
	@FindBy(linkText = "Monitors")
	private WebElement clickMonitor;
	
	/*Get Text */
	@FindBy(xpath="//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-4\"]")
	private List<WebElement> allMonitor;
	 
	
	/**
	 * Description:Method is used for Search Monitor
	 * @throws Throwable
	 */
	public void homepage() throws Throwable
	{
		
		allbtn.click();
		clickBtn.click();
			web.waitForPageLoad(driver);
			Thread.sleep(3000);
			//ClickMonitor.click();
	}
	/**
	 * Description:Method is used for get text for all the Monitors
	 * @throws Throwable
	 */
	
	public void ProductList() throws Throwable
	{
		try {
			web.waitForPageLoad(driver);
			Thread.sleep(3000);
			clickMonitor.click();
			List<WebElement> list =allMonitor;
			for(WebElement ele:list)
			{
				String s = ele.getText();
				
				System.out.println(s);
				//System.out.println("Fetch all text Succesfully");
			}
			System.out.println("=======get all text Succesfully======");
			}catch(Exception e) {
			System.out.println("======not able to get all text====");
		}
		Assert.assertTrue(true);
	}



}
			 
	


			
		
		
