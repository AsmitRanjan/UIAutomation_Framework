package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class WholeLifeCoverageRidersPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameWholeLifeCoverageRiders;
	
	@FindBy(id="flda_97")
	public WebElement txtBaseFaceAmount;
	
	@FindBy(id="flda_28")
	public WebElement txtInitialBasePremium;
	
	@FindBy(id="rdo_190_1")
	public WebElement rdoCashWithApp_Yes;
	
	@FindBy(id="rdo_190_2")
	public WebElement rdoCashWithApp_No;
	
	@FindBy(id="flda_189")
	public WebElement txtPremiumAmount;
	
	@FindBy(id="flda_166")
	public WebElement txtIndexedDividendAllocation;
	
	@FindBy(id="lb_173")
	public WebElement drodownNonforfeiture;
	//**********
	@FindBy(id="cb_71")
	public WebElement cbAcceleratorRider;
	
	@FindBy(id="flda_154")
	public WebElement txtBilledPrem;
	
	@FindBy(id="flda_152")
	public WebElement txt1035Premium;
	
	@FindBy(id="flda_153")
	public WebElement txtNon1035Premium;
	
	@FindBy(id="cb_75")
	public WebElement cbBlendRider; 
	
	@FindBy(id="flda_156")
	public WebElement txtBilledPremBlendAccelerator; 
	
	@FindBy(id="flda_155")
	public WebElement txt1035PremiumBlendAccelerator;
	
	@FindBy(id="flda_157")
	public WebElement txtNon1035PremiumBlendAccelerator;
	
	@FindBy(id="flda_159")
	public WebElement txtTargetFaceAmt;
	
	@FindBy(id="cb_65")
	public WebElement cbSameInsuredTermRider; 
	
	@FindBy(id="flda_158")
	public WebElement txtAnnualFaceAmt; 
	
	@FindBy(id="flda_160")
	public WebElement txtAmount_SITR;
	
	@FindBy(id="lb_21")
	public WebElement dropdownGuaranteedPeriod_SITR;
	
	@FindBy(id="cb_123")
	public WebElement cbSurvivorPurchaseOptionRider; 
	
	@FindBy(id="flda_161")
	public WebElement txtFaceAmt_SPO; 
	
	@FindBy(id="flda_129")
	public WebElement txtFirst_SPO;
	
	@FindBy(id="flda_133")
	public WebElement txtLast_SPO;
	
	@FindBy(id="btn_102")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public WholeLifeCoverageRidersPage() {
		super();
		PageFactory.initElements(driver, this);
	}

}
