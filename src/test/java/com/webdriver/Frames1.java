package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames1 {
	@Test
	public void frame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		int size1 = driver.findElements(By.xpath("//iframe[@src=\"page.html\"]")).size();
		System.out.println(size1);}
	@Test
	public void findTotalframes() 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver ;
	driver = new ChromeDriver();
	{
		int count=0;
		driver.get("http://leafground.com/pages/frame.html");
		WebElement findElement = driver.findElement(By.xpath("(//div[@id='wrapframe'])[3]"));
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		for (WebElement webElement : list) {
		String text = webElement.getText();
		System.out.println(text);
		count++;
		}
		System.out.println(count);
		}
	}
}
