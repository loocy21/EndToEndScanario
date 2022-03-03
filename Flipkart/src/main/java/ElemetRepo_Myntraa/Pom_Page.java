package ElemetRepo_Myntraa;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

		
	public class Pom_Page 
	{
	
		WebDriver driver;
		WebDriverUtility web  = new WebDriverUtility();
		
		public Pom_Page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		/*category*/
		private WebElement category(String value) {
			String xpath= "//div[@class='vertical-filters-filters brand-container']/descendant::label[text()='"+value+"']";
			return driver.findElement(By.xpath(xpath));
		}
		
		/*validate category*/
		@FindBy(xpath= "//ul[@class=\"brand-list\"]/descendant::label[text()='Roadster']")
		private WebElement getTxtCategory;
		
		/*brand*/
		private WebElement brand(String value) {
			String xpath= "//div[@class=\"vertical-filters-filters\"]/descendant::label[text()='"+value+"']";
			return driver.findElement(By.xpath(xpath));
		}
		
		/*validate brand*/
		@FindBy(xpath= "//ul[@class='price-list']/descendant::label[text()='Rs. 1528 to Rs. 2065']")
		private WebElement getTxtBrand;
		
		/*price*/
//		private WebElement price(String value) {
//			String xpath= "//ul[@class='price-list']/descendant::label[text()='"+value+"']";
//			return driver.findElement(By.xpath(xpath));
//		}
		
		/*validate price */
		@FindBy(xpath= "//ul[@class='filter-summary-filterList']/descendant::div[text()='Rs. 428 To Rs. 6018']")
		private WebElement getTxtPrice;
		
		/*color*/
		private WebElement color(String value) {
			String xpath= "//li[@class='colour-listItem']/descendant::label[text()='"+value+"']";
			return driver.findElement(By.xpath(xpath));
		}
		
		/*validate color */
		@FindBy(xpath= "//div[@class='filter-summary-filter']/descendant::span[text()='Green']")
		private WebElement getTxtColor;
		
		/*discount*/
		private WebElement discount(String value) {
			String xpath= "//ul[@class='discount-list']/descendant::label[text()='"+value+"']";
			return driver.findElement(By.xpath(xpath));
		}
		/*validate discount */
		@FindBy(xpath= "//div[@class='filter-summary-filter']/descendant::span[text()='20 % and above']")
		private WebElement getTxtDiscount;
		
		/*select first saree*/
		@FindBy(xpath= "(//li[@class='product-base'])[1]")
		private WebElement selSaree;
		
		/*select size*/
		@FindBy(xpath= "//p[@class='size-buttons-unified-size']")
		private WebElement icnSize;
		
		/*product name*/
		@FindBy(xpath= "//h1[@class='pdp-name']")
		private WebElement txtProductName;
		
		/*product price*/
		@FindBy(xpath= "//span[@class='pdp-price']")
		private WebElement txtProductPrice;
		
		/*product size*/
		@FindBy(xpath= "//p[text()='Onesize']")
		private WebElement txtProductSize;
		
		/**
		 * Description: this method used for get product name
		 * @author Prashun
		 * @param 
		 */
		public void getProductName() {
			try {
				System.out.println(txtProductName.getText());	
				String productName = "Green & Yellow Ethnic Motifs Woven Design Jute Silk Saree";
				Assert.assertEquals(txtProductName.getText(), productName);
				System.out.println("sucessfully validate product name");
			} catch (Exception e) {
				System.out.println("unable validate product name");
				Assert.fail("unable validate product name");
			}
		}
		
		/**
		 * Description: this method used for get product size
		 * @author Prashun
		 * @param 
		 */
		public void getProductSize() {
			try {
				System.out.println(txtProductSize.getText());	
				String productSize = "M";
				Assert.assertEquals(txtProductSize.getText(), productSize);
				System.out.println("sucessfully validate product size");
			} catch (Exception e) {
				System.out.println("unable validate product size");
				Assert.fail("unable validate product size");
			}
		}
		
		/**
		 * Description: this method used for get product price
		 * @author Prashun
		 * @param 
		 */
		public void getProductprice() {
			try {
				System.out.println(txtProductPrice.getText());	
				String productPrice = "Rs. 660";
				Assert.assertEquals(txtProductPrice.getText(), productPrice);
				System.out.println("sucessfully validate product price");
			} catch (Exception e) {
				System.out.println("unable validate product price");
				Assert.fail("unable validate product price");
			}
		}
		
		/**
		 * Description: this method is used to click on category
		 * @author Prashun
		 * @param
		 * @throws Throwable 
		 */
		public void clkOnCategory(String value) throws Throwable {
			//try {
				Thread.sleep(3000);
				category(value).click();
//				String s = "jeans";
//				Assert.assertEquals(getTxtCategory.getText(), s);
//				System.out.println("sucessfully click on "+ value);
//			} catch (Exception e) {
//				System.out.println("unable click on " + value);
//				Assert.fail("unable click on " + value);
//			}
//		}
//		
			}
		
		/**
		 * Description: this method is used to click on brand
		 * @author Prashun
		 * @param
		 * @throws Throwable 
		 */
		public void clkOnBrand(String value) throws Throwable {
			//try {
				Thread.sleep(3000);
				brand(value).click();
//				String s = "Rs. 1528 to Rs. 2065";
//				Assert.assertEquals(getTxtBrand.getText(), s);
//				System.out.println("sucessfully click on "+ value);
//			} catch (Exception e) {
//				System.out.println("unable click on " + value);
//				Assert.fail("unable click on " + value);
//			}
		}
		
		/**
		 * Description: this method is used to click on price
		 * @author Prashun
		 * @param
		 */
//		public void clkOnprice(String value) {
//			try {
//				Thread.sleep(3000);
//				price(value).click();
//				System.out.println("sucessfully click on "+ value);
//			} catch (Exception e) {
//				System.out.println("unable click on " + value);
//				Assert.fail("unable click on " + value);
//			}
//		}
		/**
		 * Description: this method is used to click on color
		 * @author Prashun
		 * @param
		 */
		public void clkOnColor(String value) {
			try {
				Thread.sleep(3000);
				color(value).click();
				System.out.println("sucessfully click on "+ value);
			} catch (Exception e) {
				System.out.println("unable click on " + value);
				Assert.fail("unable click on " + value);
			}
		}
		
		/**
		 * Description: this method is used to click on discount
		 * @author Prashun
		 * @param
		 */
		public void clkOnDiscount(String value) {
			try {
				Thread.sleep(3000);
				discount(value).click();
				System.out.println("sucessfully click on "+ value);
			} catch (Exception e) {
				System.out.println("unable click on " + value);
				Assert.fail("unable click on " + value);
			}
		}
		
		/**
		 * Description: this method is used to select saree
		 * @author Prashun
		 * @param
		 */
		public void clkOnSaree() {
			try {
				Thread.sleep(3000);
				selSaree.click();
				String text = "Green & Yellow Ethnic Motifs Woven Design Jute Silk Saree";
				web.switchToWindow(driver, text);
				System.out.println("sucessfully click on saree");
			} catch (Exception e) {
				System.out.println("unable click on saree");
				Assert.fail("unable click on saree");
			}
		}
		
		/**
		 * Description: this method is used to select size
		 * @author Prashun
		 * @param
		 */
		public void clkOnSize() {
			try {
				Thread.sleep(3000);
				icnSize.click();
				System.out.println("sucessfully click on size");
			} catch (Exception e) {
				System.out.println("unable click on size");
				Assert.fail("unable click on size");
			}
		}
		
	}



