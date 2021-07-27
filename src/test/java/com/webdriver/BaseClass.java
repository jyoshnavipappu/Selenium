package com.webdriver;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	
	public static String dataRead(String Sheetname,int rowno,int coloum) throws Throwable {
        String value=null;
       
        File file=new File("C:\\Users\\Hero\\Downloads\\DataDriven.xlsx");
        FileInputStream stream=new FileInputStream(file);
       
            Workbook book= new XSSFWorkbook(stream);
            Sheet sheet = book.getSheet(Sheetname);
            Row row = sheet.getRow(rowno);
            Cell cell = row.getCell(coloum);
            CellType cellType = cell.getCellType();
            if (cellType.equals(cellType.STRING)) {
                value = cell.getStringCellValue();
               
            }
        return value;
       
    }

}
