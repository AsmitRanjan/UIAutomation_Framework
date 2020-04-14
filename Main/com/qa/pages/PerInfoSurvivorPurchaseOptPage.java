package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class PerInfoSurvivorPurchaseOptPage extends GenericFunction{
	//Initializing the Page Objects:
	public PerInfoSurvivorPurchaseOptPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement framePerInfoSurvivorPurchaseOption;
	
	@FindBy(id="rdo_72_2")
	public WebElement rdoQuestionNo_1;
	
	@FindBy(id="rdo_68_2")
	public WebElement rdoQuestionNo_2;
	
	@FindBy(id="rdo_67_2")
	public WebElement rdoQuestionNo_3;
	
	@FindBy(id="rdo_74_2")
	public WebElement rdoQuestionNo_4;
	
	@FindBy(id="rdo_80_2")
	public WebElement rdoQuestionNo_5;
	
	@FindBy(id="rdo_83_2")
	public WebElement rdoQuestionNo_6;
	
	@FindBy(id="rdo_86_2")
	public WebElement rdoQuestionNo_7;
	
	@FindBy(id="rdo_89_2")
	public WebElement rdoQuestionNo_8;
	
	@FindBy(id="rdo_93_2")
	public WebElement rdoQuestionNo_9;
	
	@FindBy(id="rdo_95_2")
	public WebElement rdoQuestionNo_10;
	
	@FindBy(id="rdo_103_2")
	public WebElement rdoQuestionNo_11;
	
	@FindBy(id="rdo_100_2")
	public WebElement rdoQuestionNo_12;
	
	@FindBy(id="rdo_107_2")
	public WebElement rdoQuestionNo_13;
	
	@FindBy(id="rdo_105_2")
	public WebElement rdoQuestionNo_14;
	
	@FindBy(id="btn_14")
	public WebElement btnNext;
}
