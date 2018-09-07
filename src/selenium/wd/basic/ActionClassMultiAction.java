package selenium.wd.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Building a Series of Multiple Actions using Action classes

public class ActionClassMultiAction {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe");					
	     WebDriver driver = new ChromeDriver();		
	     
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	     
	     String baseUrl= "https://www.facebook.com/";
	     driver.get(baseUrl);
	     
	     WebElement username= driver.findElement(By.id("email"));
	     
	     Actions builder = new Actions(driver);
	     
	     Action seriesOfActions = builder.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username,"hello")
	    		 .keyUp(username, Keys.SHIFT).doubleClick(username).contextClick().build();
	     
	     seriesOfActions.perform();

}
}