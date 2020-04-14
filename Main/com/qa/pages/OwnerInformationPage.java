package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class OwnerInformationPage extends GenericFunction{
	
	//Initializing the Page Objects:
	public OwnerInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameOwnerInformation;
	
	@FindBy(id="lb_29")
	public WebElement dropdownTypeOwner;
	
	@FindBy(id="lb_44")
	public WebElement dropdownRelProposedInsured;
	
	@FindBy(id="cb_5")
	public WebElement cbOwnerAddress;
	
	@FindBy(id="flda_2")
	public WebElement txtPhoneNumber;
	
	@FindBy(id="flda_15")
	public WebElement txtOwnerFirstName;
	
	@FindBy(id="flda_17")
	public WebElement txtOwnerLastName;
	
	@FindBy(id="flda_26")
	public WebElement txtOwnerSSN;
	
	@FindBy(id="lb_121")
	public WebElement dropdownBirthState;
	
	@FindBy(id="rdo_54_1")
	public WebElement rdoGender_Male;
	
	@FindBy(id="rdo_54_2")
	public WebElement rdoGender_Female;
	
	@FindBy(id="rdo_97_1")
	public WebElement rdoMaritalStatus_Married;
	
	@FindBy(id="rdo_97_2")
	public WebElement rdoMaritalStatus_NotMarried;
	
	@FindBy(id="rdo_147_1")
	public WebElement rdoDriverLicense_Yes;
	
	@FindBy(id="flda_139")
	public WebElement txtDriverLicenseNo;
	
	@FindBy(id="lb_142")
	public WebElement dropdownIssueState;
	
	@FindBy(id="rdo_66_2")
	public WebElement rdoContingentOwner_No;
	
	@FindBy(id="rdo_64_1")
	public WebElement rdoMultipleOwners_Yes;
	
	@FindBy(id="rdo_64_2")
	public WebElement rdoMultipleOwners_No;
	
	@FindBy(id="rdo_91_1")
	public WebElement rdoJoint;
	
	@FindBy(id="rdo_127_1")
	public WebElement rdoUSCitizen_Yes;
	
	@FindBy(id="rdo_127_2")
	public WebElement rdoUSCitizen_No;
	
	@FindBy(id="lb_116")
	public WebElement dropdownEmploymentStatus;
	
	@FindBy(id="rdo_149_2")
	public WebElement rdoW9Sbstitute_No;
	
	@FindBy (xpath = "//span[@class='jq-dte-inner jq-dte-is-required']/input[1]")
	public WebElement txtMonth;
	
	@FindBy (xpath = "//span[@class='jq-dte-inner jq-dte-is-required']/input[2]")
	public WebElement txtDay;
	
	@FindBy (xpath = "//span[@class='jq-dte-inner jq-dte-is-required']/input[3]")
	public WebElement txtYear;	
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint jq-dte-is-required']")
	public WebElement txtMonthDL;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-day jq-dte-is-required hint']")
	public WebElement txtDayDL;    
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint jq-dte-is-required']")
	public WebElement txtYearDL;
	
	@FindBy(id="lb_70")
	public WebElement dropdownBusinessType;
	
	@FindBy(id="lb_72")
	public WebElement dropdownInsurableInterest;
	
	@FindBy(id="flda_59")
	public WebElement txtEntityName;
	
	@FindBy(id="flda_26")
	public WebElement txtTaxIDNumber;
	
	@FindBy(id="flda_81")
	public WebElement txtTrust;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint jq-dte-is-required']")
	public WebElement txtMonthTrust;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-day jq-dte-is-required hint']")
	public WebElement txtDayTrust;   
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint jq-dte-is-required']")
	public WebElement txtYearTrust;
	
	@FindBy(id="flda_11")
	public WebElement txtEntityNameQualifiedPlan;
	
	@FindBy(id="flda_80")
	public WebElement txtCustodianFirst;
	
	@FindBy(id="flda_79")
	public WebElement txtCustodianLast;
	
	@FindBy(id="lb_60")
	public WebElement dropdownCustodianState;
	
	@FindBy(id="rdo_54_1")
	public WebElement rdoCustodianMale;
	
	@FindBy(id="btn_12")
	public WebElement btnNext;
}
