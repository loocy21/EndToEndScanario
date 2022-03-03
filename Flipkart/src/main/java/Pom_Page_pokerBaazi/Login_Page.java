package Pom_Page_pokerBaazi;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilities.WebDriverUtility;




/**
 * Description: This class consists of Locaters and generic methods related to Login page
 * @author Shobha
 *
 */
public class Login_Page {
	WebDriver driver;
	WebDriverUtility web= new WebDriverUtility();
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement tfUsername;
	/*Dynamic xpath Text Filed Options*/
	

	/*Dynamic xpath Link Options*/
	public WebElement linkOptions(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public void username(String id,String username) throws Throwable
	{
		Thread.sleep(4000);
		tfUsername.sendKeys(username);
	}
}



