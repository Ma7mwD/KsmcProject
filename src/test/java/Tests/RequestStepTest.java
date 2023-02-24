package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LogOutPage;
import Pages.LoginPage;
import Pages.UsersApprove;
import Pages.InitiatorPage;
public class RequestStepTest extends BaseTestPage
{
	LoginPage loginPage;
	LogOutPage dashboardPage;
	InitiatorPage createRequest;
	UsersApprove requestApprove;
	
	@DataProvider(name = "users")
    public String[][] getUsers() 
	{
        return new String[][] {
        	{"Mahmoud6","P@ssw0rd"},
			{"DH","P@ssw0rd"},
			{"EM","P@ssw0rd"},
			{"BP","P@ssw0rd"},
			{"IC","P@ssw0rd"},
			{"ML","P@ssw0rd"},
			{"WF","P@ssw0rd"},
			{"HR","P@ssw0rd"},
			{"Head","P@ssw0rd"}
        };
    }
	@Test(dataProvider = "users")
    public void testLogin(String username, String password) throws InterruptedException 
	{
		loginPage = new LoginPage(driver);
		dashboardPage = new LogOutPage(driver);
		createRequest = new InitiatorPage(driver);
		requestApprove = new UsersApprove(driver);
		if(username == "Mahmoud6")
		{
			loginPage.Login(username, password);
			createRequest.CreateRequest("DH", "internal", "reason");
	        dashboardPage.logOut();
		}
		else
		{
			loginPage.Login(username, password);
			requestApprove.RequestApprove();
	        dashboardPage.logOut();
		}
        
    }
	
}
