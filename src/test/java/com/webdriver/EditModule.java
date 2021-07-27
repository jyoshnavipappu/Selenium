package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditModule {
	@Test
	
	public void module1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("Jyoshnavi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name=\"username\"])[1]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name=\"username\"])[1]")).sendKeys("Pappu");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).sendKeys("JP");
		Thread.sleep(2000);
		
		boolean enabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isDisplayed();
		
		System.out.println(enabled);
		driver.close();
	}

}
