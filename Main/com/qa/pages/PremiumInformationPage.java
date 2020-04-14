package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class PremiumInformationPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement framePremiumInformation;
	
	@FindBy(id="lb_13")
	public WebElement dropdownPaymentMode;
	
	@FindBy(id="flda_57")
	public WebElement txtOtherMode;
	
	@FindBy(id="rdo_25_2")
	public WebElement rdoIsPolicyBeingFunded_No;
	
	@FindBy(id="btn_11")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public PremiumInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
