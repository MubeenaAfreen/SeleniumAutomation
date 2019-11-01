package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusPage 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='fromCity']")
	public WebElement fromCity;
	
	@FindBy(xpath="//div[contains(@class,'navOnly')]//li[5]")
	public WebElement busOption;
	
	@FindBy(xpath="//input[contains(@placeholder,'From')]")
	public WebElement fromPlaceHolder;
	
	@FindBy(xpath="//button[contains(text(),'Search')]")
	public WebElement searchButton;
	
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	public List<WebElement> fromCityList;
	
	public BusPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFromCity()
	{
		return fromCity;
	}
	public WebElement getBusOption()
	{
		return busOption;
	}
	public WebElement getfromPlaceHolder()
	{
		return fromPlaceHolder;
	}
    public WebElement getSearchButton()
    {
    	return searchButton;
    }
    public List<WebElement> getFromCityList()
    {
    	return fromCityList;
    }
    
    
    
}
