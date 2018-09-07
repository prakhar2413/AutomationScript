package selenium.wd.basic;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebdriverFuctions2 {
	
 /*	There are some situation when regular xpath cannot be used to find element. In these situation we need different functions from xpath query.
	There some important xpath functions like contains, parent, ancestors, following-sibling etc.
	With the help of these functions we can create complex xpath expressions.*/
	
	@Test

    public void testAncestorInXpath(){

       WebDriver d;
		
		String chropath= "D:\\selenium\\softaware\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chropath);
		
		d= new ChromeDriver();
		
		d.manage().window().maximize();
	   
     	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
        d.get("http://demo.guru99.com/test/guru99home/");

        //Search All elements in 'Popular course' section 
		//with the help of ancestor of the anchor whose text is 'SELENIUM'

        List <WebElement> dateBox = d.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));

        //Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'

        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }
     
       // d.quit();
    }

}
