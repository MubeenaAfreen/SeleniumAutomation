package makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import pages.LoginPage;
import utils.ConfigFileReader;

public class LoginTest
{
	Logger log = Logger.getLogger(LoginTest.class.getName());
	 ConfigFileReader configFileReader = new ConfigFileReader();
	 LoginPage loginpage;
	 
	 @BeforeTest
	 public void setupBrowser()
	 {		
		 
			System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());				
			log.debug("");
			WebDriver driver = new ChromeDriver();
			loginpage = new LoginPage(driver);
			 driver.manage().window().maximize();
			String url = configFileReader.getApplicationUrl();
			driver.get(url);			
	 }
	 
	@Test
	public void login()
	{
		loginpage.getLoginText().click();
		loginpage.getEmail().sendKeys("mubeenaafreen6@gmail.com");
		loginpage.getPassword().sendKeys("*******");
		loginpage.getLoginButton().click();
		
		
	}
	

}
