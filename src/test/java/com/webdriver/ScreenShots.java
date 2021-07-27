package com.webdriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShots {
	@Test
	public void dragAndDrop() throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
		
		Robot r1 = new Robot();
		Dimension d1 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d1);
		BufferedImage buffer = r1.createScreenCapture(rect);
		File destination = new File("C:\\Users\\Hero\\Desktop\\New folder\\jyoshna1.jpg");
		ImageIO.write(buffer, "jpg", destination);
	}

}
