package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitClass {
static WebDriver driver;
		
		
		@BeforeMethod
		public void beforemethods() {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		@Test
		public void implicitwaits()  {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("http://www.leafground.com/pages/Window.html");
			
			driver.findElement(By.id("home")).click();
			
			driver.close();
		}
		@Test
		public void explicit()
		{

			WebDriverWait wait = new WebDriverWait(driver,20);
			
			driver.navigate().to("http://leafground.com/");
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Button")));
			
			driver.findElement(By.linkText("Button")).click();
			
			driver.close();
		}
		@Test
		public void fluent() 
		{

			FluentWait wait=new FluentWait(driver)
					.withTimeout(20,TimeUnit.SECONDS)
					.pollingEvery(5, TimeUnit.SECONDS)
					.ignoring(Throwable.class);
			
			
			driver.navigate().to("http://leafground.com/");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
			driver.findElement(By.linkText("Edit")).click();
			
			driver.close();

		}

}


