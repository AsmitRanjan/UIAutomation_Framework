package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class FamilyHistoryPage extends GenericFunction {
	//Initializing the Page Objects:
	public FamilyHistoryPage() {
		super();
		PageFactory.initElements(driver, this);
	}
				
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameFamilyHistory;
	
	@FindBy(id="rdo_48_2")
	public WebElement rdoDoSibling_No;
	
	@FindBy(id="flda_39")
	public WebElement txtAgeMother;
	
	@FindBy(id="flda_37")
	public WebElement txtAgeFather;
	
	@FindBy(id="rdo_28_2")
	public WebElement rdoCancerMother;
	
	@FindBy(id="rdo_27_2")
	public WebElement rdoCancerFather;
	
	@FindBy(id="rdo_24_2")
	public WebElement rdoHeartMother;
	
	@FindBy(id="rdo_23_2")
	public WebElement rdoHeartFather;
	
	@FindBy(id="rdo_20_2")
	public WebElement rdoDiabetesMother;
	
	@FindBy(id="rdo_19_2")
	public WebElement rdoDiabetesFather;
	
	@FindBy(id="btn_10")
	public WebElement btnNext;
	
}
