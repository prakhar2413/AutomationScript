package selenium.wd.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*How to handle Alert in Selenium WebDriver
Alert interface provides the below few methods which are widely used in Selenium Webdriver.

1) void dismiss() // To click on the 'Cancel' button of the alert.

driver.switchTo().alert().dismiss();
2) void accept() // To click on the 'OK' button of the alert.

driver.switchTo().alert().accept();
3) String getText() // To capture the alert message.

driver.switchTo().alert().getText();			
4) void sendKeys(String stringToSend) // To send some data to alert box.

driver.switchTo().alert().sendKeys("Text");*/

//We can easily switch to alert from the main window by using Selenium's .switchTo() method.

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver","D:\\selenium\\softaware\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        
	        driver.get("http://demo.guru99.com/test/delete_customer.php");
	        
	        driver.findElement(By.name("cusid")).sendKeys("12345");
	        
	        driver.findElement(By.name("submit")).click();
	        
	        // Switching to Alert        
	        
	        Alert alert = driver.switchTo().alert();
	        
	      // Capturing alert message.
	        
	        String alertMsg = driver.switchTo().alert().getText();
	        
	      //Display alertmsg
	        
	        System.out.println(alertMsg);
	        
	      // Accepting alert		
	        alert.accept();	
	        
	     // Denied alert
		    // alert.dismiss();
	        
	        Thread.sleep(5000);
	      // Accept Ok button
	        
	        alert.accept();	
	        
	       
	        
	}

}
