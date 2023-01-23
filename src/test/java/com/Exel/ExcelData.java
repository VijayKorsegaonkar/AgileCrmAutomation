package com.Exel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelData {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\JDK\\My Data.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Workbook wb1 = getWorkbbokInstance(file);
		Sheet sheet=wb.getSheet("Sheet1");
		//Sheet sheet=wb1.getSheet("sheet1");
		int noofrows=sheet.getPhysicalNumberOfRows();
		System.out.println(noofrows);
		int noOfCells=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(noOfCells);
		Object [][] obj=new Object[noofrows][noOfCells];
		for(int i=0; i<noofrows; i++) {
			for(int j=0; j<noOfCells; j++) {
				DateFormatter df=new DateFormatter();
				//System.out.println(df);
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				for(Object[] obj1:obj) {
					System.out.println(Arrays.toString(obj1));
				}
				
			}
		
		

	}}

	/*
	 * private static Workbook getWorkbbokInstance(File file) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
