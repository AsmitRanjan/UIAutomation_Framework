package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class HIVConsentPage extends GenericFunction{
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameHIVConsent;
	
	@FindBy(id="btn_21")
	public WebElement btnNext;
		
	//Initializing the Page Objects:
	public HIVConsentPage() {
		super();
		PageFactory.initElements(driver, this);
	}	
		
		
}
