package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class SurvivorPurchaseOptionPage extends GenericFunction{
	//Initializing the Page Objects:
	public SurvivorPurchaseOptionPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameSurvivorPurchaseOption;
	
	@FindBy (xpath = "(//span/input[@class='jq-dte-month hint jq-dte-is-required'])[1]")
	public WebElement txtMonth;
	
	@FindBy (xpath = "(//span/input[@class='jq-dte-day hint jq-dte-is-required'])[1]")
	public WebElement txtDay;    
	
	@FindBy (xpath = "(//span/input[@class='jq-dte-year hint jq-dte-is-required'])[1]")
	public WebElement txtYear;
	
	@FindBy(id="flda_13")
	public WebElement txtSSN;
	
	@FindBy(id="rdo_23_1")
	public WebElement rdoMale;
	
	@FindBy(id="lb_44")
	public WebElement dropdownBirthState;
	
	@FindBy(id="lb_103")
	public WebElement dropdownRelationshipPropIns;
	
	@FindBy(id="cb_78")
	public WebElement cbSurvivorPurchase;
	
	@FindBy(id="flda_63")
	public WebElement txtYearsAddress;
	
	@FindBy(id="flda_74")
	public WebElement txtPhoneNumber;
	
	@FindBy(id="rdo_33_1")
	public WebElement rdoDriverLicense_Yes;
	
	@FindBy(id="flda_1")
	public WebElement txtDriverLicenseNumber;
	
	@FindBy(id="lb_36")
	public WebElement dropdownIssueState;
	
	@FindBy(id="rdo_107_1")
	public WebElement rdoUSCitizen_Yes;
	
	@FindBy(id="lb_110")
	public WebElement dropdownEmployementStatus;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint jq-dte-is-required']") 
	public WebElement txtMonthDL;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-day hint jq-dte-is-required']") 
	public WebElement txtDayDL;    
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint jq-dte-is-required']") 
	public WebElement txtYearDL;
	
	@FindBy(id="btn_79")
	public WebElement btnNext;
}
