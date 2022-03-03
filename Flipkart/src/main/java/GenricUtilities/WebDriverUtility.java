package GenricUtilities;

import java.io.File;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;	
import java.awt.event.KeyEvent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class contains java specific generic libraries  
 * 
 * @author shobha
 *
 */

public class WebDriverUtility 
{
	/**
	 *This method maximize for the webPage to be visible 
	 * @author shobha
	 */
	
	public void maximizePage(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method wait for 20 sec for page loading
	 * @param driver
	 */
	
	public void  waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	/**
	 * This method will perform mouse over action
	 * @param driver
	 * @param string
	 * @throws Throwable 
	 */
	
	public void mouseOver(WebDriver driver,WebElement ele) throws Throwable
	{
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	/**
	 * This method will perform action on Right Click
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver , WebElement ele)
	{
		Actions ac = new Actions(driver);
		ac.contextClick(ele).build().perform();
		
	}
	/**
	 * This method will action on double click
	 * @param driver
	 * @param ele
	 */
	
	public void doubleClick(WebDriver driver , WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).build().perform();
	}
	/**
	 * This method will perform action on drag and drop
	 * @param driver
	 * @param ele
	 */
	public void dragandDrop(WebDriver driver , WebElement ele)
	{
		Actions a1= new Actions(driver);
		a1.dragAndDrop(ele, ele).build().perform();
	}
	/**
	 * this methods enables user to handle dropdown using index
	 * @param index
	 * @param element
	 */
	
	public void selectByindex(int index, WebElement element)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
				
	}
	/**
	 * this methods enables user to handle dropdown using value
	 * @param value
	 * @param element
	 */
	
	public void selectByValue(String value , WebElement element )
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	/**
	 * this methods enables user to handle dropdown using visibleText
	 * @param value
	 * @param element
	 */
	public void selectByVisibleText(String value , WebElement element)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	/**
	 * this methods enables user to handle Scroll bar
	 * @param driver
	 * @param ele
	 */
	public void scrollBar(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	  
    /**
     * This method helps to switch from one window to another window
     * @param driver
     * @param partialWinTitle
     */
   public void switchToWindow(WebDriver driver, String partialWinTitle)
   {
	   Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   while(it.hasNext())
	   {
		   String winId=it.next();
		   String title=driver.switchTo().window(winId).getTitle();
           if(title.contains(partialWinTitle))
           {
        	   break;
           }
	   }
   }

	   public void acceptAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().accept();
	   }
	   
	   /**
	    * Cancel Alert
	    * @param driver
	    */
	   public void cancelAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().dismiss();
	   }
	   /**
	    * This method used for scrolling action in a webpage
	    * @param driver
	    * @param element
	    */
	   public void scrollToWebElement(WebDriver driver, WebElement element) {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		  int y= element.getLocation().getY();
		   js.executeScript("window.scrollBy(0,"+y+")", element);
	   }
	   
	   /**
	    * This method used for handling the frame
	    * @param driver
	    * @param index
	    */
	    public void switchFrame(WebDriver driver,int index) {
	    	driver.switchTo().frame(index);
	    }  
	    /**
	     * This method used for handling the frame 
	     * @param driver
	     * @param element
	     */
	    
	    public void switchFrame(WebDriver driver,WebElement element) {
	    	driver.switchTo().frame(element);
	    } 
	    /**
	     * This method used for handling the frame by id
	     * @param driver
	     * @param idOrName
	     */
		
	    public void switchFrame(WebDriver driver,String idOrName) {
	    	driver.switchTo().frame(idOrName);
	    } 
	    /**
	     * This method is used for ScreenShot
	     * @param driver
	     * @param screenshotName
	     * @throws Throwable
	     */

	    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("./screenshot/"+screenshotName+".PNG");
	    	FileUtils.copyFile(src, dest);
	    	
	    }
   
	    
	    /**
	     * pass enter Key appertain in to Browser
	     * @param driver
	     */
	   public void passEnterKey(WebDriver driver) {
		   Actions act = new Actions(driver);
		   act.sendKeys(Keys.ENTER).perform();
	   } 
	   public void waitForElementClickable(WebDriver driver,WebElement element)
	   {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.elementToBeClickable(element));
		  wait.until(ExpectedConditions.visibilityOf(element));
	   }
	   public void ClickableElement(WebDriver driver , WebElement ele)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
		}
	   
	   public void ScrollDown(WebDriver driver) throws Throwable 
	   {
		   
		   Robot robot = new Robot();
		   
		   robot.keyPress(KeyEvent.VK_TAB);	
           Thread.sleep(2000);	
           robot.keyPress(KeyEvent.VK_TAB);	
           Thread.sleep(2000);	
           robot.keyPress(KeyEvent.VK_TAB);	
           Thread.sleep(2000);	
	   }
	public void waitForElementVisibility(WebDriver driver, WebElement ele)
	{

		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	   

	    
	

	   
	   }
	  




	

	

