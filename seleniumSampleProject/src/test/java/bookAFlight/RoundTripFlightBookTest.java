package bookAFlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FlightPage;
import utils.ConfigFileReader;

public class RoundTripFlightBookTest 
{
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FlightPage flightPage;
	@BeforeTest
	public void setUpBrowser()
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = configFileReader.getApplicationUrl();
		driver.get(url);
		flightPage = new FlightPage(driver);
	}
	
	@Test
	public void search()
	{
		flightPage.getRoundTrip().click();
		flightPage.getFromCity().click();
		flightPage.getFromPlaceHolder().sendKeys("Mumbai");
		flightPage.getFromCityList().get(0).click();
		
		//flightPage.getToCity().click();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		//WebElement toCity = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='toCity']"))));
		//toCity.click();
		//WebElement toplaceHolder = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"))));			
		 
		//toplaceHolder.sendKeys("Bangalore");
		//flightPage.getToCityList().get(0).click();
		flightPage.getPlainText().click();
		//WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement search = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]"))));
        search.click();
		//flightPage.getSearchButton().click();		
	
		
	}

}
