package selenium.wd.basic;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


//DOWNLOAD- Using robot class or third party tool like- wget and autoIt, we can download any file with webdriver

public class DownloadnUpload2 {
	
	 public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "D:\\selenium\\softaware\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().window().maximize();
 	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
        
	          String baseUrl = "http://demo.guru99.com/test/yahoo.html";
	       
	        driver.get(baseUrl);
	        
	        driver.findElement(By.id("messenger-download")).click();
	        
	        Robot robotObj= new Robot();
	        
	        robotObj.keyPress(KeyEvent.VK_TAB);
	      
	        
	        Thread.sleep(2000);
	        
	        robotObj.keyPress(KeyEvent.VK_ENTER);
	        
	       // WebElement downloadButton = driver.findElement(By
	        //.id("messenger-download"));
	       // String sourceLocation = downloadButton.getAttribute("href");
	        
	        
	        
	        
//	        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
//
//	        try {
//	        Process exec = Runtime.getRuntime().exec(wget_command);
//	        int exitVal = exec.waitFor();
//	        System.out.println("Exit value: " + exitVal);
//	        } catch (InterruptedException | IOException ex) {
//	        System.out.println(ex.toString());
//	        }
//	        driver.close();
//	        }
	        

}
}
