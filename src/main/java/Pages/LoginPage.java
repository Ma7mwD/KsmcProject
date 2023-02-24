package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage 
{

	LogOutPage lo = new LogOutPage(driver);
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id=("b2-Input_Username"))
	WebElement UsernameVal;
	
	@FindBy(id=("b2-Input_Password"))
	WebElement PasswordVal;
	
	@FindBy(xpath=("//*[@id=\"b2-LoginForm\"]/div[4]/button"))
	WebElement clickLogin;
	
	public void Login(String username,String password) throws InterruptedException
	{
		setTextElemnetValue(UsernameVal, username);
		setTextElemnetValue(PasswordVal, password);
		Thread.sleep(1000);
		ClickButton(clickLogin);
	}
}
