package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelRequestPage extends BasePage 
{

	public CancelRequestPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText=("My Inbox"))
	WebElement clickMyInbox;
	@FindBy(xpath=("//*[@id=\"b7-$b6\"]/table/tbody/tr[1]/td[1]/a"))
	WebElement clickRequestID;
	@FindBy(xpath=("//*[@id=\"b1-b6-ButtonActionCase\"]/div/button[1]"))
	WebElement clickActionButton;
	@FindBy(xpath=("//*[@id=\"b1-b22-ActionTypes\"]/div"))
	WebElement clickDropDown;
	@FindBy(xpath=("//*[@id=\"b1-b22-ActionTypes\"]/div[2]/div/div/span"))
	WebElement clickCancel;
	@FindBy(id=("b1-b22-TextArea_ActionCommentValue"))
	WebElement enterInTextArea;
	@FindBy(xpath=("//*[@id=\"b1-b22-b1-b1-Form1\"]/div[2]/button"))
	WebElement clickSaveButtton;
	@FindBy(xpath=("//*[@id=\"b1-b22-b2-ConfirmsButton\"]/button"))
	WebElement clickConfirmsButtton;
	
	public void cancelRequest(String txtArea) throws InterruptedException
	{
		ClickButton(clickMyInbox);
		ClickButton(clickRequestID);
		ClickButton(clickActionButton);
		ClickButton(clickDropDown);
		ClickButton(clickCancel);
		setTextElemnetValue(enterInTextArea, txtArea);
		ClickButton(clickSaveButtton);
		Thread.sleep(1000);
		ClickButton(clickConfirmsButtton);
		Thread.sleep(2000);
	}

}
