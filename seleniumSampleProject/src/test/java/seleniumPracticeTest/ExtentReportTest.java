package seleniumPracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest {
	static ExtentTest extentReportTest;
	static ExtentReports extentReports;

	@BeforeTest
	public void createReport() {
		extentReports = new ExtentReports(
				System.getProperty("D:\\MakeMyTripAutomation-master\\seleniumSampleProject") + "ExtentReport.html");
		extentReportTest = extentReports.startTest("ExtentReportTest");
	}

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if (driver.getTitle().equals("Google"))
		{
			extentReportTest.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			extentReportTest.log(LogStatus.FAIL, "Test Failed");
		}
	}
}
