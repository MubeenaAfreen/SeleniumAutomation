package busBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BusPage;
import pages.FlightPage;
import utils.ConfigFileReader;

public class BookABusTest 
{
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	BusPage busPage;
	@BeforeTest
	public void setUpBrowser()
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = configFileReader.getApplicationUrl();
		driver.get(url);
		busPage = new BusPage(driver);
	}
	
	@Test
	public void searchABus()
	{
	    busPage.getBusOption().click();
	    busPage.getFromCity().click();
	    busPage.getfromPlaceHolder().sendKeys("Bangalore");
	    
	}

}
