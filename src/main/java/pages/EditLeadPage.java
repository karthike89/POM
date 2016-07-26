package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	



	public EditLeadPage editDataSource(String datasource) {
		enterById(prop.getProperty("EditLeadPage.DataSourceName.Id"), datasource);
		return this;
	}
	

	public EditLeadPage addDataSource() {
		clickByXpath(prop.getProperty("EditLeadPage.AddDataAource.XPath"));
		return this;
	}
	
	public EditLeadPage editMarketingCampaign(String marketcampaign) {
		enterById(prop.getProperty("EditLeadPage.MarketingCampaign.Id"), marketcampaign);
		return this;
	}
	

	public EditLeadPage addMarketingCampaign() {
		clickByXpath(prop.getProperty("EditLeadPage.AddMarketingCampaign.XPath"));
		return this;
	}


	public ViewLeadPage clickUpdateButton() {
		clickByXpath(prop.getProperty("EditLeadPage.UpdateButton.XPath"));
		return new ViewLeadPage();
	}
	







}
