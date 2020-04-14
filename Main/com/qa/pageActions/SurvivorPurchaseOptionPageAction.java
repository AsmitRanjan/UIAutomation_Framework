package com.qa.pageActions;
import com.qa.pageActions.OwnerInfoContPageAction;
import com.qa.pages.SurvivorPurchaseOptionPage;
import com.relevantcodes.extentreports.LogStatus;

public class SurvivorPurchaseOptionPageAction extends SurvivorPurchaseOptionPage {
	public SurvivorPurchaseOptionPageAction() {
		super();
	}
	
	//Actions
	public PersonalInformationAction enterSurvivorPurchaseOption(String isSurvivorPurchaseOptionRider) {
		if(isSurvivorPurchaseOptionRider.equalsIgnoreCase("Yes")) {
			try {
				extentTest.log(LogStatus.INFO, " - Survivor Purchase Option Page - ");
				switchToFrame(frameSurvivorPurchaseOption);
				enterDOB("04/04/1961", txtMonth, txtDay, txtYear);
				EnterText(txtSSN, "234365673", "SSN");
				ClickElement(rdoMale, "Male");
				ComboSelectValue(dropdownBirthState, "Alaska", "BirthState");
				ComboSelectValue(dropdownRelationshipPropIns, "Cousin", "RelationshipPropIns");
				ClickElement(cbSurvivorPurchase, "SurvivorPurchase");
				EnterText(txtYearsAddress, "10", "YearsAddress");
				EnterText(txtPhoneNumber, "3241576453", "PhoneNumber");
				ClickElement(rdoDriverLicense_Yes, "DriverLicense_Yes");
				EnterText(txtDriverLicenseNumber, "67345", "DriverLicenseNumber");
				ComboSelectValue(dropdownIssueState, "Alaska", "IssueState");
				enterDOB("04/04/2030", txtMonthDL, txtDayDL, txtYearDL);
				ClickElement(rdoUSCitizen_Yes, "USCitizen_Yes");
				ComboSelectValue(dropdownEmployementStatus, "Retired", "EmployementStatus");
				takeScreenshot("SurvivorPurchaseOptionPage");
				ClickElement(btnNext, "Next Button");
				switchToDefault();
				Thread.sleep(5000);
				return new PersonalInformationAction();
			} catch (Exception e) {
				e.printStackTrace();
				return new PersonalInformationAction();
			}
		}else {
			return new PersonalInformationAction();
		}
		
	}
}
