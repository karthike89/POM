package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {
	
	public  MyLeadsPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Leads Page", "FAIL");
	}	

	public CreateLeadPage clickCreateLeadLinkMyLead()
	{
		clickByLink(prop.getProperty("MyLeadPage.CreateLead.Link"));
		
	return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeadLinkMyLead()
	{
		clickByLink(prop.getProperty("MyLeadPage.FindLeads.Link"));
		
	return new FindLeadsPage();
	}
	
	public MergeLeadPage clickMergeLeadLinkMyLead()
	{
		clickByLink(prop.getProperty("MyLeadPage.MergeLead.Link"));
		
	return new MergeLeadPage();
	}
}


