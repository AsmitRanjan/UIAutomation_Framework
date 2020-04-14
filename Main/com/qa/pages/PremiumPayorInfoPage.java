package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class PremiumPayorInfoPage extends GenericFunction{
	//Initializing the Page Objects:
	public PremiumPayorInfoPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement framePremiumPayorInfo;
	
	@FindBy(id="lb_155")
	public WebElement dropdownRelationship;
	
	@FindBy(id="flda_77")
	public WebElement txtFirstName;
	
	@FindBy(id="flda_79")
	public WebElement txtLastName;
	
	@FindBy(id="flda_83")
	public WebElement txtStreetAddress;
	
	@FindBy(id="flda_82")
	public WebElement txtCity;
	
	@FindBy(id="lb_81")
	public WebElement dropdownState;
	
	@FindBy(id="flda_80")
	public WebElement txtZip;
	
	@FindBy(id="flda_166")
	public WebElement txtCounty;
	
	@FindBy(id="flda_123")
	public WebElement txtYearsThisAdd;
	
	@FindBy(id="flda_124")
	public WebElement txtSSN;
	
	@FindBy(id="lb_127")
	public WebElement dropdownBirthState;
	
	@FindBy(id="rdo_130_1")
	public WebElement rdoGender_Male;
	
	@FindBy(id="rdo_125_1")
	public WebElement rdoMarried;
	
	@FindBy(id="lb_156")
	public WebElement dropdownEmpStatus;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint jq-dte-is-required']")
	public WebElement txtMonth;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-day hint jq-dte-is-required']")
	public WebElement txtDay;    
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint jq-dte-is-required']")
	public WebElement txtYear;

	
	@FindBy(id="btn_11")
	public WebElement btnNext;
	
}
