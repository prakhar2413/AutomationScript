package selenium.wd.basic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/* Explicit Wait
 
  The explicit wait is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or the maximum time 
  exceeded before throwing an "ElementNotVisibleException" exception.

The explicit wait is an intelligent kind of wait, but it can be applied only for specified elements. Explicit wait gives better
 options than that of an implicit wait as it will wait for dynamically loaded Ajax elements.

Once we declare explicit wait we have to use "ExpectedCondtions" or we can configure how frequently we want to check the condition 
using Fluent Wait. These days while implementing we are using Thread.Sleep() generally it is not recommended to use. 
The following are the Expected Conditions that can be used in Explicit Wait

alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()

*/

public class WaitExplicit {
	
	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver","D:\\selenium\\softaware\\chromedriver.exe" );
	driver = new ChromeDriver(); 
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	WebElement guru99seleniumlink;
	guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
			( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	
	guru99seleniumlink.click();
	}
	

}
