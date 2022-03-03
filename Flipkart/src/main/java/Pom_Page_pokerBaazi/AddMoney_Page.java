package Pom_Page_pokerBaazi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains AddMoney and varify the kyc details
 * @author Shobha
 *
 */

public class AddMoney_Page 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public AddMoney_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/* Genric xpath of button cashier and responcible gaming section & for kyc button & text field amount & Proceed to payment */

	private WebElement btnAddMny(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	} 



	/* Genric xpath of all auto suggestion */
	private WebElement autoSugg(String deposit) {
		String xpath = "//span[text()='"+deposit+"']/ancestor::div[@class='add-money-card__amount-chips']/descendant::div[@class='pbButton']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Genric xpath of exceeded popup and Promo text field */
	private WebElement tfPromo(String value) {
		String xpath = "//input[@placeholder='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	/* Genric xpath of button apply */
	private WebElement btnApply(String apply) {
		String xpath = "(//span[contains(text(),'"+apply+"')])[1]";
		return driver.findElement(By.xpath(xpath));
	} 



	/* Genric xpath of varify address */
	private WebElement tfAddress(String varifyAdd) {
		String xpath = "//span[contains(text(),'"+varifyAdd+"')]/ancestor::div[@class='pb-container background__grey-image   ']/descendant::div[@class='address-field']";
		return driver.findElement(By.xpath(xpath));
	}
	/* Genric xpath of view all deposite code */
	private WebElement viewDepCode(String value) {
		String xpath = "//div[@class='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	} 

}






