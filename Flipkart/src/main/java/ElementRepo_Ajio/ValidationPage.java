package ElementRepo_Ajio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class ValidationPage 
{
	/*
	 * Description:Page is used for filter record and Select Product
	 * @Author Shobha
	 * */
	
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;
	public ValidationPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	/* get logo name */
	@FindBy(xpath="//div[text()='Bags']")
	private WebElement vldtBag;
	
	/* expand price */
	@FindBy(xpath="//div[@class='fnl-plp-afliter']/descendant::span[text()='Men']")
	private WebElement clkPrice;
	
	
	
	/* select brand */
	@FindBy(xpath="//div[@class=\"fnl-plp-filtervisible\"]")
	private WebElement filters;
	
	/**
	 * Description:Method is used for validate Bag Logo
	 * @author Shobha
	 */
	public void validatelogo()
	{
		try {
		System.out.println(vldtBag.getText());
		String logoName = "Bags";
		Assert.assertEquals(vldtBag.getText(), logoName);
		System.out.println("===succesfully validate Bag logo===");
		}catch(Exception e)
		{
			System.out.println("==not validate Bag logo==");
			Assert.fail("==not validate Bag name==");
		}
		
	}
	
	public void validation()
	{
		try {
			System.out.println(filters.getText());
			String logoName = "MenBelow Rs.500F-GEARFIG51-80%";
			Assert.assertEquals(filters.getText(), logoName);
			System.out.println("===succesfully validate filters===");
			}catch(Exception e)
			{
				System.out.println("==not validate filters==");
				Assert.fail("==not validate filters==");
			}

	}
	}


