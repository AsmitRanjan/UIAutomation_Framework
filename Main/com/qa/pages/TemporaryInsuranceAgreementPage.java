package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class TemporaryInsuranceAgreementPage extends GenericFunction{
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameTemporaryInsuranceAgreement;
	
	@FindBy(id="lb_30")
	public WebElement dropDownPaymentMethod;
	
	@FindBy(id="rdo_19_2")
	public WebElement rdoQuestionNo_1;
	
	@FindBy(id="rdo_18_2")
	public WebElement rdoQuestionNo_2;
	
	@FindBy(id="rdo_17_2")
	public WebElement rdoQuestionNo_3;
	
	@FindBy (id = "btn_1")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public TemporaryInsuranceAgreementPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
