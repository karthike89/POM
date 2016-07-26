package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeFindLeadsPage extends OpentapsWrappers{

	public MergeFindLeadsPage() {
		//if(!verifyTitle("Find Leads"))
			//Reporter.reportStep("This is not Find Leads Home Page", "FAIL");
	}	

	public MergeFindLeadsPage enterfirstName(String data) {
		childWindows();
		enterByName(prop.getProperty("MergeLead.FindLeads.FirstName.name"), data);
		return this;
	}
	
		public MergeFindLeadsPage clickFindLeads() {
		clickByClassName(prop.getProperty("MergeLead.FindLeads.FindLeads.class"));
		return this;
		}
		public MergeLeadPage clickLeadLink() throws InterruptedException {
			Thread.sleep(2000);
			clickByXpath(prop.getProperty("MergeLead.FindLeads.Link.Xpath"));
			//childWindows();
			return new MergeLeadPage();
		}
	

}
