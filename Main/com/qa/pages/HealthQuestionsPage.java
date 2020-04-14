package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class HealthQuestionsPage extends GenericFunction {
	
	//Initializing the Page Objects:
	public HealthQuestionsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
		
		
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameHealthQuestions;
	
	@FindBy(id="modalIframe")
	public WebElement frameHealthQuestionsDetails;
	
	@FindBy(id="btn_30")
	public WebElement btnProposedInsured;
	
	@FindBy(id="lb_5")
	public WebElement dropdownHeight_ft;
	
	@FindBy(id="lb_9")
	public WebElement dropdownHeight_In;
	
	@FindBy(id="flda_10")
	public WebElement txtWeight;
	
	@FindBy(id="rdo_14_2")
	public WebElement rdoLostGainedWait_No;
	
	@FindBy(id="btn_2")
	public WebElement btnSave;
	
	@FindBy(id="rdo_15_2")
	public WebElement rdoQuestionNo_1;
	
	@FindBy(id="rdo_21_2")
	public WebElement rdoQuestionNo_2;
	
	@FindBy(id="rdo_27_2")
	public WebElement rdoQuestionNo_3;
	
	@FindBy(id="rdo_57_2")
	public WebElement rdoQuestionNo_4;
	
	@FindBy(id="rdo_51_2")
	public WebElement rdoQuestionNo_5;
	
	@FindBy(id="rdo_44_2")
	public WebElement rdoQuestionNo_6;
	
	@FindBy(id="rdo_38_2")
	public WebElement rdoQuestionNo_7;
	
	@FindBy(id="rdo_87_2")
	public WebElement rdoQuestionNo_8;
	
	@FindBy(id="rdo_78_2")
	public WebElement rdoQuestionNo_9;
	
	@FindBy(id="rdo_70_2")
	public WebElement rdoQuestionNo_10;
	
	@FindBy(id="rdo_64_2")
	public WebElement rdoQuestionNo_11;
	
	@FindBy(id="btn_9")
	public WebElement btnNext;
	
}
