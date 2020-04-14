package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class HealthQuestionsContPage extends GenericFunction {
	//Initializing the Page Objects:
	public HealthQuestionsContPage() {
		super();
		PageFactory.initElements(driver, this);
	}
		
		
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameHealthQuestionsCont;
	
	@FindBy(id="rdo_12_2")
	public WebElement rdoQuestionNo_1;
	
	@FindBy(id="rdo_18_2")
	public WebElement rdoQuestionNo_2;
	
	@FindBy(id="rdo_24_2")
	public WebElement rdoQuestionNo_3;
	
	@FindBy(id="rdo_28_2")
	public WebElement rdoQuestionNo_4;
	
	@FindBy(id="rdo_58_2")
	public WebElement rdoQuestionNo_5;
	
	@FindBy(id="rdo_52_2")
	public WebElement rdoQuestionNo_6;
	
	@FindBy(id="rdo_45_2")
	public WebElement rdoQuestionNo_7;
	
	@FindBy(id="rdo_38_2")
	public WebElement rdoQuestionNo_8;
	
	@FindBy(id="btn_7")
	public WebElement btnNext;

}
