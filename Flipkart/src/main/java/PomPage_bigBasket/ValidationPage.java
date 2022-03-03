package PomPage_bigBasket;

import java.util.ArrayList;
import java.util.List;

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

	public void validateFilter(ArrayList<String> expected)
	{
		try 
		{	
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='hidden-xs product-deck-filter clearfix ng-scope']/descendant::li[@ng-repeat='filter in vm.filters']"));
			ArrayList<String> actual = new ArrayList<String>();
			for(WebElement wb : list )
	    	{
	    		actual.add(wb.getText());
	    		System.out.println(wb.getText());
	    	}
			Assert.assertEquals(expected, actual);
		

			ArrayList<String> expected1 = new ArrayList<String>();
			expected.add("Fresho");
			expected.add("Again");
			expected.add("India");
			expected.add("Summer Fruits"); 
			expected.add("1 pc");
			Assert.assertEquals(expected1, actual); 

		
			System.out.println("Able to verify actual Filtered ");
		}
		catch(Exception e) 
		{
			System.out.println("unable to  verify actual Filtered ");
			Assert.fail("unable to verify actual Filtered ");
		}
	} 




}
