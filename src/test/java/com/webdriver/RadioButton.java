package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	@Test
	public void radiobutton() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.linkText("Radio Button")).click();
		Thread.sleep(2000);		
		
		driver.findElement(By.id("yes")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("no")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("news")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='0']")).click();
		
	}
	

}
