package Tests;

import org.testng.annotations.Test;

import Pages.CancelRequestPage;
import Pages.LogOutPage;
import Pages.LoginPage;

public class CancelRequestTest extends BaseTestPage 
{
	CancelRequestPage initiatorCancel ;
	LoginPage loginPage;
	LogOutPage dashboardPage;
	
	@Test
	public void testCancel() throws InterruptedException
	{
		initiatorCancel = new CancelRequestPage(driver);
		loginPage = new LoginPage(driver);
		dashboardPage = new LogOutPage(driver);
		
		loginPage.Login("Mahmoud6", "P@ssw0rd");
		initiatorCancel.cancelRequest("initiator");
		dashboardPage.logOut();
	}
}
