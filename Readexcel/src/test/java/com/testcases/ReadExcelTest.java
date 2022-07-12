package com.testcases;

import org.testng.annotations.Test;

import com.readExcel.ExcelLibrary;

public class ReadExcelTest {
	//change
       //second change
	
	@Test
	public void readExcelTest() throws Exception {
		
		ExcelLibrary obj= new ExcelLibrary();
		String datstring=obj.readData("Test", 5, 1);
		System.out.println("The data is :"+datstring);
		
		
	}

}
