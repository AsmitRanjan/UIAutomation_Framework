package com.qa.pageActions;

import com.qa.pages.PremiumPayorInfoPage;
import com.relevantcodes.extentreports.LogStatus;


public class PremiumPayorInfoPageAction extends PremiumPayorInfoPage{
	
	public PremiumPayorInfoPageAction() {
		super();
	}
	
	public BeneficiaryInfoPageAction enterPremiumPayorInfo(String whoWillBePayor) {
		if(whoWillBePayor.equalsIgnoreCase("Other")) {
			try {
				extentTest.log(LogStatus.INFO, " - Premium Payor Information Page - ");
				switchToFrame(framePremiumPayorInfo);
				ComboSelectValue(dropdownRelationship, "Cousin", "Relationship");
				EnterText(txtFirstName, "FirstName", "FirstName");
				EnterText(txtLastName, "Last Name", "Last Name");
				EnterText(txtStreetAddress, "Street", "Street Address");
				EnterText(txtCity, "City", "City");
				ComboSelectValue(dropdownState, "Texas", "State");
				EnterText(txtZip, "234656547", "Zip");
				EnterText(txtCounty, "USA", "Country");
				EnterText(txtYearsThisAdd, "10", "Years at This Address");
				EnterText(txtSSN, "845768424", "SSN");
				enterDOB_Payor("01/01/1960");
				ComboSelectValue(dropdownBirthState, "Alaska", "Birth State");
				ClickElement(rdoGender_Male, "Gender_Male");
				ClickElement(rdoMarried, "Married");
				ComboSelectValue(dropdownEmpStatus, "Retired", "Employment Status");
				takeScreenshot("PremiumPayorInfoPage");
				ClickElement(btnNext, "Next");				
				switchToDefault();
				Thread.sleep(5000);
				return new BeneficiaryInfoPageAction();
			}
			catch(Exception e) {
				e.printStackTrace();
				return new BeneficiaryInfoPageAction();
			}
		}
		else {
			return new BeneficiaryInfoPageAction();
		}
	}
	public void enterDOB_Payor(String dob)
	{
		enterDOB(dob, txtMonth, txtDay, txtYear);
	}

}
