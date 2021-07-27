package com.webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Frames {
	static WebDriver driver;
	@BeforeMethod
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void iframes() throws InterruptedException  {

		driver.get("http://leafground.com/pages/frame.html");
		Thread.sleep(3000);
		
		WebElement frameSwitching = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		Thread.sleep(3000);
		
		WebDriver frame = driver.switchTo().frame(frameSwitching);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
	@Test
	public void nestedframesAutomation() throws InterruptedException  {

		driver.get("http://leafground.com/pages/frame.html");
		Thread.sleep(3000);
		
		WebElement frameSwitching = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		Thread.sleep(3000);
		
		WebDriver frames = driver.switchTo().frame(frameSwitching);
		WebElement nestedFrame = driver.findElement(By.xpath("//iframe[@src=\"nested.html\"]"));
		Thread.sleep(3000);
		
		WebDriver frames1 = driver.switchTo().frame(nestedFrame);
		driver.findElement(By.xpath("//button[@id='Click1']")).click();
		driver.close();
	}
	@Test
	public void findTotalframes() throws InterruptedException  {
		int count=0;
		driver.get("http://leafground.com/pages/frame.html");
		Thread.sleep(3000);
		
		WebElement findElement = driver.findElement(By.xpath("(//div[@id='wrapframe'])[3]"));
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		for (WebElement webElement : list) {
		String text = webElement.getText();
		System.out.println(text);
		count++;
		}
		System.out.println(count);
	}
}