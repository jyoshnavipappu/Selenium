package com.webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Max_Min_Window {
	@Test
	public void maxminWindows() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		//driver.get("http://www.leafground.com/pages/Window.html");
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		//driver.navigate().forward();
		//Thread.sleep(2000);
		
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		
		driver.navigate().to("https://www.irctc.co.in/nget/");
		
		driver.manage().window().maximize();
		
		Dimension d1 = new Dimension(250,350);
		
		driver.manage().window().setSize(d1);
		}		
}