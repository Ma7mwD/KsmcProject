package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersApprove extends BasePage 
{
	public UsersApprove(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText=("My Inbox"))
	WebElement clickMyInbox;
	@FindBy(xpath=("//*[@id=\"b7-b3-Title\"]/div"))
	WebElement clickPendingRequest;
	
	public void RequestApprove() throws InterruptedException
	{
		ClickButton(clickMyInbox);
		ClickButton(clickPendingRequest);
		Thread.sleep(1000);
	}

}
