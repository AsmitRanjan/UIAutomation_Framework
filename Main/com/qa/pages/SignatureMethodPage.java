package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class SignatureMethodPage extends GenericFunction{
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameSignatureMethodScreen;
	
	@FindBy(id="cb_41")
	public WebElement cbCollectESignature;
	
	@FindBy(id="btn_6")
	public WebElement btnNext ;
	
	//Initializing the Page Objects:
	public SignatureMethodPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
