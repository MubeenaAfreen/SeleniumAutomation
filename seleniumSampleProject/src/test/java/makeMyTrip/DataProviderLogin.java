package makeMyTrip;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.ConfigFileReader;
import utils.ExcelUtils;

public class DataProviderLogin 
{
	//public String sTestCaseName;	 
	//private int iTestCaseRow;	
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	@DataProvider(name="TestDataProvider")
	public Object[][] testData(Method m) throws Exception 
	{		
		System.out.println("Method name is "+m.getName());
		ExcelUtils.setExcelFile("TestData.xlsx","Sheet1");	 
		//  sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
		//int iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		int iTestCaseRow = ExcelUtils.getRowContains(getTestCaseNameBasedOnMethodName(m.getName()),0);
		Object[][] testObjArray = ExcelUtils.getTableArray("TestData.xlsx","Sheet1",iTestCaseRow);
		return (testObjArray);
	}

	private String getTestCaseNameBasedOnMethodName(String methodName)
	{
		if("Logintest".equals(methodName))
		{
			return "LoginData";
		}
		else if("SignupTest".equals(methodName))
		{
			return "SignupData";
		}
		return null;
	}

	@Test(dataProvider = "TestDataProvider")
	public void Logintest(String sUsername, String sPassword) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(sUsername);
		driver.findElement(By.xpath("//button//span")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sPassword);
		driver.findElement(By.xpath("//button//span[contains(text(), 'Login')]")).click();
	}
	
	
	@Test(dataProvider = "TestDataProvider")
	public void SignupTest(String sUsername, String sPassword) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(sUsername);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sPassword);
		driver.findElement(By.xpath(" ")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
