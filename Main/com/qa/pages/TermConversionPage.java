package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class TermConversionPage extends GenericFunction{
	
	//Initializing the Page Objects:
	public TermConversionPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameTermConversion;
	
	@FindBy(id="flda_32")
	public WebElement txtPolicyNumber;
	
	@FindBy(id="rdo_29_1")
	public WebElement rdoConversionOf_TermPolicy;
	
	@FindBy(id="rdo_33_1")
	public WebElement rdoConversionType_Full;
	
	@FindBy(id="flda_61")
	public WebElement txtTotalAmountConvert;
	
	@FindBy(id="btn_56")
	public WebElement btnNext;
	
}
