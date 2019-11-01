package seleniumPracticeTest;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitExample {
	
	WebDriver driver;
	@Test
	public void waitEx()
	{
		System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS);
	
	}

}
