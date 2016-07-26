package pages;

import org.junit.rules.Verifier;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {
	
	public FindLeadsPage(){
		
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads Page", "FAIL");
		
	}
	
	public FindLeadsPage searchByPhone(){
		
		clickByXpath(prop.getProperty("FindLeads.Phone.Xpath"));
		return this;
		
	}
	
	public FindLeadsPage enterPhoneNumber(String data){
		
		enterByXpath(prop.getProperty("FindLeads.PhoneNumber.Xpath"), data);
		return this;
		
	}
	
    public FindLeadsPage searchByEmail(){
		
		clickByXpath(prop.getProperty("FindLeads.Email.Xpath"));
		return this;
		
	}
    
    public FindLeadsPage enterEmailAddress(String data){
		
		enterByName(prop.getProperty("FindLeads.EmailAddress.Name"), data);
		return this;
		
	}
    
    public FindLeadsPage searchByAdvanced(){
		
		clickByXpath(prop.getProperty("FindLeads.Advanced.Xpath"));
		return this;
		
	}
    
    public FindLeadsPage searchByNameAndId(){
		
		clickByXpath(prop.getProperty("FindLeads.NameAndId.Xpath"));
		return this;
		
	}
    
    public FindLeadsPage enterLeadId(String data){
		
		enterByXpath(prop.getProperty("FindLeads.LeadId.Xpath"), data);
		return this;
		
	}

    public FindLeadsPage enterFirstName(String data){
	
	enterByXpath(prop.getProperty("FindLeads.FirstName.Xpath"), data);
	return this;
	
   }

   public FindLeadsPage enterLastName(String data){
	
	enterByXpath(prop.getProperty("FindLeads.LastName.Xpath"), data);
	return this;
	
   }

   public FindLeadsPage enterCompanyName(String data){
	
	enterByXpath(prop.getProperty("FindLeads.CompanyName.Xpath"), data);
	return this;
	
   }
   
   public FindLeadsPage clickFindLeadsButton(){
		
		clickByXpath(prop.getProperty("FindLeads.FindLeadsButton.Xpath"));
		return this;
		
	}
   
    public ViewLeadPage clickFirstRowInLeadList(){
		
		clickByXpath(prop.getProperty("FindLeads.LeadList.Xpath"));
		return new ViewLeadPage();
		
	}
    
    public FindLeadsPage checkForNoReocrd() throws InterruptedException{
    	
    	Thread.sleep(5000);
    	if(verifyTextByXpath(prop.getProperty("FindLeads.NoRecord.Xpath"),prop.getProperty("FindLeads.NoRecord.Text")))
    	Reporter.reportStep("This record was not found in the Lead List", "PASS");
    	return this;
		
    }
    
    

}
