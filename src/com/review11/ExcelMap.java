package com.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {

	public static void main(String[] args) throws IOException {
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String filePath=projectPath+"\\TestData\\Test.xlsx";
		System.out.println(filePath);
		FileInputStream fileIS=new FileInputStream(filePath);
		//get the whole file
		Workbook book= new XSSFWorkbook(filePath);
		//get the sheet from the file
		Sheet sheet=book.getSheet("Sheet3");
		//get the number of rows, the last ione that has data
		int rows=sheet.getPhysicalNumberOfRows();
		//get one row from the current sheet
		Row row0=sheet.getRow(0);
		//get one cell from the current row
		int cells=row0.getLastCellNum();
		
//		Map<String,String>maryMap=new LinkedHashMap<>();
//		for(int i=0;i<cells;i++) {
//			String headerCell=sheet.getRow(0).getCell(i).toString();
//			String maryCell=sheet.getRow(2).getCell(i).toString();
//			maryMap.put(headerCell, maryCell);
//			
//		}
//		System.out.println(maryMap);
//
//	//three Maps
//	List<Map<String,String>>mapList=new ArrayList<Map<String,String>>() ;
//	
//	for(int i=1;i<rows;i++) {
//		Map<String,String>map=new LinkedHashMap<>();
//		for(int j=0;j<cells;j++) {
//		map.put(SheetUtil.getRow(0).getCell(j).toString(),SheetUtil.getRow(i).getCell(j).toString());
//	}
//	mapList.add(map);
//	
//}
//System.out.println(mapList);
//}
}
}
