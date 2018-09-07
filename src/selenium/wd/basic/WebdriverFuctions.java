package selenium.wd.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// find element using contains and sibling function

public class WebdriverFuctions {

	public static void main(String[] args){
		
		WebDriver d;
		
		String chropath= "D:\\selenium\\softaware\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chropath);
		
		d= new ChromeDriver();
		
		d.manage().window().maximize();
	   
     	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String baseUrl= "http://demo.guru99.com/test/guru99home/";
		
		d.get(baseUrl);
		
	/*Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,Here first we will 
    find a h2 whose text is ''A few of our most popular courses' ,then we move to its parent element which is a 'div' , inside 
   this div we will find a link whose text is 'SELENIUM' then at last we will find all of the sibling elements of this link('SELENIUM')*/
		
		
        List <WebElement> dateBox = d.findElements (By.xpath("//h2[contains(text(),'A few of our most popular courses')]"
        		+ "/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
        for (WebElement webElement : dateBox) {
        	
            System.out.println(webElement.getText());
        }     

      //  d.close();
        
    }
		
		
	}
	

