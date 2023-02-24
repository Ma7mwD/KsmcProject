package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitiatorPage extends BasePage 
{
	public InitiatorPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText=("My Inbox"))
	WebElement clickMyInbox;
	@FindBy(xpath=("//*[@id=\"$b7\"]/div/div[1]/button/div"))
	WebElement clickCreateNewRequest;
	@FindBy(xpath=("//*[@id=\"b7-b8-ProcessDropDown\"]/div"))
	WebElement clickServiceType;
	@FindBy(xpath=("//*[@id=\"b7-b8-ProcessDropDown\"]/div[2]/div/div[4]"))
	WebElement choiceServiceType;
	@FindBy(xpath=("//*[@id=\"b7-b8-MainCatDropDown\"]/div"))
	WebElement clickMainCategory;
	@FindBy(xpath=("//*[@id=\"b7-b8-MainCatDropDown\"]/div[2]/div/div[8]"))
	WebElement choiceMainCategory;
	@FindBy(xpath=("//*[@id=\"b7-b8-SubCatDropDown\"]/div"))
	WebElement clickSupCategory;
	@FindBy(xpath=("//*[@id=\"b7-b8-SubCatDropDown\"]/div[2]/div/div[2]"))
	WebElement choiceSupCategory;
	@FindBy(xpath=("//*[@id=\"b7-b8-b1-b1-Form1\"]/div[2]/button/span"))
	WebElement clickNext1;
	@FindBy(id=("b7-b9-ApproveCheckBox"))
	WebElement checkCheckBox;
	@FindBy(id=("b7-b9-NextBtn"))
	WebElement clickNext2;
	@FindBy(id=("b7-b10-Input_PositionLevel"))
	WebElement clickPositionLevel;
	@FindBy(xpath=("//*[@id=\"b7-b10-Input_PositionLevel\"]/option[3]"))
	WebElement choicePositionLevel;
	@FindBy(xpath=("//*[@id=\"b7-b10-b4-Column2\"]/button"))
	WebElement clickSearchDM;
	@FindBy(id=("b7-b10-b9-EmployeeNameInput"))
	WebElement enterNameDM;
	@FindBy(xpath=("//*[@id=\"b7-b10-b9-b1-b1-Form1\"]/div[2]/button/span"))
	WebElement clickFind;
	@FindBy(xpath=("//*[@id=\"b7-b10-$b9\"]/div[3]/table/tbody/tr[3]/td[1]/a/span"))
	WebElement clickNameDM;
	@FindBy(xpath=("//*[@id=\"b7-b10-b9-SaveButton\"]/span"))
	WebElement clickSave;
	@FindBy(xpath=("//*[@id=\"b7-b10-b1-b1-Form1\"]/div[2]/button"))
	WebElement clickNext3;
	@FindBy(id=("b7-b11-Input_Transferto"))
	WebElement enterTransferTo;
	@FindBy(id=("b7-b11-TextArea_RequestReason"))
	WebElement enterRequestReason;
	@FindBy(xpath=("//*[@id=\"b7-b11-b1-b1-Form1\"]/div[2]/button/span"))
	WebElement clickNext4;
	@FindBy(xpath=("//*[@id=\"b7-$b13\"]/div/div[3]/button[2]"))
	WebElement clickNext5;
	@FindBy(xpath=("//*[@id=\"b7-b14-Container_Buttons\"]/button[2]"))
	WebElement clickSubmit;
	@FindBy(xpath=("//*[@id=\"b7-btn_yes\"]"))
	WebElement clickYes;
	
	public void CreateRequest(String txtNameDM,String txtTransferTo, String txtRequestReason) throws InterruptedException
	{
		
		ClickButton(clickMyInbox);
		ClickButton(clickCreateNewRequest);
		ClickButton(clickServiceType);
		ClickButton(choiceServiceType);
		ClickButton(clickMainCategory);
		ClickButton(choiceMainCategory);
		ClickButton(clickSupCategory);
		ClickButton(choiceSupCategory);
		ClickButton(clickNext1);
		//ClickButton(checkCheckBox);
		if (!checkCheckBox.isSelected()) 
	    {
			ClickButton(checkCheckBox);
	    }
		ClickButton(clickNext2);
		ClickButton(clickPositionLevel);
		ClickButton(choicePositionLevel);
		ClickButton(clickSearchDM);
		setTextElemnetValue(enterNameDM, txtNameDM);
		ClickButton(clickFind);
		ClickButton(clickNameDM);
		ClickButton(clickSave);
		ClickButton(clickNext3);
		setTextElemnetValue(enterTransferTo, txtTransferTo);
		setTextElemnetValue(enterRequestReason, txtRequestReason);
		ClickButton(clickNext4);
		ClickButton(clickNext5);
		ClickButton(clickSubmit);
		ClickButton(clickYes);
		Thread.sleep(1000);
	}
	
	
}
