package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void dragAndDrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://www.leafground.com/pages/drop.html");
		//WebElement e1 = driver.findElement(By.id("email"));
		driver.get("http://www.leafground.com/pages/drag.html");
		Actions act1 = new Actions(driver);
		
		//WebElement e2 = driver.findElement(By.id("draggable"));
		//WebElement e3 = driver.findElement(By.id("droppable"));
		WebElement e4 = driver.findElement(By.xpath("//div[@style=\"background-color: forestgreen; position: relative;\"]"));
		Thread.sleep(5000);
		
		//act1.dragAndDrop(e2, e3).build().perform();
		
		act1.dragAndDropBy(e4, 25, 30).build().perform();
		}
}
