package seleniumPracticeTest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingMultipleTabs
{

	@Test
	public static void handlingtabs()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());		   
		    // change focus to new tab
		    driver.switchTo().window(newTab.get(0));
		  
		    //Get the current window handle
		    String windowHandle = driver.getWindowHandle();
		    
		  //Switch back to original window
		    driver.switchTo().window(windowHandle);
		    driver.switchTo().defaultContent();
		   
		    Actions action = new Actions(driver);
		    action.doubleClick();
		    
		
	}
}
