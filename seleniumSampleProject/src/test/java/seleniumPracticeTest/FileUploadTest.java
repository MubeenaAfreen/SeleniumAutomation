package seleniumPracticeTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class FileUploadTest
{
   
	@Test
	public static void fileupload() // main(String args[])
	{
		Logger log = Logger.getLogger(FileUploadTest.class.getName());
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.perform();
        ele.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
        log.debug("uploaded");
        //System.out.println("uploaded");
		
		
	}
	
}
