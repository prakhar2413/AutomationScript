package selenium.wd.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//The parameters for By.linkText() and By.partialLinkText() are both case-sensitive, meaning that capitalization matters.

public class Links2 {
	
	public static void main(String[] args) {
		
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);	
        
        String theLinkText = driver.findElement(By					
                .partialLinkText("egis"))			
                .getText();		
        
        System.out.println(theLinkText);					
        theLinkText = driver.findElement(By					
                .partialLinkText("EGIS"))			
                .getText();		
        System.out.println(theLinkText);					

        driver.quit();			

    }

}
