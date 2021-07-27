package com.webdriver;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTip {
	@Test(enabled=false)
	public void toolTip() throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id=\"age\"]"));
		String s1 = ele1.getAttribute("title");
		System.out.println(s1);
	}
	@Test
	public void verifyTooltip() throws IOException
	{
		WebDriver driver;

		FileInputStream f1 = new FileInputStream("C:\\Users\\Hero\\eclipse-workspace\\Selenium_Webdriver\\src\\test\\java\\com\\webdriver\\Config.properties");

		Properties p1 = new Properties();

		p1.load(f1);

		String browser_name = p1.getProperty("Browser");
		String driver_path = p1.getProperty("Path");

		if(browser_name.equalsIgnoreCase("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", driver_path);

			driver = new ChromeDriver();
		}

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/tooltip/");
		WebElement tooltip = driver.findElement(By.xpath("//a[@href=\"https://qunitjs.com/\"]"));
		String s2 = tooltip.getAttribute("title");
		System.out.println("Tooltip is" + s2);

		Assert.assertEquals(s2, "QUnit");

	}
	@Test(enabled=false)
	public void captureTooltip() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(driver.findElement(By.xpath("//input[@id=\"age\"]"))).perform();
		
		String text = driver.findElement(By.xpath("//div[@class=\"ui-tooltip-content\"]")).getText();
		System.out.println(text);
		
		Assert.assertTrue(text.contains("Enter your Name"));

	}
}
