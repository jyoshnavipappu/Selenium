package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertModule {
	 @Test
		
		public void alertmodule() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver;
			
			driver = new ChromeDriver();
			
			driver.get("http://leafground.com/");
			
			driver.findElement(By.linkText("Alert")).click();
			
			//driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
			
			//driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
			
			driver.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
			
			//String msg = driver.switchTo().alert().getText();
			Thread.sleep(2000);
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			
			alert.sendKeys("Hello");
			Thread.sleep(2000);
			
			alert.accept();
			
			//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
			//driver.switchTo().alert().sendKeys("Hello");
			
			//System.out.println(msg);
			//Thread.sleep(2000);


			
		}

}
