package selenium.wd.basic;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String []args) throws Exception{
	
	 
		
		File src = new File ("D:\\selenium\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		 int rowcount= sh1.getLastRowNum();
		 System.out.println("Total row is "+(rowcount+1));
		 
		 for (int i=0; i<rowcount; i++){
			 
	    String data0=sh1.getRow(i).getCell(0).getStringCellValue();
		//String data0=sh1.getRow(i).getCell(1).getStringCellValue();
		
		 System.out.println("Test data is "+data0);
	 
	 
		 }
	
	}
	}

