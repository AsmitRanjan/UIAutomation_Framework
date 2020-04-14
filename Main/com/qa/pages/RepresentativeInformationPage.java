package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class RepresentativeInformationPage extends GenericFunction {
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameRepresentativeInformation;
	
	@FindBy(id="lb_7")
	public WebElement dropdownRepresentativeCode;
	
	@FindBy(id="flda_20")
	public WebElement txtName;
	
	@FindBy(id="flda_34")
	public WebElement txtPhoneNumber;
	
	@FindBy(id="rdo_27_2")
	public WebElement rdoQuestion1_No;
	
	@FindBy(id="rdo_63_2")
	public WebElement rdoQuestion2_No;
	
	@FindBy(id="rdo_73_1")
	public WebElement rdoQuestion3_Yes;
	
	@FindBy(id="rdo_61_1")
	public WebElement rdoQuestion4_Yes;
	
	@FindBy(id="cb_69")
	public WebElement cbPhotoID;
		
	@FindBy(id="rdo_79_2")
	public WebElement rdoShdAppEvaluated_No;
	
	@FindBy(id="btn_85")
	public WebElement btnNext;
	
	
	
	//Initializing the Page Objects:
	public RepresentativeInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}

}
