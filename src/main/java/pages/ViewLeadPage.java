package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
		
	}	
	public EditLeadPage EditButton() {
		clickByXpath(prop.getProperty("ViewLead.Edit.Xpath"));
		return new EditLeadPage();
	}
	
	public MyLeadsPage DeleteButton() {
		clickByXpath(prop.getProperty("Home.UserName.Xpath"));
		return new MyLeadsPage();
	}
	
	public ViewLeadPage verifyFirstName(String data) {
		verifyTextByID(prop.getProperty("ViewLead.Firstname.Id"), data);
		return this;
	}
	
	
	
	public ViewLeadPage verifySource(String data) {
		verifyTextByID(prop.getProperty("ViewLead.Source.Id"), data);
		return this;
	}
	
	public ViewLeadPage verifyMarketingCampaign(String data) {
		verifyTextByID(prop.getProperty("ViewLead.Marketingcampaign.Id"), data);
		return this;
	}
	
	
	















}
