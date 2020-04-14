package com.qa.pageActions;

import com.qa.pages.USAPatriotActPage;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.asm.Advice.Enter;

public class USAPatriotActAction extends USAPatriotActPage{
	
	public USAPatriotActAction() {
		super();
	}
	
	public TemporaryInsuranceAgreementAction enterDataUSAPatriotAct(String willTheProposedInsuredBeOwner, String isMultipleOwner) throws InterruptedException {
		
		extentTest.log(LogStatus.INFO, " -  USA Patriot Act Page - ");
		switchToFrame(frameUSAPatriotAct);
		ClickElement(cbInheritance, "Check box Inheritance");
		ClickElement(cbAutoFill, "Check box AutoFill");
		
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No")) {
			ComboSelectValue(dropdownFormID, "Driver's License", "Form of ID");
			EnterText(txtIssuer, "Company", "Issuer");
			EnterText(txtNumberID, "7542689", "ID number");
			EnterText(txtState, "Alaska", "State");
			enterDOB("01/01/2030", txtMonth, txtDay, txtYear);
			
			if(isDisplayedElement(dropdownDocReviewed)) {
				ComboSelectValue(dropdownDocReviewed, "Articles of Incorporation", "DocReviewed");
			}
			
			
			if(isMultipleOwner.equalsIgnoreCase("Yes")) {
				ComboSelectValue(dropdownFormID_MO, "Driver's License", "Form of ID");
				EnterText(txtIssuer_MO, "Company", "Issuer");
				EnterText(txtName_MO, "NAme test", "Name");
				EnterText(txtStreet_MO, "Street", "Street");
				EnterText(txtCity_MO, "City", "City");
				ComboSelectValue(dropdownState_MO, "AL", "State");
				EnterText(txtZip_MO, "235764684", "Zip");
				EnterText(txtNumberID_MO, "7542689", "ID number");
				EnterText(txtCountry_MO, "Alaska", "State");
				enterDOB("02/03/2030", txtMonth_MO, txtDay_MO, txtYear_MO);		
			}
			
		}
		
		ClickElement(cbICertify, "Check box I Certify");
		takeScreenshot("USAPatriotActPage");
		ClickElement(btnNext, "Next button");	
		switchToDefault();
		Thread.sleep(5000);
		return new TemporaryInsuranceAgreementAction();
	}
}
