package selenium.wd.basic;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;

//Print row & column count. compare all values Current Price column & print the maximum value of top gainers table.

public class DynamicTable5 {

	
		 public static void main(String[] args) throws ParseException {
		    	WebDriver wd;
				System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");
				 wd= new ChromeDriver();
				 wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
				 String max;
			     double m=0,r=0;
				 
			       //No. of Columns
			        List<WebElement>  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
			        System.out.println("Total No of columns are : " +col.size());
			        //No.of rows
			        List<WebElement>  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr"));
			        System.out.println("Total No of rows are : " + rows.size());
			        for (int i =1;i<rows.size();i++)
			        {    
			            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
			            NumberFormat f =NumberFormat.getNumberInstance(); 
			            Number num = f.parse(max);
			            max = num.toString();
			            m = Double.parseDouble(max);
			            if(m>r)
			             {    
			                r=m;
			             }
			        }
			        System.out.println("Maximum current price is : "+ r);
		    }

	}


