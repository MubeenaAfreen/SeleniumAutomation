package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPage
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='fromCity']")	
	public WebElement fromCity;
	
	@FindBy(xpath="//input[@placeholder='From']")
	public WebElement fromPlaceHolder;
	
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	public List<WebElement> fromCityList ;

	@FindBy(xpath="//li[contains(text(),'Round Trip')]")
	public WebElement roundTrip;
	
	
	@FindBy(xpath="//input[@id='toCity']")
	public WebElement toCity;
	
	@FindBy(xpath="//input[contains(@placeholder,'To')]")
			//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
			
	public WebElement toPlaceHolder;
	
	@FindBy(xpath="//div[contains(@class,'react-autosuggest__section-container react-autosuggest__section-container--first')]//ul[contains(@class,'react-autosuggest__suggestions-list')]")
			//li[@id='react-autowhatever-1-section-0-item-0']")
	public List<WebElement> toCityList;
	
	@FindBy(xpath="//div[@class='pushRight']")
	public WebElement plainText;
	
	@FindBy(xpath="")
	public WebElement departureDate;
	
	@FindBy(xpath="//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")
	public WebElement searchButton;
	
	@FindBy(xpath="")
	public WebElement returnDate;
	
	@FindBy(xpath="")
	public WebElement oneWay;
	
	public FlightPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFromCity()
	{
		return fromCity;
	}
	public WebElement getFromPlaceHolder()
	{
		return fromPlaceHolder;
	}
	public List<WebElement> getFromCityList()
	{
		return fromCityList;
	}
	
    public WebElement getToCity()
    {
    	return toCity;
    }
    public WebElement getToPlaceHolder()
	{
		return toPlaceHolder;
	}
	public List<WebElement> getToCityList()
	{
		return toCityList;
	}
	
	public WebElement getRoundTrip()
	{
		return roundTrip;
	}
    public WebElement getDepartureDate()
    {
    	return departureDate;
    }
    public WebElement getSearchButton()
    {
    	return searchButton;
    }
    public WebElement getReturnDate()
    {
    	return returnDate;
    }
    public WebElement getPlainText()
    {
    	return plainText;
    }
    
    
}
