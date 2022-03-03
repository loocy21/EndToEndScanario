package PomClass_PaperFry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilities.WebDriverUtility;

public class HomePage {

	/*Description: This Page is use for click one Element and filtering the record
	 * 
	 * @Author Shobha
	 * @param
	 * */
	
	 WebDriverUtility web = new  WebDriverUtility();
	 WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Click Login Button */
	@FindBy(xpath="(//a[@class=\"popup-close\"])[4]")
	private WebElement close;
	
	
	/* mouse Over on sofas*/
	@FindBy(xpath="//a[@rel='meta-sofasrecliners']")
	private WebElement mouseOvrSofa;
	
	
	/* Click Home */
	@FindBy(xpath ="(//a[@href='https://www.pepperfry.com/brands/at-home.html?type=hover&cat='])[1]")
	private WebElement clkHome;
	
	/* check Box price */
	@FindBy(xpath="//label[text()='Over ₹ 30,000']")
	private WebElement cbPrice;
	
	/* check Box style */
	@FindBy(xpath="//label[text()='Modern' ]|/span[text()=' (15)']")
	private WebElement cbStyle;
	
	
	/* check Box material */
	@FindBy(xpath="//label[text()='Engineered Wood' ]|/span[text()=' (7)']")
	private WebElement cbMaterial;
	
	/* check Box Discount */
	@FindBy(xpath="//label[text()='Hydraulic Storage' ]|/span[text()=' (4)']")
	private WebElement cbDiscnt;
	
	/* click First Product */
	@FindBy(xpath="//img[@alt=Eternal King Bed With Hydraulic Storage in Teak & Light Grey Colour']")
	private WebElement clkPrdt;
	
	public void filterProdt(WebDriver driver) throws Throwable
	{
		try {
		web.ClickableElement(driver, close);
		web.mouseOver(driver, mouseOvrSofa);
		clkHome.click();
		cbPrice.click();
		web.scrollBar(driver, cbStyle);
		cbStyle.click();
		web.scrollBar(driver, cbMaterial);
		cbMaterial.click();
		web.scrollBar(driver, cbDiscnt);
		cbDiscnt.click();
	
		clkPrdt.click();
		System.out.println("filter the product succesfully");
		
		}
		catch(Exception e )
		{
			System.out.println("product not filter");
		}
	}

}


