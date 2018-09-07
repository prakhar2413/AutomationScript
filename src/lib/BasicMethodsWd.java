package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsWd {

	public  void LaunchChrome () {
		 
		 String baseUrl = "http://demo.guru99.com/test/newtours/";					
	        System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");					
	    
	        WebDriver driver = new ChromeDriver();	
	}

}
