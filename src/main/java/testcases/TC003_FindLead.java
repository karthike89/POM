package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_FindLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String phoneNumber) throws InterruptedException{

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmSfaLink()
		.clickLeads()
		.clickFindLeadLinkMyLead()
		.searchByPhone()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.checkForNoReocrd();
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Find Leads(Positive)";
		testDescription="Find Leads in OpenTaps";
	}

	
	
	
	
	
	
}
