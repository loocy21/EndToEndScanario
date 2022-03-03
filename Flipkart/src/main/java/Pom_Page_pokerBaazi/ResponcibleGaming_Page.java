package Pom_Page_pokerBaazi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains Responcecible gaming based scanario
 * @author Shobha
 *
 */

public class ResponcibleGaming_Page 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public ResponcibleGaming_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* button Responsible Gaming */
	private WebElement btnCashier(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	

	/* Genric xpath of headers avilable  */
	private <List>WebElement headers(String headerName) {
		String xpath = "//span[text()='"+headerName+"']/ancestor::header[@class='MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary pbTabs MuiPaper-elevation4']"
				+ "/descendant::button[@type='button']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/* button Responsible Gaming */
	private WebElement btnDecLimit(String decLimit) {
		String xpath = "//span[text()='"+decLimit+"']";
		return driver.findElement(By.xpath(xpath));
	}  
	
	/* Dynamic xpath of get text of decrease my limit */
	private <List>WebElement getText(String limit) {
		String xpath = "//span[text()='"+limit+"']/ancestor::table[@class='MuiTable-root']/descendant::tbody[@class='MuiTableBody-root']";
		return driver.findElement(By.xpath(xpath));
	}

	/*click of increase my limit */
	private WebElement btnIncLimit(String increaseLimit) {
		String xpath = "//span[text()='"+increaseLimit+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	
	/* cancel pop up */
	private WebElement cancelPopUp(String increaseLimit) {
		String xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-colorPrimary']";
		return driver.findElement(By.xpath(xpath));
	} 

}
