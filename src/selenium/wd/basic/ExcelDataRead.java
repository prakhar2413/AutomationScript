package selenium.wd.basic;

import lib.ExcelDataConfig;

public class ExcelDataRead {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("D:\\selenium\\Testdata.xlsx"); 
		
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
		
		System.out.println(excel.getData(1, 0, 0));
		System.out.println(excel.getData(1, 0, 1));
	}

}
