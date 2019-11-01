package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	WebDriver driver;
	@FindBy(xpath = "//p[contains(text(),'Login or Create Account')]")
	public WebElement logintxt;
	
	@FindBy(xpath= "//input[@id='username']")
	public WebElement email;
	 
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
    @FindBy(xpath= "//button[@class='capText font16']")
    public WebElement loginbtn;
    
    public LoginPage(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    }
    
    public WebElement getLoginText()
    {
		return logintxt;   	
    }
    
    public WebElement getEmail()
    {
    	return email;
    }
    
    public WebElement getPassword()
    {
    	return password;
    }
    public WebElement getLoginButton()
    {
    	return loginbtn;
    }
    
}
