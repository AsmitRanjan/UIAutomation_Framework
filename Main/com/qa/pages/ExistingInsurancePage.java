package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class ExistingInsurancePage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameExistingInsurance;
	
	@FindBy(id="rdo_19_2")
	public WebElement rdoQuestionNo_1;
	
	@FindBy(id="rdo_28_2")
	public WebElement rdoQuestionNo_2;
	
	@FindBy(id="rdo_66_2")
	public WebElement rdoQuestionNo_3;
	
	@FindBy(id="rdo_58_2")
	public WebElement rdoQuestionNo_4;
	
	@FindBy(id="btn_14")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public ExistingInsurancePage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
