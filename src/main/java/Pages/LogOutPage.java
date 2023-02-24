package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage 

{

	public LogOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=("//*[@id=\"b4-b1-b1-SubMenuHeader\"]"))
	WebElement SubMenuHeader;
	
	@FindBy(xpath=("//*[@id=\"b4-b1-b1-Items\"]/div/div[2]/a/span"))
	WebElement Items;
	@FindBy(id=("b2-Input_Username"))
	WebElement UsernameVal;
	
	@FindBy(id=("b2-Input_Password"))
	WebElement PasswordVal;
	
	
	public void logOut() throws InterruptedException
	{
		ClickButton(SubMenuHeader);
		ClickButton(Items);
		Thread.sleep(1000);
	}

}
