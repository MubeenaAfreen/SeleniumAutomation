package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage 
{

	WebDriver driver;
	@FindBy(xpath="//a[@class='latoBlack']")
	WebElement createNewAccount;
	
	@FindBy(xpath="//input[@placeholder='Enter email or phone no.']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']//span[text()='Create Account']")
	WebElement createAccountButton;
	
	public SignupPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
