package com.qa.pageActions;

import com.qa.pages.OwnerInformationPage;
import com.relevantcodes.extentreports.LogStatus;

public class OwnerInformationPageAction extends OwnerInformationPage{
	
	public OwnerInformationPageAction() {
		super();
	}
	
	
	//Actions:
	public OwnerInfoContPageAction enterOwnerInformationData(String willTheProposedInsuredBeOwner, String typeOwner, String relnProposedIns, String ownerFirstName, String ownerLastName, String ownerSSN, String strDOB,
			String ownerBirthState, String ownerGender, String ownerMaritalStatus, String ownerDL_State, String strDLExpDate, String isMultipleOwner) {	
		
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No")) {
			try {
				extentTest.log(LogStatus.INFO, " - Owner Information Page - ");
				switchToFrame(frameOwnerInformation);
				ComboSelectValue(dropdownTypeOwner, typeOwner, "Type of Owner");
				if(typeOwner.equalsIgnoreCase("Individual")) {
					
					ComboSelectValue(dropdownRelProposedInsured, relnProposedIns, "Relationship to Proposed Insured");
					ClickElement(cbOwnerAddress, "Same owner Address");
					EnterText(txtPhoneNumber, "3119485094", "Phone Number");
					EnterText(txtOwnerFirstName, ownerFirstName, "OwnerFirstName");
					EnterText(txtOwnerLastName, ownerLastName, "OwnerLastName");
					EnterText(txtOwnerSSN, ownerSSN, "Owner SSN");
					enterDOB_OwnerInformation(strDOB);
					ComboSelectValue(dropdownBirthState, ownerBirthState, "Owner Birth State");
					selectGender(ownerGender, rdoGender_Male, rdoGender_Female);
					maritalStatusReusable(ownerMaritalStatus, rdoMaritalStatus_Married, rdoMaritalStatus_NotMarried);
					ClickElement(rdoDriverLicense_Yes, "DriverLicense_Yes");
					EnterText(txtDriverLicenseNo, "8762345", "Driver License Number");
					ComboSelectValue(dropdownIssueState, ownerDL_State, "Owner DL issued State");
					DLexpirationDate(strDLExpDate);
					ClickElement(rdoContingentOwner_No, "ContingentOwner_No");
					selectYesNoRdoBtn(isMultipleOwner, "Multiple Indicator", rdoMultipleOwners_Yes, rdoMultipleOwners_No);
					ClickElement(rdoUSCitizen_Yes, "USCitizen_Yes");
					ComboSelectValue(dropdownEmploymentStatus, "Retired", "Employment Status");
					ClickElement(rdoW9Sbstitute_No, "W9Sbstitute_No");
				}	
				else if(typeOwner.equalsIgnoreCase("Business")) {
					ComboSelectValue(dropdownBusinessType, "LLC", "Business Type");
					ComboSelectValue(dropdownInsurableInterest, "Employee", "Insurable Interest");
					ClickElement(cbOwnerAddress, "Same owner Address");
					EnterText(txtPhoneNumber, "3119485094", "Phone Number");
					EnterText(txtEntityName, "Test", "Entity Name");
					EnterText(txtTaxIDNumber, "432534546", "Tax ID number");
					ClickElement(rdoContingentOwner_No, "ContingentOwner_No");
					selectYesNoRdoBtn(isMultipleOwner, "Multiple Indicator", rdoMultipleOwners_Yes, rdoMultipleOwners_No);
				}
				else if(typeOwner.equalsIgnoreCase("Established Trust")) {
					ClickElement(cbOwnerAddress, "Same owner Address");
					EnterText(txtPhoneNumber, "3119485094", "Phone Number");
					EnterText(txtTrust, "Test", "Trust");
					EnterText(txtTaxIDNumber, "432534546", "Tax ID number");
					DateOfTrust("01/01/1990");
					ClickElement(rdoContingentOwner_No, "ContingentOwner_No");
					selectYesNoRdoBtn(isMultipleOwner, "Multiple Indicator", rdoMultipleOwners_Yes, rdoMultipleOwners_No);
				}
				else if(typeOwner.equalsIgnoreCase("Qualified Plan")) {
					ClickElement(cbOwnerAddress, "Same owner Address");
					EnterText(txtPhoneNumber, "3119485094", "Phone Number");
					EnterText(txtEntityNameQualifiedPlan, "Test", "Entity Name");
					EnterText(txtTaxIDNumber, "432534546", "Tax ID number");
					ClickElement(rdoContingentOwner_No, "ContingentOwner_No");
					selectYesNoRdoBtn(isMultipleOwner, "Multiple Indicator", rdoMultipleOwners_Yes, rdoMultipleOwners_No);
				}
				else if(typeOwner.equalsIgnoreCase("UGMA/UTMA")) {
					ClickElement(cbOwnerAddress, "Same owner Address");
					EnterText(txtPhoneNumber, "3119485094", "Phone Number");
					EnterText(txtCustodianFirst, "Test First", "Custodian First");
					EnterText(txtCustodianLast, "Test Last", "Custodian Last");
					EnterText(txtOwnerSSN, ownerSSN, "Custodian SSN");
					ComboSelectValue(dropdownCustodianState, "AK", "Custodian State");
					ClickElement(rdoCustodianMale, "Custodian Male");
					ClickElement(rdoContingentOwner_No, "ContingentOwner_No");
					selectYesNoRdoBtn(isMultipleOwner, "Multiple Indicator", rdoMultipleOwners_Yes, rdoMultipleOwners_No);
				}
				else if(typeOwner.equalsIgnoreCase("412")) {
					ClickElement(cbOwnerAddress, "Same owner Address");
					EnterText(txtPhoneNumber, "3119485094", "Phone Number");
					EnterText(txtEntityNameQualifiedPlan, "Test", "Entity Name");
					EnterText(txtTaxIDNumber, "432534546", "Tax ID number");
					ClickElement(rdoContingentOwner_No, "ContingentOwner_No");
					selectYesNoRdoBtn(isMultipleOwner, "Multiple Indicator", rdoMultipleOwners_Yes, rdoMultipleOwners_No);	
				}
				
				if(isMultipleOwner.equalsIgnoreCase("Yes")) {
					ClickElement(rdoJoint, "Joint radio");
					
				}
				
				takeScreenshot("OwnerInformationdPage");
				ClickElement(btnNext, "Next Button");
				switchToDefault();
				Thread.sleep(5000);
				return new OwnerInfoContPageAction();
			} catch (Exception e) {
				e.printStackTrace();
				return new OwnerInfoContPageAction();
			}
		}else {
			return new OwnerInfoContPageAction();
		}
	}
	
	
	public void enterDOB_OwnerInformation(String dob)
	{
		enterDOB(dob, txtMonth, txtDay, txtYear);
	}
	
	public void DLexpirationDate(String date)
	{	
		String[] dateDemo = date.split("/");
		String strMonth = dateDemo[0];
		String strDay = dateDemo[1];
		String strYear = dateDemo[2];
		txtMonthDL.sendKeys(strMonth);	
		txtYearDL.sendKeys(strYear);
		txtDayDL.sendKeys(strDay);
		
		extentTest.log(LogStatus.INFO, date + " is entered in Driver License Expiration Date");	
	}
	
	public void DateOfTrust(String date)
	{	
		String[] dateDemo = date.split("/");
		String strMonth = dateDemo[0];
		String strDay = dateDemo[1];
		String strYear = dateDemo[2];
		txtMonthTrust.sendKeys(strMonth);	
		txtYearTrust.sendKeys(strYear);
		txtDayTrust.sendKeys(strDay);
		
		extentTest.log(LogStatus.INFO, date + " is entered in Date of Trust");	
	}
}
