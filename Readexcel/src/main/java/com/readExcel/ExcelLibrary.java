package com.readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelLibrary() throws Exception {
		String excelPath = "D:\\eclipse\\Readexcel\\TestData\\TestData.xlsx";

		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
	}
	public String readData(String sheetName,int row, int col) {
		sheet=wb.getSheet(sheetName);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
		
		
	}

}
