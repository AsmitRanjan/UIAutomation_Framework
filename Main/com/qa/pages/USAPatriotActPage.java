package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class USAPatriotActPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameUSAPatriotAct;
	
	@FindBy(id="cb_104")
	public WebElement cbInheritance;
	
	@FindBy(id="cb_117")
	public WebElement cbAutoFill;
	
	@FindBy(id="lb_76")
	public WebElement dropdownFormID;
	
	@FindBy(id="flda_75")
	public WebElement txtIssuer;
	
	
	@FindBy(id="flda_79")
	public WebElement txtNumberID;
	
	@FindBy(id="flda_69")
	public WebElement txtState;
	
	@FindBy(id="lb_74")
	public WebElement dropdownDocReviewed;
	
	@FindBy (xpath = "//span[@class='jq-dte-inner jq-dte-is-required']/input[1]")
	public WebElement txtMonth;
	
	@FindBy (xpath = "//span[@class='jq-dte-inner jq-dte-is-required']/input[2]")
	public WebElement txtDay;
	
	@FindBy (xpath = "//span[@class='jq-dte-inner jq-dte-is-required']/input[3]")
	public WebElement txtYear;	
	
	//Multiple owner
	@FindBy(id="lb_90")
	public WebElement dropdownFormID_MO;
	
	@FindBy(id="flda_89")
	public WebElement txtIssuer_MO;
	
	@FindBy(id="flda_84")
	public WebElement txtName_MO;
	
	@FindBy(id="flda_83")
	public WebElement txtStreet_MO;
	
	@FindBy(id="flda_82")
	public WebElement txtCity_MO;
	
	@FindBy(id="lb_81")
	public WebElement dropdownState_MO;
	
	@FindBy(id="flda_80")
	public WebElement txtZip_MO;
	
	@FindBy(id="flda_88")
	public WebElement txtNumberID_MO;
	
	@FindBy(id="flda_86")
	public WebElement txtCountry_MO;
	
	@FindBy (xpath = "//input[@class='jq-dte-month hint jq-dte-is-required']")
	public WebElement txtMonth_MO;
	
	@FindBy (xpath = "//input[@class='jq-dte-day hint jq-dte-is-required']")
	public WebElement txtDay_MO;
	
	@FindBy (xpath = "//input[@class='jq-dte-year hint jq-dte-is-required']")
	public WebElement txtYear_MO;	
	
	//********************
	
	@FindBy(id="cb_61")
	public WebElement cbICertify;
	
	@FindBy(id="btn_77")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public USAPatriotActPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
