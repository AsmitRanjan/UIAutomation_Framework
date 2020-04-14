package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class eSignaturePartiesPage extends GenericFunction{
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameESignatureParties;
	
	@FindBy(id="cb_128")
	public WebElement cbInsuredAgreement;
	
	@FindBy(id="cb_47")
	public WebElement cbOwner;
	
	@FindBy(id="cb_106")
	public WebElement cbMO;
	
	@FindBy(id="cb_132")
	public WebElement cbSurvivor;
	
	@FindBy(id="flda_9")
	public WebElement txtCity;
	
	@FindBy(id="btn_110")
	public WebElement btnApply;
	
	@FindBy(id="btn_140")
	public WebElement btnYesContinue;
	
	//Initializing the Page Objects:
	public eSignaturePartiesPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
