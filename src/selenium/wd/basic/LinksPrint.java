package selenium.wd.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksPrint {
	
	public static void main(String[] args) throws InterruptedException {
    		
    
  //set GeckoDriver path for FireFox browser
	//set GeckoDriver path for FireFox browser
	System.setProperty("webdriver.gecko.driver", "D:\\selenium\\softaware\\geckodriver.exe");

    //Create Browser object
    WebDriver driver=new FirefoxDriver();	
    

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	
    String baseUrl = "http://demo.guru99.com/test/newtours/";
	driver.get(baseUrl);		
	

	   List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
       String[] linkTexts = new String[linkElements.size()];							
			int					i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();	
			System.out.println(linkTexts[i]);
			i++;			
       }		

	}
}

