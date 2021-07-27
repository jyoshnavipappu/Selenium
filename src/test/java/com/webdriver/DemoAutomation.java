package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAutomation {
	@Test
	public void alertmodule() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		//Alert box
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		Thread.sleep(2000);
		
		String text = driver.switchTo().alert().getText();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		System.out.println(text);
		Thread.sleep(2000);
		
		//Confirmation box
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		Thread.sleep(2000);
		
		String t1 = driver.switchTo().alert().getText();
		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		System.out.println(t1);

		//Prompt Box
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		Thread.sleep(2000);

		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(a1.getText());
		Thread.sleep(2000);
		
		a1.sendKeys("Hello");
		Thread.sleep(2000);

		a1.accept();
		Thread.sleep(2000);
		
		driver.quit();

	}
}
