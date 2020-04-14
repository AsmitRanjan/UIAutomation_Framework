package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class PersonalInformationPage extends GenericFunction{
	//Initializing the Page Objects:
	public PersonalInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
		
		
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement framePersonalInformation;
	
	@FindBy(id="rdo_8_2")
	public WebElement rdoQuestionNo_1;
	
	@FindBy(id="rdo_33_2")
	public WebElement rdoQuestionNo_2;
	
	@FindBy(id="rdo_44_2")
	public WebElement rdoQuestionNo_3;
	
	@FindBy(id="rdo_58_2")
	public WebElement rdoQuestionNo_4;
	
	@FindBy(id="rdo_62_2")
	public WebElement rdoQuestionNo_5;
	
	@FindBy(id="rdo_66_2")
	public WebElement rdoQuestionNo_6;
	
	@FindBy(id="rdo_79_2")
	public WebElement rdoQuestionNo_7;
	
	@FindBy(id="rdo_96_2")
	public WebElement rdoQuestionNo_8;
	
	@FindBy(id="rdo_98_2")
	public WebElement rdoQuestionNo_9;
	
	@FindBy(id="rdo_100_2")
	public WebElement rdoQuestionNo_10;
	
	@FindBy(id="rdo_113_2")
	public WebElement rdoQuestionNo_11;
	
	@FindBy(id="rdo_111_2")
	public WebElement rdoQuestionNo_12;
	
	@FindBy(id="rdo_128_2")
	public WebElement rdoQuestionNo_13;
	
	@FindBy(id="rdo_116_2")
	public WebElement rdoCompletingHealthInformationNo;
	
	@FindBy(id="btn_14")
	public WebElement btnNext;
	
	
}
