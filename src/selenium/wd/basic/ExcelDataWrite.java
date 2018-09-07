package selenium.wd.basic;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataWrite {
	
	public static void main(String []args) throws Exception{
	
	 
		
		File src = new File ("D:\\selenium\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
	    sh1.getRow(0).createCell(2).setCellValue("Pass");
	    sh1.getRow(1).createCell(2).setCellValue("Fail");
	 
	    FileOutputStream fout= new FileOutputStream(src);
	     wb.write(fout);
	     
	     wb.close();
		 }
	
	}
	

