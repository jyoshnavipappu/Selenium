package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandling {
	static WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void windowHandling() throws InterruptedException
	{
		driver.get("http://www.leafground.com/pages/Window.html");
		Thread.sleep(5000);

		driver.findElement(By.id("home")).click();
		Thread.sleep(5000);

		Set<String> window_value = driver.getWindowHandles();
		Thread.sleep(5000);

		Iterator<String> iter = window_value.iterator();
		String w1 = iter.next();
		String w2 = iter.next();
		Thread.sleep(5000);

		driver.switchTo().window(w2);
		Thread.sleep(5000);

		System.out.println(w1);
		System.out.println(w2);
		Thread.sleep(5000);

		String title_child = driver.getTitle();
		System.out.println(title_child);

		String url = driver.getCurrentUrl();
		String source = driver.getPageSource();

		System.out.println(url);
		Thread.sleep(5000);

		System.out.println(source);
		Thread.sleep(5000);

	}
	@Test(enabled=false)
	public void windowsCount() throws InterruptedException 
	{
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@onclick=\"openWindows()\"]")).click();
		Thread.sleep(5000);
		
		String parentHandle = driver.getWindowHandle();
		Set<String> AllWindows = driver.getWindowHandles();
		int count = 0;
		for (String childWindow : AllWindows)
		{
			if(!AllWindows.equals(parentHandle))
			{
				driver.switchTo().window(childWindow);
				count ++;
				driver.manage().window().maximize();
			}
		}
		System.out.println("Windows Count: " +count);
		driver.close();
	}
	@Test(enabled=false)
	public void closeAllExpectWindows() throws InterruptedException 
	{
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick=\"openWindows();\"]")).click();
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Set<String> AllWindows = driver.getWindowHandles();
		Thread.sleep(2000);
		
		for(String childWindow : AllWindows)
		{
			if(!parentHandle.equals(childWindow))
			{
				driver.switchTo().window(childWindow).close();
			}
		}
	}
	@Test(enabled=false)
	public void windowsToOpen() throws InterruptedException
	{
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick=\"openWindowsWithWait();\"]")).click();
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String all : childWindow)
		{
			WebDriver window = driver.switchTo().window(all);
		}
	}
	
}
