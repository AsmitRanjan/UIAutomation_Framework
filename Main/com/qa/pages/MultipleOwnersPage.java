package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class MultipleOwnersPage extends GenericFunction{
	
	//Initializing the Page Objects:
	public MultipleOwnersPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameMultipleOwners;
	
	@FindBy(id="modalIframe")
	public WebElement frameMultipleOwnersInformation;
	
	@FindBy(id="grdx5_addRowButton")
	public WebElement btnClickHere;
	
	@FindBy(id="flda_48")
	public WebElement txtFirst;
	
	@FindBy(id="flda_46")
	public WebElement txtLast;
	
	@FindBy(id="flda_45")
	public WebElement txtStreet;
	
	@FindBy(id="flda_44")
	public WebElement txtCity;
	
	@FindBy(id="lb_43")
	public WebElement dropdownState;
	
	@FindBy(id="flda_42")
	public WebElement txtZipcode;
	
	@FindBy(id="flda_25")
	public WebElement txtSSN;

	@FindBy(id="cb_15")
	public WebElement rdoAnyOwner;
	
	@FindBy(id="btn_10")
	public WebElement btnNext;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint jq-dte-is-required']")
	public WebElement txtMonth;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-day hint jq-dte-is-required']")
	public WebElement txtDay;    
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint jq-dte-is-required']")
	public WebElement txtYear;
	
}
