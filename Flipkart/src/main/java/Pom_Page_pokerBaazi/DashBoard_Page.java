package Pom_Page_pokerBaazi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains get text of all module name
 * @author Shobha
 *
 */

public class DashBoard_Page 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public DashBoard_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Genric xpath of button cashier*/
	private WebElement btnCashier(String value1) {
		String xpath = "//span[text()='"+value1+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	
	
	/* get text of all options */
	@FindBy(xpath="//div[@class='pb-container__body pb-sidebar__body']")
	private List<WebElement> getTextAll;
	
	
	/* Genric xpath of get text of cashBalance*/
	private <List>WebElement balance(String cashBalance) {
		String xpath = "//ul[@class='MuiList-root pb-list  MuiList-padding']/descendant::span[contains(text(),'"+cashBalance+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	

	

}
