package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.Startup;

public class Excelload  extends Startup {
	@SuppressWarnings("resource")
	XSSFWorkbook wb ;
	
	@SuppressWarnings("unused")
	XSSFSheet sheet ;
	
	public Excelload(String expath) throws IOException {
		 //path
		File scr = new File(expath);
		// load file
		FileInputStream fis = new FileInputStream(scr);
		//load workbook
		
		wb = new XSSFWorkbook(fis);
		//load sheet
		 sheet = wb.getSheetAt(0);
		
	}
	
	public int getRowcount(int sheetIndex) {
		int row =wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
		
		
	}
	public 	String getData(int Sheetnumber,int row,int col){
	sheet=	wb.getSheetAt(Sheetnumber);
	String data	= sheet.getRow(row).getCell(col).getStringCellValue();
	return data;
	}

}
