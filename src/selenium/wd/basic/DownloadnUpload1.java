package selenium.wd.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*UPLOAD- Uploading files in WebDriver is done by simply using the sendKeys() 
method on the file-select input field to enter the path to the file to be */

public class DownloadnUpload1 {
	
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");					
	     WebDriver driver = new ChromeDriver();		
	     
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	     
	     String baseUrl= "http://demo.guru99.com/test/upload";
	     driver.get(baseUrl);
	     
	     WebElement upload = driver.findElement(By.id("uploadfile_0"));
	     
	  // enter the file path onto the file-selection input field
	     upload.sendKeys("D:\\Newhtlm.html.txt");
	     
	  // check the "I accept the terms of service" check box
	     driver.findElement(By.id("terms")).click();
         
	  // click the "UploadFile" button
	     driver.findElement(By.id("submitbutton")).click();
	     
	   // verify sucess msg  
	     String sucessmsg = driver.findElement(By.xpath("//div[@id='emailwindow']/form/ul/li/div[2]/h3/center")).getText();
	     
	     System.out.println(sucessmsg);
}
}