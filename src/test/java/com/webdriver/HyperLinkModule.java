package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperLinkModule {
@Test
	
	public void module1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.linkText("HyperLink")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		Thread.sleep(2000);
		
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		Thread.sleep(2000);
		
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.quit();
	}
}
