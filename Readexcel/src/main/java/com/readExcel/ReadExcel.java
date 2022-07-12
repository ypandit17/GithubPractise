package com.readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
      
	@Test
	public void readExcel() throws Exception {
		String excelPath = "D:\\eclipse\\Readexcel\\TestData\\TestData.xlsx";
		String fileNameString = "TestData";
		String sheetName = "Test";
		// create the object of file class to get the excel path
		File file = new File(excelPath);
		// read the file
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		System.out.println("Toatl Rows:"+rowcount);
		
		String data=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		for(int i=0; i<=rowcount;i++) {
			Row row = sheet.getRow(i);
			for(int j=0; j<row.getLastCellNum(); j++) {
			String data1	=sheet.getRow(j).getCell(j).getStringCellValue();
            System.out.println(data1+" ");				
			}
			System.out.println();
		}
		
           wb.close();     
	}

}
