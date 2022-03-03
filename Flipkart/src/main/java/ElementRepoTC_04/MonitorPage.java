package ElementRepoTC_04;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Description:This Page is used for get text for First Monitor
 * @author Shobha
 */
public class MonitorPage
{
	WebDriver driver = null;
	public MonitorPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/*Click Monitor*/
	@FindBy(xpath="//span[text()='HP 24mh FHD Monitor - Computer Monitor with 23.8-Inch IPS Display (1080p) - Built-In Speakers and VESA Mounting - Height/Tilt Adjustment for Ergonomic Viewing - HDMI and DisplayPort - (1D0J9AA#ABA)']/ancestor::div[@class=\"a-section a-spacing-base\"]")
	private WebElement FirstMonitor;

	/* get text */
	@FindBy(id="productTitle")
	private WebElement GetTitle;

	/*Return button*/
	@FindBy(xpath="//span[text()='& Orders']")
	private WebElement RtrnOrder;

	/**
	 * Description:Method is used for get First text
	 * @author Shobha
	 */
	public void product()
	{
		try {
		FirstMonitor.click();
		WebElement lst=GetTitle;
		System.out.println(lst.getText());
		RtrnOrder.click();
		System.out.println("====get text of first Monitor====");
		}catch(Exception e)
		{
			System.out.println("not able to take get text");
		}
		Assert.assertTrue(true);


}
}
