package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	private static FileOutputStream FileOutputStream;

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"\\TestData\\Test.xlsx";
		FileInputStream  fis=new FileInputStream(filePath);
		Workbook book=new XSSFWorkbook(fis);
		//writing into existing sheet
		@SuppressWarnings("rawtypes")
		org.apache.poi.ss.usermodel.Sheet sheet1= book.getSheet("Sheet1");
		((org.apache.poi.ss.usermodel.Sheet) sheet1).getRow(0).createCell(5).setCellValue("Country");
		
		((org.apache.poi.ss.usermodel.Sheet) sheet1).createRow(3).createCell(0).setCellValue("Hichem");
		
		 FileOutputStream fos= new FileOutputStream(filePath);
			
				book.write(fos);
		
		
		
		
	}

	
}
