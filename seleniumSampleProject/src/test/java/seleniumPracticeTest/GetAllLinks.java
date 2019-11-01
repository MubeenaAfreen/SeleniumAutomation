package seleniumPracticeTest;

import java.util.List;

import org.apache.bcel.verifier.exc.AssertionViolatedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.google.common.base.Verify;


public class GetAllLinks {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUpBrowser()
	{
	   System.setProperty("webdriver.chrome.driver","");
	    driver = new ChromeDriver();
	}
	
	@Test
	public void getAllLinks()
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(int i=0; i< list.size() ; i++)
		{
			list.get(1);
		}
		Assert.assertEquals(1234, 1234);
		
	}

}
