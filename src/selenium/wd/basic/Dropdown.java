package selenium.wd.basic;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

//How to Select Option from DropDown using Selenium Webdriver

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {

	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");					
     WebDriver driver = new ChromeDriver();			
     
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
     		
//    String baseUrl = "http://demo.guru99.com/test/link.html";					
//     driver.get(baseUrl);	
//     
//     Select country = new Select(driver.findElement(By.name("country")));
//     country.selectByVisibleText("INDIA");

   //Selecting Items in a Multiple SELECT elements
//   		driver.get("http://jsbin.com/osebed/2");
//   		Select fruits = new Select(driver.findElement(By.id("fruits")));
//   		fruits.selectByIndex(1);
//   		
//   		boolean multiple = fruits.isMultiple();
//   		System.out.println(multiple);
     
     
    									
         String baseUrl = "http://demo.guru99.com/test/block.html";					
         			
         driver.get(baseUrl);					
         driver.findElement(By.partialLinkText("Inside")).click();					
         System.out.println(driver.getTitle());					
         driver.navigate().back();			
         driver.findElement(By.partialLinkText("Outside")).click();					
         System.out.println(driver.getTitle());					
         driver.quit();				
         
    	 }
     }
	
	


