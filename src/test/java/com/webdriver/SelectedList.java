package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectedList {
	@Test
	public void selectedList() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.findElement(By.xpath("//a[@href=\"#Serialize\"]")).click();
		//int size1 = driver.findElements(By.xpath("//div[@id=\"Serialize\"]/li")).size();
		
		//System.out.println(size1);
		
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li"));
		
		int size = driver.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li")).size();
		System.out.println(size);
		
		Actions act1 = new Actions(driver);
		act1.keyDown(Keys.CONTROL).click(ele1.get(0)).click(ele1.get(2)).click(ele1.get(4)).click(ele1.get(6)).build().perform();
								
		
	}
}
