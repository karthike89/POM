package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String firstName) throws InterruptedException{

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmSfaLink()
		.clickLeads()
		.clickFindLeadLinkMyLead()
		.searchByNameAndId()
		.enterFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstRowInLeadList();
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Find Leads(Positive)";
		testDescription="Find Leads in OpenTaps";
	}

	
	
	
	
	
	
}
