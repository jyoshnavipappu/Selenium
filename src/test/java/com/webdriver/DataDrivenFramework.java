package com.webdriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 
public class DataDrivenFramework 
{
	
	@Test
	public void dataDrivenApache() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();


		String file1=("C:\\Users\\Hero\\Desktop\\Excel.xls");
		File f1=new File(file1);
		FileOutputStream Fw=new FileOutputStream(f1);
		XSSFWorkbook w1=new XSSFWorkbook();
		XSSFSheet sheetone= w1.createSheet("selenium");
		Row r1=sheetone.createRow(1);
		Cell c1=r1.createCell(2);
		c1.setCellType(CellType.STRING);
		c1.setCellValue("Jyoshnavi");
		w1.write(Fw);

	}
} 

