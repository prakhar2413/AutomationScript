package selenium.wd.basic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* In selenium web driver there are methods through which we can handle multiple windows.

Driver.getWindowHandles();

To handle all opened windows by web driver, we can use "Driver.getWindowHandles()" and then we can switch window 
from one window to another in a web application. Its return type is Iterator<String>.

Driver.getWindowHandle();

When the site opens, we need to handle the main window by driver.getWindowHandle(). This will handle the current window
 that uniquely identifies it within this driver instance. Its return type is String. */



public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
	
		   System.setProperty("webdriver.gecko.driver","D:\\selenium\\softaware\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        
//	        System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");					
//            WebDriver driver = new ChromeDriver();	
            
            driver.manage().window().maximize();
    	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	        
	        driver.get("http://demo.guru99.com/popup.php");
	        
	        driver.findElement(By.partialLinkText("Click Here")).click();
	        
	        String MainWindow= driver.getWindowHandle();
	        
	        for (String Child_Window : driver.getWindowHandles())  
	        {  
	        driver.switchTo().window(Child_Window);  
	        
	     // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
           Iterator<String> i1=s1.iterator();		
         		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	         
                    
                    
                    driver.findElement(By.name("emailid")).sendKeys("kumar.prakhar2413@gmail.com");       
                    
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                       // driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
         

	}

	}

