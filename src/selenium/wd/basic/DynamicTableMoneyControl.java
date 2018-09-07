package selenium.wd.basic;

		import java.text.ParseException;
import java.util.concurrent.TimeUnit;

//	import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

//Count row & column. And print all the value present inside each table of the  moneycontrol website/mutual fund.
		public class DynamicTableMoneyControl {

			 public static void main(String[] args) throws ParseException {
			    	WebDriver wd;
				  System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");
				  wd= new ChromeDriver();
				  
				  wd.manage().window().maximize();
	        	    wd.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	        	    
	  
			        wd.get("https://www.moneycontrol.com/mutualfundindia/");         
			        
			      //Get Row Count
			        int rowCount=wd.findElements(By.tagName("tr")).size();

			        //Get Column Count
			        //int colCount=driver.findElements(By.xpath("//thead//th")).size();

			        int colCount=wd.findElements(By.xpath("//thead//th")).size();

			        System.out.println("Row count :" + rowCount);
			        System.out.println("Col count :" + colCount);

			        //Print table Data

			        for(WebElement tdata:wd.findElements(By.tagName("tr")))
			        {
			        System.out.println(tdata.getText());
			        }	        
			     
       }

	}


