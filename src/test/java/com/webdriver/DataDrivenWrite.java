package com.webdriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenWrite extends BaseClass{
	@Test
	public void dataDrivenApache() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(dataRead("Sheet1", 0, 0)); 
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.clear();
		append.sendKeys(dataRead("Sheet1", 1, 0));
		
	}

}

