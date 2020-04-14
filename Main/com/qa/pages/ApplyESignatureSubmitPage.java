package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class ApplyESignatureSubmitPage extends GenericFunction{
	//Initializing the Page Objects:
	public ApplyESignatureSubmitPage() {
		super();
		PageFactory.initElements(driver, this);
	}
		
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameApplyESignatureSubmit;
	
	@FindBy(id="cb_66")
	public WebElement cbRepresentative;
	
	@FindBy(id="flda_73")
	public WebElement txtCity;
	
	@FindBy(id="lb_76")
	public WebElement dropdownState;
	
	@FindBy(id="btn_110")
	public WebElement btnClkApplyeSign;
	
	@FindBy(id="btn_109")
	public WebElement btnClkHereSubmitApp;
	
	@FindBy(id="lbl_80")
	public WebElement txtThankYouMsg;

}
