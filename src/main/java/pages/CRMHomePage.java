package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public CreateLeadPage clickCreateLead() {
		clickByLink(prop.getProperty("CRMHomePage.CreateLead.Link"));
		return new CreateLeadPage();
	}
	
	public MyLeadsPage clickLeads() {
		clickByLink(prop.getProperty("CRMHomePage.LeadsTAB.Link"));
		return new MyLeadsPage();
	}

	


	}
















