package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownModule {
	@Test
	public void dropdown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.linkText("Drop down")).click();	
		Thread.sleep(2000);
		
		Select s1 = new Select(driver.findElement(By.id("dropdown1")));
		
		s1.selectByVisibleText("Select training program using Index");
		Thread.sleep(2000);
		
		s1.selectByVisibleText("UFT/QTP");
		Thread.sleep(2000);
		s1.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		Select s2 = new Select(driver.findElement(By.name("dropdown2")));
		s2.selectByIndex(1);
		s2.selectByIndex(3);
		
		Select s3 = new Select(driver.findElement(By.className("dropdown")));
		Thread.sleep(2000);
		s3.selectByValue("2");
		Thread.sleep(2000);
		//s3.deselectByValue("2");
		
		
	}
}
