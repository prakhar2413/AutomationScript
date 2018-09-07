package lib;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	
	

	public ExcelDataConfig(String excelpath)
	{
		
        try {
			File src = new File (excelpath);
			
			FileInputStream fis = new FileInputStream (src);
			
			 wb = new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


public String getData (int sheetNumber, int row, int column)
{
	  sh1 = wb.getSheetAt(sheetNumber);
	  
      String data= sh1.getRow(row).getCell(column).getStringCellValue();
      
      return data;
}
}

