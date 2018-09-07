package selenium.wd.basic;


//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//SELENIUM POINT- count row, count column, and print all table values

public class DynamicTable2 {

public static void main(String[] args) throws InterruptedException {

//set GeckoDriver path for FireFox browser
System.setProperty("webdriver.gecko.driver", "D:\\selenium\\softaware\\geckodriver.exe");

//Create Browser object
WebDriver driver=new FirefoxDriver();

//open URL
driver.get("http://www.seleniumpoint.com/testwebsite.php");

//maximize the window
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

//login to test web site
driver.findElement(By.id("remail")).sendKeys("test@seleniumpoint.com ");
driver.findElement(By.id("rpassword")).sendKeys("test@123");
driver.findElement(By.id("rsubmit")).click();

Thread.sleep(3000);

//Get Row Count
int rowCount=driver.findElements(By.tagName("tr")).size();

//Get Column Count
//int colCount=driver.findElements(By.xpath("//thead//th")).size();

int colCount=driver.findElements(By.xpath("//thead[@id='datahead']//th")).size();

System.out.println("Row count :" + rowCount);
System.out.println("Col count :" + colCount);

//Print table Data

for(WebElement tdata:driver.findElements(By.tagName("tr")))
{
System.out.println(tdata.getText());
}

String wb = driver.findElement(By.xpath("//div[@class='col-lg-9']/table[@id='empdata']/tbody/tr[@id= 'row3']/td[2]")).getText();

 String wb1 = driver.findElement(By.xpath("//div[@class='col-lg-9']/table[@id='empdata']/tbody/tr[@id= 'row3']/td[1]")).getText();
 
 System.out.println(wb+" "+wb1);
 
 String wb2 = driver.findElement(By.xpath("//div[@class='col-lg-9']/table[@id='empdata']/tbody/tr[@id= 'row5']/td[2]")).getText();
 
 String wb3 = driver.findElement(By.xpath("//div[@class='col-lg-9']/table[@id='empdata']/tbody/tr[@id= 'row5']/td[1]")).getText();
 
 System.out.println(wb2+" "+wb3);
  

  
}

}

