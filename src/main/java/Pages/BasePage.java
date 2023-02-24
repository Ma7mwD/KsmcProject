package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	protected WebDriver driver;
	//Constructor
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//driver = this.driver;
	}
	
	public static void ClickButton(WebElement button)
	{
		button.click();
	}
	
	public static void setTextElemnetValue(WebElement TextElement, String value)
	{
		TextElement.sendKeys(value);
	} 
	public static void ClearElement(WebElement element)
	{
		element.clear();
	}
}
