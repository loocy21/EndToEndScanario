package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip 
{
	@Test
	public void tooptip()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/tooltip.html");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Download now']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='tooltip']"));
		System.out.println(ele1.getText());
		driver.close();
	}

}
