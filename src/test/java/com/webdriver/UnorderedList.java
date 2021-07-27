package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UnorderedList {
	@Test
	public void unorderedList() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id=\"searchbox\"]"));
		ele1.sendKeys("A");
		
		List<WebElement> list_element = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
		int size1 = list_element.size();
		System.out.println(size1);
		
		for(WebElement ele2 : list_element) 
		{
		String text = ele2.getText();
		System.out.println(text);
		{
			if(text.equalsIgnoreCase("Australia"))
			{
				ele2.click();
				break;
			}
		}
	}
		TakesScreenshot s1 = (TakesScreenshot) driver;
		File sou = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Hero\\Desktop\\New folder\\jyoshna1.jpg");
		FileHandler.copy(sou, destination);
}
}
