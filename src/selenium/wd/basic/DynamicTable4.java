package selenium.wd.basic;
import java.text.ParseException;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

//Fetch & print a particular cell of Top Gainers table of rediffmoney wiz site.//

public class DynamicTable4 {
	
	    public static void main(String[] args) throws ParseException {
	    	WebDriver wd;
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");
			 wd= new ChromeDriver();
			  wd.manage().window().maximize();
      	     wd.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
      	    
			 wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
			 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  WebElement baseTable = wd.findElement(By.tagName("table"));
			// WebElement baseTable = wd.findElement(By.xpath("//table[@class='dataTable']"));
			  
			 //To find third row of table
			 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
	         String rowtext = tableRow.getText();
			 System.out.println("Third row of table : "+rowtext);
			    
			    //to get 3rd row's 2nd column data
			    WebElement cellIneed = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			    
			  //  wd.close();
	    }
	}

