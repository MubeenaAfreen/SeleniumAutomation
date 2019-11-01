package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SauceLabsDemo
{
	 private WebDriver driver;
	 
	    @Test
	    public void shouldOpenChrome() throws MalformedURLException 
	    {
	      
	        String sauceUserName = System.getenv("SAUCE_USERNAME");
	        String sauceAccessKey = System.getenv("SAUCE_ACCESS_KEY");
	        String sauceURL = System.getenv("SAUCE_URL");
	 
	       
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("username", sauceUserName);
	        capabilities.setCapability("accessKey", sauceAccessKey);
	        capabilities.setCapability("browserName", "Chrome");
	        capabilities.setCapability("platform", "Windows 10");
	        capabilities.setCapability("version", "59.0");
	        capabilities.setCapability("name", "4-best-practices");
	 
	        List<String> tags = Arrays.asList("sauceDemo", "demoTest", "module4");
	        capabilities.setCapability("tags", tags);
	 
	        
	        capabilities.setCapability("maxDuration", 3600);
	        
	        capabilities.setCapability("commandTimeout", 600);
	       
	        capabilities.setCapability("idleTimeout", 1000);
	 
	       
	        capabilities.setCapability("build", "SauceDemo");
	 
	      
	        driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
	     
	        driver.navigate().to("https://www.saucedemo.com");
	        Assert.assertTrue(true);
	 
	    }
	   
	    @AfterMethod
	    public void cleanUpAfterTestMethod(ITestResult result) {
	        ((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
	        driver.quit();
	    }

}
