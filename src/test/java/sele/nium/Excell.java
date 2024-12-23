package sele.nium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


public class Excell {

	public static void main(String[] args) throws Exception {
		File excell = new File("C:\\Users\\saikrishnareddy123\\Desktop\\Sagar1123\\nium\\Resources\\LoginData.xlsx");
		//System.out.println(excell.exists());
		FileInputStream FIS = new FileInputStream(excell);
		XSSFWorkbook workbook = new XSSFWorkbook(FIS);
		XSSFSheet sheet	= workbook.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getLastCellNum();
		//System.out.println(sheet.getLastRowNum());
		for (int i = 1; i < rowcount; i++) {
//			for (int j = 0; j < columncount; j++) {
//				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
//				//System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());
//
//			}System.out.println();
		}
		
		
		
		workbook.close();
		FIS.close();

	}

}
