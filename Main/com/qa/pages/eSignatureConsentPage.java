package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class eSignatureConsentPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameeSignatureConsent;
	
	@FindBy(id="btn_15")
	public WebElement btnReviewApplication ;
	
	@FindBy(id="cb_2")
	public WebElement cbApplicants;
	
	@FindBy(id="cb_19")
	public WebElement cbAgent;
	
	@FindBy(id="cb_10")
	public WebElement cbOwner;
	
	@FindBy(id="cb_54")
	public WebElement cbMO;
	
	@FindBy(id="cb_71")
	public WebElement cbSurvivor;
	
	@FindBy(id="btn_8")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public eSignatureConsentPage() {
		super();
		PageFactory.initElements(driver, this);
	}

}
