package com.qa.pageActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.qa.pages.ProposedInsuredInformationPage;
import com.relevantcodes.extentreports.LogStatus;

public class ProposedInsuredInfoAction extends ProposedInsuredInformationPage{
	
	public ProposedInsuredInfoAction() {
		super();
	}
	
	//Actions:
	public OwnerInformationPageAction enterData(String isTermConversion, String doFaceAmtIncrease, String SSN, String gender, String birthCountry, String birthState, 
			String maritalQuestion,
			String Street, String City, String ZipCode, String County, String yearsAtAddress, String PhoneNumber,
			String willTheProposedInsuredBeOwner, String whoWillBePayor, String DoesInsuredHaveDL, String DLNo, 
			String IssueState, String ExpirationDate, String earned, String unEarned, String netWorth, String isProposedInsuredUSCitizen,
			String countryofCitizenship, String doesProposedInsuredHoldGreenCard, String greenCardNumber, String GCExpirationDate,
			String doesProposedInsuredHoldUSVisa, String typeOfVisa, String visaExpirationDate,	String visaNumber, String provideDetails) throws AWTException, InterruptedException {
		
		extentTest.log(LogStatus.INFO, " - Proposed Insured Information Page - ");
		switchToFrame(frameProposedInsuredInformation);
		
		if(SelectionIndAsYes(isTermConversion, "Is Term Conversion")) {
			ClickElement(rdoTermConversion_Yes, "TermConversion_Yes");
			selectYesNoRdoBtn(doFaceAmtIncrease, "Do Face Amount Increase", rdoFaceAmtIncrease_Yes, rdoFaceAmtIncrease_No);
		}
		
		EnterText(txtSSN, SSN, "SSN");
		selectGender(gender, rdoGender_Male, rdoGender_Female);
		ComboSelectValue(dropdownCountryBirth, birthCountry,"Country of Birth");
		ComboSelectValue(dropdownBirthState, birthState,"Birth State");	
		maritalStatusReusable(maritalQuestion,rdoMaritalStatus_Married, rdoMaritalStatus_NotMarried);
		EnterText(txtStreetAddress, Street, "StreetAddress");
		EnterText(txtCity, City, "City");
		EnterText(txtZip, ZipCode, "ZipCode");
		EnterText(txtCounty, County, "County");
		EnterText(txtYearsAddress, yearsAtAddress, "Years At Address");
		EnterText(txtPhoneNumber, PhoneNumber, "Phone Number");
		selectYesNoRdoBtn(willTheProposedInsuredBeOwner, "The Proposed Insured Be Owner", rdoProposedInsuredOwner_Yes, rdoProposedInsuredOwner_No);
		ComboSelectValue(dropdownPayor, whoWillBePayor,"Payor");
		selectYesNoRdoBtn(DoesInsuredHaveDL,"Driving License", rdoDriverLicense_Yes, rdoDriverLicense_No);
		driverLicenseDetails(DoesInsuredHaveDL, DLNo, IssueState, ExpirationDate);
		EnterText(txtEarned, earned, "Earned");
		EnterText(txtUnearned, unEarned, "UnEarned");
		EnterText(txtNetWorth, netWorth, "NetWorth");
		isProInsUSCitizen(isProposedInsuredUSCitizen, countryofCitizenship, doesProposedInsuredHoldGreenCard, greenCardNumber, GCExpirationDate,
				doesProposedInsuredHoldUSVisa, typeOfVisa, visaExpirationDate, visaNumber, provideDetails);	
		switchToDefault();
		switchToFrame(frameProposedInsuredInformation);
		Thread.sleep(5000);
		ComboSelectValue(dropdownEmploymentStatus, "Retired","EmploymentStatus");	
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("Yes")) {
			ClickElement(btnW9Sub_Cert_Yes, "W-9 Substitute Certification Yes button");
		}
		takeScreenshot("ProposedInsuredPage");
		ClickElement(btnNext, "Next Button");
		switchToDefault();
		Thread.sleep(5000);
		return new OwnerInformationPageAction();
	}
	
	public void driverLicenseDetails(String indicator_DL, String DLNo, String IssueState, String ExpirationDate) {
		if(indicator_DL.equalsIgnoreCase("Yes"))			
		{
			EnterText(txtDriverLicenseNo, DLNo, "DriverLicenseNo");
			ComboSelectValue(dropdownIssueState, IssueState, "Issue State");
			DLexpirationDate(ExpirationDate);
		}	
	}
	
	public void DLexpirationDate(String date)
	{	
		String[] dateDemo = date.split("/");
		String strMonth = dateDemo[0];
		String strDay = dateDemo[1];
		String strYear = dateDemo[2];
		txtMonth.sendKeys(strMonth);	
		txtYear.sendKeys(strYear);
		txtDay.sendKeys(strDay);
		
		extentTest.log(LogStatus.INFO, date + " is entered in Driver License Expiration Date");	
	}
	
	public void isProInsUSCitizen(String indicator, String countryofCitizenship, String doesProposedInsuredHoldGreenCard, String greenCardNumber, 
			String GCExpirationDate, String doesProposedInsuredHoldUSVisa, String typeOfVisa, String visaExpirationDate, String visaNumber, 
			String provideDetails) throws AWTException, InterruptedException
	{	
		selectYesNoRdoBtn(indicator,"Is Proposed Insured US Citizen ", rdoUSCitizen_Yes, rdoUSCitizen_No);
		if(indicator.equalsIgnoreCase("No")) {
			ClickElement(btnAddCitizenShipDetails, "Additional Citizenship Details");
			switchToDefault();
			switchToFrame(frameCitizenshipDetails);
			Thread.sleep(2000);
			ComboSelectValue(dropdownCountryCitizenship, countryofCitizenship,"Country of Citizenship");
			selectYesNoRdoBtn(doesProposedInsuredHoldGreenCard, "DoesProposedInsuredHoldGreenCard", rdoProposedInsGreenCard_Yes, rdoProposedInsGreenCard_No);
			if(doesProposedInsuredHoldGreenCard.equalsIgnoreCase("Yes")) {
				EnterText(txtGreenCardNumber, greenCardNumber, "GreenCard Number");
			}else {
				selectYesNoRdoBtn(doesProposedInsuredHoldUSVisa, "DoesProposedInsuredHoldUSVisa", rdoProposedInsHoldUSVisa_Yes, rdoProposedInsHoldUSVisa_No);
				if(doesProposedInsuredHoldUSVisa.equalsIgnoreCase("Yes")) {
					EnterText(txtTypeOfVisa, typeOfVisa, "Type Of Visa");
					EnterText(txtVISANumber, visaNumber, "Visa Number");
				}else {
					EnterText(txtProvideDetails, provideDetails, "Provide Details");
				}
			}
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
}
