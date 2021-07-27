package com.webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {
	@Test
	public void downloadFile()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/download.html");
		driver.findElement(By.linkText("Download Excel")).click();
		File f1 = new File("C:\\Users\\Hero\\Downloads");
		File[] var_files = f1.listFiles();
		for(File type_file : var_files)
		{
			if(type_file.getName().equalsIgnoreCase("testleaf.xlsx"));
			System.out.println("File exist in Downloads");
			break;
		}
		
	}


}
