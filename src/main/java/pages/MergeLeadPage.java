package pages;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{

	public MergeLeadPage() {
		//if(!verifyTitle("Merge Leads | opentaps CRM"))
			//Reporter.reportStep("This is not Merge Lead Home Page", "FAIL");
	}	

	public MergeFindLeadsPage clickFromLead() {
		clickByXpath(prop.getProperty("MergeLead.FromLead.Xpath"));
		childWindows();
		return new MergeFindLeadsPage();
	}

	public MergeFindLeadsPage clickToLead() throws InterruptedException {
		Thread.sleep(1000);
		childWindows();
		clickByXpath(prop.getProperty("MergeLead.ToLead.Xpath"));
		return new MergeFindLeadsPage();
	}
	
	public MergeLeadPage clickMergeButton (){
		childWindows();
		clickByClassName(prop.getProperty("MergeLead.MergeButton.Class"));
		return this;
	}
}
