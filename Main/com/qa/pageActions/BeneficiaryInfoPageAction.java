package com.qa.pageActions;

import org.openqa.selenium.WebElement;

import com.qa.pages.BeneficiaryInformationPage;
import com.qa.util.Wait;
import com.relevantcodes.extentreports.LogStatus;

public class BeneficiaryInfoPageAction extends BeneficiaryInformationPage{
	
	public BeneficiaryInfoPageAction() {
		super();
	}
	
	Wait wait = new Wait();
	
	//Actions:
	public TermConversionPageAction detailsOfPrimaryBenef(String numOfPB, String strShareIndicator, String strDeceasedSharePaid, String strRelationshipBene1,
			String strFirstNameBene1, String strLastNameBene1, String strGenderBene1, String strSSNBene1, String strSharePerBene1, String strEntityNameBene1, 
			String strCorporateOfficer_Bene1, String strTitle_Bene1, String strStateIncorporation_Bene1, String strOtherRelation_Bene1,
			String strRelationshipBene2, String strFirstNameBene2, String strLastNameBene2, String strGenderBene2, String strSSNBene2, 
			String strSharePerBene2, String strEntityNameBene2, String strOtherRelation_Bene2, String strRelationshipBene3, String strFirstNameBene3,
			String strLastNameBene3, String strGenderBene3, String strSSNBene3, String strSharePerBene3,
			String strEntityNameBene3, String strOtherRelation_Bene3, String strRelationshipBene4, String strFirstNameBene4, 
			String strLastNameBene4, String strGenderBene4, String strSSNBene4, String strSharePerBene4, String strEntityNameBene4, 
			String strOtherRelation_Bene4, String strRelationshipBene5, String strFirstNameBene5, String strLastNameBene5, 
			String strGenderBene5, String strSSNBene5, String strSharePerBene5, String strEntityNameBene5, String strOtherRelation_Bene5) throws InterruptedException {		
		
		extentTest.log(LogStatus.INFO, " - Beneficiary Information Page - ");
		switchToFrame(frameBeneficiaryInfo);
		ClickElement(btnAddThePrimaryBeneficiary, "AddThePrimaryBeneficiary Button");
		switchToDefault();
		switchToFrame(framePrimaryBeneficiary);
		Thread.sleep(3000);
		assignSharePercentage(strShareIndicator, strDeceasedSharePaid);
		primaryBeneficiaryDetails(numOfPB, strShareIndicator, strRelationshipBene1, strFirstNameBene1, strLastNameBene1, strGenderBene1, 
				strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1, strTitle_Bene1, strStateIncorporation_Bene1, 
				strOtherRelation_Bene1, strRelationshipBene2, strFirstNameBene2, strLastNameBene2, strGenderBene2, strSSNBene2, strSharePerBene2, 
				strEntityNameBene2, strOtherRelation_Bene2, strRelationshipBene3, strFirstNameBene3, strLastNameBene3, strGenderBene3, strSSNBene3, 
				strSharePerBene3, strEntityNameBene3, strOtherRelation_Bene3, strRelationshipBene4, strFirstNameBene4, strLastNameBene4, strGenderBene4, 
				strSSNBene4, strSharePerBene4, strEntityNameBene4, strOtherRelation_Bene4, strRelationshipBene5, strFirstNameBene5, strLastNameBene5, 
				strGenderBene5, strSSNBene5, strSharePerBene5, strEntityNameBene5, strOtherRelation_Bene5);
		ClickElement(labelSharePercentage, "Label Share Percentage");
		switchToDefault();
		scrollIntoView(btnSave, driver);
		ClickJSElement(btnSave, "SaveButton");
		Thread.sleep(5000);
		switchToFrame(frameBeneficiaryInfo);
		ClickElement(rdoContingentBeneficiary_No, "Contingent Beneficiary No RadioBtn");
		takeScreenshot("BeneficiaryInformationPage");
		ClickElement(btnNext, "Next button");
		Thread.sleep(5000);
		switchToDefault();
		return new TermConversionPageAction();
	}
	
	public void assignSharePercentage(String strShareIndicator, String strDeceasedSharePaid) {
		
		if(strShareIndicator.equalsIgnoreCase("Yes"))
		{
			ClickElement(radioShareYes, "Share%_Yes");
			ComboSelectValue(dropDownDeceasedSharePaid, strDeceasedSharePaid, "DeceasedSharePaid");
		}else {
			ClickElement(radioShareNo, "Share%_No");
		}	
	}
	
	public void primaryBeneficiaryDetails(String numOfPB, String indSharePercentage, String strRelationshipBene1, String strFirstNameBene1,
			String strLastNameBene1, String strGenderBene1, String strSSNBene1, String strSharePerBene1, String strEntityNameBene1, String strCorporateOfficer_Bene1,
			String strTitle_Bene1, String strStateIncorporation_Bene1, String strOtherRelation_Bene1,
			String strRelationshipBene2, String strFirstNameBene2, String strLastNameBene2, String strGenderBene2, String strSSNBene2, 
			String strSharePerBene2, String strEntityNameBene2, String strOtherRelation_Bene2, String strRelationshipBene3, String strFirstNameBene3,
			String strLastNameBene3, String strGenderBene3, String strSSNBene3, String strSharePerBene3,
			String strEntityNameBene3, String strOtherRelation_Bene3, String strRelationshipBene4, String strFirstNameBene4, 
			String strLastNameBene4, String strGenderBene4, String strSSNBene4, String strSharePerBene4, String strEntityNameBene4, 
			String strOtherRelation_Bene4, String strRelationshipBene5, String strFirstNameBene5, String strLastNameBene5, 
			String strGenderBene5, String strSSNBene5, String strSharePerBene5, String strEntityNameBene5, String strOtherRelation_Bene5) {
		
		switch (numOfPB)
		{
			case "1":
			{
				bene1Details(indSharePercentage, strRelationshipBene1, strFirstNameBene1, strLastNameBene1,
						strGenderBene1, strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1,
						strTitle_Bene1, strStateIncorporation_Bene1, strOtherRelation_Bene1);
				break;
			}
			case "2":
			{
				bene1Details(indSharePercentage, strRelationshipBene1, strFirstNameBene1, strLastNameBene1,
						strGenderBene1, strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1,
						strTitle_Bene1, strStateIncorporation_Bene1, strOtherRelation_Bene1);
				
				bene2Details(indSharePercentage, strRelationshipBene2, strFirstNameBene2, strLastNameBene2,
						strGenderBene2, strSSNBene2, strSharePerBene2, strEntityNameBene2, strOtherRelation_Bene2);
				break;
			}
			
			case "3":
			{
				bene1Details(indSharePercentage, strRelationshipBene1, strFirstNameBene1, strLastNameBene1,
						strGenderBene1, strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1,
						strTitle_Bene1, strStateIncorporation_Bene1, strOtherRelation_Bene1);
				
				bene2Details(indSharePercentage, strRelationshipBene2, strFirstNameBene2, strLastNameBene2,
						strGenderBene2, strSSNBene2, strSharePerBene2, strEntityNameBene2, strOtherRelation_Bene2);
				
				bene3Details(indSharePercentage, strRelationshipBene3, strFirstNameBene3, strLastNameBene3,
						strGenderBene3, strSSNBene3, strSharePerBene3, strEntityNameBene3, strOtherRelation_Bene3);
				break;
			}
			
			case "4":
			{
				bene1Details(indSharePercentage, strRelationshipBene1, strFirstNameBene1, strLastNameBene1,
						strGenderBene1, strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1,
						strTitle_Bene1, strStateIncorporation_Bene1, strOtherRelation_Bene1);
				
				bene2Details(indSharePercentage, strRelationshipBene2, strFirstNameBene2, strLastNameBene2,
						strGenderBene2, strSSNBene2, strSharePerBene2, strEntityNameBene2, strOtherRelation_Bene2);
				
				bene3Details(indSharePercentage, strRelationshipBene3, strFirstNameBene3, strLastNameBene3,
						strGenderBene3, strSSNBene3, strSharePerBene3, strEntityNameBene3, strOtherRelation_Bene3);
				
				bene4Details(indSharePercentage, strRelationshipBene4, strFirstNameBene4, strLastNameBene4,
						strGenderBene4, strSSNBene4, strSharePerBene4, strEntityNameBene4, strOtherRelation_Bene4);
				break;
			}
			
			case "5":
			{
				bene1Details(indSharePercentage, strRelationshipBene1, strFirstNameBene1, strLastNameBene1,
						strGenderBene1, strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1,
						strTitle_Bene1, strStateIncorporation_Bene1, strOtherRelation_Bene1);
				
				bene2Details(indSharePercentage, strRelationshipBene2, strFirstNameBene2, strLastNameBene2,
						strGenderBene2, strSSNBene2, strSharePerBene2, strEntityNameBene2, strOtherRelation_Bene2);
				
				bene3Details(indSharePercentage, strRelationshipBene3, strFirstNameBene3, strLastNameBene3,
						strGenderBene3, strSSNBene3, strSharePerBene3, strEntityNameBene3, strOtherRelation_Bene3);
				
				bene4Details(indSharePercentage, strRelationshipBene4, strFirstNameBene4, strLastNameBene4,
						strGenderBene4, strSSNBene4, strSharePerBene4, strEntityNameBene4, strOtherRelation_Bene4);
				
				bene5Details(indSharePercentage, strRelationshipBene5, strFirstNameBene5, strLastNameBene5,
						strGenderBene5, strSSNBene5, strSharePerBene5, strEntityNameBene5, strOtherRelation_Bene5);

				break;
	
			}
			
			}
		
	}

	private void bene5Details(String indSharePercentage, String strRelationshipBene5, String strFirstNameBene5,
			String strLastNameBene5, String strGenderBene5, String strSSNBene5, String strSharePerBene5,
			String strEntityNameBene5, String strOtherRelation_Bene5) {
		ComboSelectValue(dropDownRelnship_Bene5, strRelationshipBene5, "RelationshipToInsured_Bene5");
		if(strRelationshipBene5.equalsIgnoreCase("Charitable Organization") || strRelationshipBene5.equalsIgnoreCase("Employer") || strRelationshipBene5.equalsIgnoreCase("Trust")) {
			EnterText(txtEntityName_Bene5, strEntityNameBene5, "EntityName");
			EnterText(txtSSN_Bene5, strSSNBene5, "SSN");
		}
		else if(strRelationshipBene5.equalsIgnoreCase("Estate of Insured")){
			
		}
		else if(strRelationshipBene5.equalsIgnoreCase("Lawful Children of Insured")) {
			
		}
		else if(strRelationshipBene5.equalsIgnoreCase("Other")) {
			EnterText(txtOtherRelationship_Bene5, strOtherRelation_Bene5, "Other Relationship");
			firstnameDetails(txtFN_Bene5,strFirstNameBene5, txtLN_Bene5, strLastNameBene5, strGenderBene5, radioMale_Bene5, radioFemale_Bene5);
//			EnterText(txtSSN_Bene5, strSSNBene5, "SSN");
		}
		else {
			firstnameDetails(txtFN_Bene5,strFirstNameBene5, txtLN_Bene5, strLastNameBene5, strGenderBene5, radioMale_Bene5, radioFemale_Bene5);
//			EnterText(txtSSN_Bene5, strSSNBene5, "SSN");
		}
		if(indSharePercentage.equalsIgnoreCase("Yes")){
			EnterText(txtSharePer_Bene5, strSharePerBene5, "Share%");
		}
//		ClickElement(headingPrimaryBene, "Primary Beneficary");
	}

	private void bene4Details(String indSharePercentage, String strRelationshipBene4, String strFirstNameBene4,
			String strLastNameBene4, String strGenderBene4, String strSSNBene4, String strSharePerBene4,
			String strEntityNameBene4, String strOtherRelation_Bene4) {
		ComboSelectValue(dropDownRelnship_Bene4, strRelationshipBene4, "RelationshipToInsured_Bene4");
		if(strRelationshipBene4.equalsIgnoreCase("Charitable Organization") || strRelationshipBene4.equalsIgnoreCase("Employer") || strRelationshipBene4.equalsIgnoreCase("Trust")) {
			EnterText(txtEntityName_Bene4, strEntityNameBene4, "EntityName");
//			EnterText(txtSSN_Bene4, strSSNBene4, "SSN");
		}
		else if(strRelationshipBene4.equalsIgnoreCase("Estate of Insured")){
			
		}
		else if(strRelationshipBene4.equalsIgnoreCase("Lawful Children of Insured")) {
			
		}
		else if(strRelationshipBene4.equalsIgnoreCase("Other")) {
			EnterText(txtOtherRelationship_Bene4, strOtherRelation_Bene4, "Other Relationship");
			firstnameDetails(txtFN_Bene4,strFirstNameBene4, txtLN_Bene4, strLastNameBene4, strGenderBene4, radioMale_Bene4, radioFemale_Bene4);
//			EnterText(txtSSN_Bene4, strSSNBene4, "SSN");
		}
		else {
			firstnameDetails(txtFN_Bene4,strFirstNameBene4, txtLN_Bene4, strLastNameBene4, strGenderBene4, radioMale_Bene4, radioFemale_Bene4);
			EnterText(txtSSN_Bene4, strSSNBene4, "SSN");
		}
		if(indSharePercentage.equalsIgnoreCase("Yes")){
			EnterText(txtSharePer_Bene4, strSharePerBene4, "Share%");
		}
//		ClickElement(headingPrimaryBene, "Primary Beneficary");
	}

	private void bene3Details(String indSharePercentage, String strRelationshipBene3, String strFirstNameBene3,
			String strLastNameBene3, String strGenderBene3, String strSSNBene3, String strSharePerBene3,
			String strEntityNameBene3, String strOtherRelation_Bene3) {
		ComboSelectValue(dropDownRelnship_Bene3, strRelationshipBene3, "RelationshipToInsured_Bene3");
		if(strRelationshipBene3.equalsIgnoreCase("Charitable Organization") || strRelationshipBene3.equalsIgnoreCase("Employer") || strRelationshipBene3.equalsIgnoreCase("Trust")) {
			EnterText(txtEntityName_Bene3, strEntityNameBene3, "EntityName");
//			EnterText(txtSSN_Bene3, strSSNBene3, "SSN");
		}
		else if(strRelationshipBene3.equalsIgnoreCase("Estate of Insured")){
			
		}
		else if(strRelationshipBene3.equalsIgnoreCase("Lawful Children of Insured")) {
			
		}
		else if(strRelationshipBene3.equalsIgnoreCase("Other")) {
			EnterText(txtOtherRelationship_Bene3, strOtherRelation_Bene3, "Other Relationship");
			firstnameDetails(txtFN_Bene3,strFirstNameBene3, txtLN_Bene3, strLastNameBene3, strGenderBene3, radioMale_Bene3, radioFemale_Bene3);
//			EnterText(txtSSN_Bene3, strSSNBene3, "SSN");
		}
		else {
			firstnameDetails(txtFN_Bene3,strFirstNameBene3, txtLN_Bene3, strLastNameBene3, strGenderBene3, radioMale_Bene3, radioFemale_Bene3);
			EnterText(txtSSN_Bene3, strSSNBene3, "SSN");
		}
		if(indSharePercentage.equalsIgnoreCase("Yes")){
			EnterText(txtSharePer_Bene3, strSharePerBene3, "Share%");
		}
//		ClickElement(headingPrimaryBene, "Primary Beneficary");
	}

	private void bene2Details(String indSharePercentage, String strRelationshipBene2, String strFirstNameBene2,
			String strLastNameBene2, String strGenderBene2, String strSSNBene2, String strSharePerBene2,
			String strEntityNameBene2, String strOtherRelation_Bene2) {
		ComboSelectValue(dropDownRelnship_Bene2, strRelationshipBene2, "RelationshipToInsured_Bene2");
		if(strRelationshipBene2.equalsIgnoreCase("Charitable Organization") || strRelationshipBene2.equalsIgnoreCase("Employer") || strRelationshipBene2.equalsIgnoreCase("Trust")) {
			EnterText(txtEntityName_Bene2, strEntityNameBene2, "EntityName");
//			EnterText(txtSSN_Bene2, strSSNBene2, "SSN");
		}
		else if(strRelationshipBene2.equalsIgnoreCase("Estate of Insured")){
			
		}
		else if(strRelationshipBene2.equalsIgnoreCase("Lawful Children of Insured")) {
			
		}
		else if(strRelationshipBene2.equalsIgnoreCase("Other")) {
			EnterText(txtOtherRelationship_Bene2, strOtherRelation_Bene2, "Other Relationship");
			firstnameDetails(txtFN_Bene2,strFirstNameBene2, txtLN_Bene2, strLastNameBene2, strGenderBene2, radioMale_Bene2, radioFemale_Bene2);
//			EnterText(txtSSN_Bene2, strSSNBene2, "SSN");
		}
		else {
			firstnameDetails(txtFN_Bene2,strFirstNameBene2, txtLN_Bene2, strLastNameBene2, strGenderBene2, radioMale_Bene2, radioFemale_Bene2);
			EnterText(txtSSN_Bene2, strSSNBene2, "SSN");
		}
		if(indSharePercentage.equalsIgnoreCase("Yes")){
			EnterText(txtSharePer_Bene2, strSharePerBene2, "Share%");
		}
//		ClickElement(headingPrimaryBene, "Primary Beneficary");
	}

	private void bene1Details(String indSharePercentage, String strRelationshipBene1, String strFirstNameBene1,
			String strLastNameBene1, String strGenderBene1, String strSSNBene1, String strSharePerBene1,
			String strEntityNameBene1, String strCorporateOfficer_Bene1, String strTitle_Bene1,
			String strStateIncorporation_Bene1, String strOtherRelation_Bene1) {
		ComboSelectValue(dropDownRelnship_Bene1, strRelationshipBene1, "RelationshipToInsured_Bene1");
		if(strRelationshipBene1.equalsIgnoreCase("Charitable Organization") || strRelationshipBene1.equalsIgnoreCase("Employer") || strRelationshipBene1.equalsIgnoreCase("Trust")) {					
			charitableOrganization(txtEntityName_Bene1, strEntityNameBene1, txtCorporateOfficer_Bene1, strCorporateOfficer_Bene1, 
					txtTitle_Bene1, strTitle_Bene1, dropDownStateIncorporation_Bene1, strStateIncorporation_Bene1);
//			EnterText(txtSSN_Bene1, strSSNBene1, "SSN");
		}			
		else if(strRelationshipBene1.equalsIgnoreCase("Estate of Insured")){
//			estateInsured(txtCorporateOfficer_Bene1, strCorporateOfficer_Bene1, txtTitle_Bene1, strTitle_Bene1, dropDownStateIncorporation_Bene1, strStateIncorporation_Bene1);				
		}
		else if(strRelationshipBene1.equalsIgnoreCase("Lawful Children of Insured")) {
			
		}
		else if(strRelationshipBene1.equalsIgnoreCase("Other")) {     
			EnterText(txtOtherRelationship_Bene1, strOtherRelation_Bene1, "Other Relationship");
			firstnameDetails(txtFN_Bene1,strFirstNameBene1, txtLN_Bene1, strLastNameBene1, strGenderBene1, radioMale_Bene1, radioFemale_Bene1);
//			EnterText(txtSSN_Bene1, strSSNBene1, "SSN");
		}
		else {
			firstnameDetails(txtFN_Bene1,strFirstNameBene1, txtLN_Bene1, strLastNameBene1, strGenderBene1, radioMale_Bene1, radioFemale_Bene1);
			EnterText(txtSSN_Bene1, strSSNBene1, "SSN");
		}
		if(indSharePercentage.equalsIgnoreCase("Yes")){
			EnterText(txtSharePer_Bene1, strSharePerBene1, "Share%");
		}
//		ClickElement(headingPrimaryBene, "Primary Beneficary");
	}
	
	public void charitableOrganization(WebElement txtEntityName, String strEntityName, WebElement txtCorporateOfficer, String strCorporateOfficere, WebElement txtTitle, 
			String strTitleBene, WebElement dropDownStateIncorporation, String strState) {
		EnterText(txtEntityName, strEntityName, "EntityName");
//		EnterText(txtCorporateOfficer, strCorporateOfficere, "CorporateOfficer");
//		EnterText(txtTitle, strTitleBene, "Title");
//		ComboSelectValue(dropDownStateIncorporation, strState, "StateIncorporation");
	}
	
	public void estateInsured(WebElement txtCorporateOfficer, String strCorporateOfficere, WebElement txtTitle, 
			String strTitleBene, WebElement dropDownStateIncorporation, String strState) {
		
		EnterText(txtCorporateOfficer, strCorporateOfficere, "CorporateOfficer");
		EnterText(txtTitle, strTitleBene, "Title");
		ComboSelectValue(dropDownStateIncorporation, strState, "StateIncorporation");
	}
	
	public void firstnameDetails(WebElement txtFN, String strFirstName, WebElement txtLN, String strLastName, String strGender, WebElement radioMale, WebElement radioFemale) {
		EnterText(txtFN, strFirstName, "FirstName");
		EnterText(txtLN, strLastName, "LastName");
		selectGender(strGender, radioMale, radioFemale);
	}
}
