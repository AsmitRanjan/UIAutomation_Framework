package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class eSigDisclosuresPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameESigDisclosures;
	
	@FindBy(id="rdo_24_1")
	public WebElement rdoProInsYes;
	
	@FindBy(id="lb_28")
	public WebElement dropdownIdentification;
	
	@FindBy(id="rdo_25_1")
	public WebElement rdoProInsYes_Owner;
	
	@FindBy(id="lb_30")
	public WebElement dropdownIdentification_Owner;
	
	@FindBy(id="rdo_80_1")
	public WebElement rdoProInsYes_Survivor;
	
	@FindBy(id="lb_82")
	public WebElement dropdownIdentification_Survivor;
	
	@FindBy(id="btn_77")
	public WebElement btnNext;
	
	@FindBy(id="rdo_66_1")
	public WebElement rdoProInsYes_MO;
	
	@FindBy(id="lb_70")
	public WebElement dropdownIdentification_MO;
	
	@FindBy(id="btn_79")
	public WebElement btnNext2;
	
	//Initializing the Page Objects:
	public eSigDisclosuresPage() {
		super();
		PageFactory.initElements(driver, this);
	}

}
