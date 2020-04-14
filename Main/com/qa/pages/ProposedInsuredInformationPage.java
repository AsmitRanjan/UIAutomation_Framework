package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class ProposedInsuredInformationPage extends GenericFunction{
	
	//Initializing the Page Objects:
	public ProposedInsuredInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameProposedInsuredInformation;
	
	@FindBy(id="flda_13")
	public WebElement txtSSN;
	
	@FindBy(id="rdo_139_1")
	public WebElement rdoTermConversion_Yes;       
	
	@FindBy(id="rdo_140_1")
	public WebElement rdoFaceAmtIncrease_Yes;
	
	@FindBy(id="rdo_140_2")
	public WebElement rdoFaceAmtIncrease_No;
	
	
	@FindBy(id="rdo_23_1")
	public WebElement rdoGender_Male;
	
	@FindBy(id="rdo_23_2")
	public WebElement rdoGender_Female;
	
	@FindBy(id="lb_42")
	public WebElement dropdownCountryBirth;
	
	@FindBy(id="lb_44")
	public WebElement dropdownBirthState;
	
	@FindBy(id="rdo_151_1")
	public WebElement rdoMaritalStatus_Married;
	
	@FindBy(id="rdo_151_2")
	public WebElement rdoMaritalStatus_NotMarried;
	
	@FindBy(id="flda_8")
	public WebElement txtStreetAddress;
	
	@FindBy(id="flda_9")
	public WebElement txtCity;
	
	@FindBy(id="flda_12")
	public WebElement txtZip;
	
	@FindBy(id="flda_65")
	public WebElement txtCounty;
	
	@FindBy(id="flda_63")
	public WebElement txtYearsAddress;
	
	@FindBy(id="flda_74")
	public WebElement txtPhoneNumber;
	
	@FindBy(id="rdo_101_1")
	public WebElement rdoProposedInsuredOwner_Yes;
	
	@FindBy(id="rdo_101_2")
	public WebElement rdoProposedInsuredOwner_No;
	
	@FindBy(id="lb_149")
	public WebElement dropdownPayor;
	
	@FindBy(id="rdo_33_1")
	public WebElement rdoDriverLicense_Yes;
	
	@FindBy(id="rdo_33_2")
	public WebElement rdoDriverLicense_No;
	
	@FindBy(id="flda_1")
	public WebElement txtDriverLicenseNo;
	
	@FindBy(id="lb_36")
	public WebElement dropdownIssueState;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint jq-dte-is-required']")
	public WebElement txtMonth;
	
	@FindBy (xpath = "//input[@class='jq-dte-day jq-dte-is-required hint']")
	public WebElement txtDay;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint jq-dte-is-required']")
	public WebElement txtYear;
	
	@FindBy(id="flda_90")
	public WebElement txtEarned;
	
	@FindBy(id="flda_89")
	public WebElement txtUnearned;
	
	@FindBy(id="flda_88")
	public WebElement txtNetWorth;
	
	@FindBy(id="rdo_107_1")
	public WebElement rdoUSCitizen_Yes;
	
	@FindBy(id="rdo_107_2")
	public WebElement rdoUSCitizen_No;
	
	@FindBy(id="btn_132")
	public WebElement btnAddCitizenShipDetails;
	
	@FindBy(id="modalIframe")
	public WebElement frameCitizenshipDetails;
	
	@FindBy(id="modalIframe5")
	public WebElement frameForSaveBtn;
	
	@FindBy(id="lb_15")
	public WebElement dropdownCountryCitizenship;
	
	@FindBy(id="rdo_28_1")
	public WebElement rdoProposedInsGreenCard_Yes;
	
	@FindBy(id="rdo_28_2")
	public WebElement rdoProposedInsGreenCard_No;
	
	@FindBy(id="flda_9")
	public WebElement txtGreenCardNumber;
	
	@FindBy(id="rdo_27_1")
	public WebElement rdoProposedInsHoldUSVisa_Yes;
	
	@FindBy(id="rdo_27_2")
	public WebElement rdoProposedInsHoldUSVisa_No;
	
	@FindBy(id="flda_22")
	public WebElement txtTypeOfVisa;
	
	@FindBy(id="flda_16")
	public WebElement txtVISANumber;
	
	@FindBy(id="flda_24")
	public WebElement txtProvideDetails;
	
	@FindBy(id="btn_5")
	public WebElement btnSave;
	
	@FindBy(id="lb_110")
	public WebElement dropdownEmploymentStatus;
	
	@FindBy(id="rdo_164_1")
	public WebElement btnW9Sub_Cert_Yes;
	
	@FindBy(id="btn_79")
	public WebElement btnNext;
	
}
