package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	public void uploadFile() throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/excel_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		String file1 = "C:\\Users\\Hero\\Downloads\\testleaf.xlsx";
		StringSelection s1 = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}

}
