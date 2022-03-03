package PomClass_PaperFry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class ValidationPage
{
	/*
	 * Description:Page is used for validate the filtered product
	 * @Author Shobha
	 * */
	
	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;
	public ValidationPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	/* validte first Product */
	@FindBy(xpath="//a[text()='Eternal Queen Bed With Hydraulic Storage in Teak & Light Grey Colour']")
	private WebElement vldtFstPdt;
	
	/* validate filter product */
	@FindBy(xpath="//div[@class='pf-col sm-12']")
	private WebElement filterPdt;
	
	
	
	/**
	 * Description:Method is used for validate filters
	 * @author Shobha
	 */
	public void validatelogo()
	{
		try {
		System.out.println(vldtFstPdt.getText());
		String fstPdt = "Eternal Queen Bed With Hydraulic Storage In Teak & Light Grey Colour";
		Assert.assertEquals(vldtFstPdt.getText(), fstPdt);
		System.out.println("===succesfully validate Fst Pdt===");
		}catch(Exception e)
		{
			System.out.println("==notvalidate Fst Pdt==");
			Assert.fail("==not validate Bag name==");
		}
		
	}
	
	public void validation()
	{
		try {
			System.out.println(filterPdt.getText());
			String filters = "30000 And Above Modern Engineered Wood Clear Filters";
			Assert.assertEquals(filterPdt.getText(), filters);
			System.out.println("===succesfully validate filters===");
			}catch(Exception e)
			{
				System.out.println("==not validate filters==");
				Assert.fail("==not validate filters==");
			}

	}
	}



