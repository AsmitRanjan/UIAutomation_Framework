package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class ValidateAndLockDataPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameValidateAndLockData;
	
	@FindBy(id="btn_8")
	public WebElement btnLockData;
	
	@FindBy(id="btn_35")
	public WebElement btnNext;
	
	@FindBy(id="btn_4")
	public WebElement btnWetSignedNext;

	//Initializing the Page Objects:
	public ValidateAndLockDataPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
