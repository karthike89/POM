package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	
	public CreateLeadPage enterCompanyName(String Company) {
		enterById(prop.getProperty("CreateLeadPage.CompanyName.Id"), Company);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String Fname) {
		enterById(prop.getProperty("CreateLeadPage.FName.Id"), Fname);
		return this;
	}
	public CreateLeadPage enterLastName(String Lname) {
		enterById(prop.getProperty("CreateLeadPage.LName.Id"), Lname);
		return this;
	}

	

	public  ViewLeadPage clickCreateLeadbutton() {
		clickByClassName(prop.getProperty("CreateLeadPage.CreateLeadButton.Class"));
		return new ViewLeadPage();
	}















}
