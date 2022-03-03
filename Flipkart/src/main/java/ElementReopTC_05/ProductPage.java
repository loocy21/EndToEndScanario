package ElementReopTC_05;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	/*
	 * Description:Page is used for Validate the Page
	 * 
	 * @Author Shobha
	 **/

	WebDriver driver = null;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/**
	 * Description:Method is used for Validate the Product Page
	 * 
	 * @author Shobha
	 */
	public void Validate() {
		try {

			/* validation */
			String Actualtitle = "Samsung Galaxy S21 FE 5G Cell Phone, Factory Unlocked Android Smartphone, 128GB, 120Hz Display, Pro Grade Camera, All Day Intelligent Battery, US Version, Lavender : Everything Els";
			String ExpectedTitle = driver.getTitle();
			Assert.assertEquals(Actualtitle, ExpectedTitle);
			System.out.println("Actualtitle=" + Actualtitle);
			System.out.println("Page Validate Succesfully");
		} catch (Exception e) {
			System.out.println("not Validate");
		}

	}
}
