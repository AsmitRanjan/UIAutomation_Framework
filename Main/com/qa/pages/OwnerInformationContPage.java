package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class OwnerInformationContPage extends GenericFunction{
	
	//Initializing the Page Objects:
	public OwnerInformationContPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameOwnerInformationCont;
	
	@FindBy(id="flda_56")
	public WebElement txtFirstName;
	
	@FindBy(id="flda_58")
	public WebElement txtLastName;
	
	@FindBy(id="flda_12")
	public WebElement txtPosition;
	
	@FindBy(id="lb_72")
	public WebElement dropdownState;
	
	@FindBy(id="flda_53")
	public WebElement txtFirstNameTrustee;
	
	@FindBy(id="flda_55")
	public WebElement txtLastNameTrustee;
	
	@FindBy(id="flda_28")
	public WebElement txtSSN;
	
	@FindBy(id="lb_87")
	public WebElement dropdownTrustInfo;
	
	@FindBy(id="btn_7")
	public WebElement btnNext;
}
