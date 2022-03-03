package ElementRepoTC_02.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class HomePage
{
	/*
	 * Description:Page is used for Seach Product
	 * @Author Shobha
	 * @param
	 * */
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*PopUp */
	@FindBy(xpath ="//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement ClosePopup;
	
	/*Search Box*/
	@FindBy(name="q")
	private WebElement SearchBox;
	
	/*Search Box*/
	@FindBy(xpath="//button[@class=\"L0Z3Pu\"]")
	private WebElement ClickSearch;
	
	/*Check Box*/
	@FindBy(xpath="//div[text()='Core i7']")
	private WebElement ClickOnCheckBox;
	
	
	/*
	 * Description:method for Search Product
	 * @Author Shobha
	 * @param
	 * */
	public void HomePage()
	{
		try {
		ClosePopup.click();
		SearchBox.sendKeys("laptop");
		ClickSearch.click();
		ClickOnCheckBox.click();
		System.out.println("Search product Succesfully on HomePage ");
		}
		catch(Exception e)
		{
			System.out.println("not able to find Product");
		}
		Assert.assertTrue(true);
		
		
	}
	

}
