package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class BeneficiaryInformationPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameBeneficiaryInfo;
	
	@FindBy(id="btn_18")
	public WebElement btnAddThePrimaryBeneficiary;
	
	@FindBy(id="modalIframe")
	public WebElement framePrimaryBeneficiary;
		
	@FindBy (id = "lbl_29")
	public WebElement headingPrimaryBene;
	
	@FindBy (id = "rdo_109_1")
	public WebElement radioShareYes;
	
	@FindBy (id = "rdo_109_2")
	public WebElement radioShareNo;
	
	@FindBy (id = "lb_3")
	public WebElement dropDownDeceasedSharePaid;
	
	@FindBy (id = "rdo_125_1")
	public WebElement radioMale;
		
	@FindBy (id = "rdo_125_2")
	public WebElement radioFemale;
	
	@FindBy (id = "lb_35")
	public WebElement dropDownRelnship_Bene1;
	
	@FindBy (id = "flda_41")
	public WebElement txtOtherRelationship_Bene1;
	
	@FindBy (id = "flda_31")
	public WebElement txtFN_Bene1;
	
	@FindBy (id = "flda_33")
	public WebElement txtLN_Bene1;
	
	@FindBy (id = "flda_27")
	public WebElement txtEntityName_Bene1;
	
	@FindBy (id = "flda_127")
	public WebElement txtCorporateOfficer_Bene1;
	
	@FindBy (id = "flda_133")
	public WebElement txtTitle_Bene1;
	
	@FindBy (id = "lb_131")
	public WebElement dropDownStateIncorporation_Bene1;
	
	@FindBy (id = "flda_25")
	public WebElement txtSSN_Bene1;
	
	@FindBy (id = "flda_39")
	public WebElement txtSharePer_Bene1;
	
	@FindBy (id = "rdo_130_1")
	public WebElement radioMale_Bene1;
		
	@FindBy (id = "rdo_130_2")
	public WebElement radioFemale_Bene1;
	
	@FindBy (id = "lb_55")
	public WebElement dropDownRelnship_Bene2;
	
	@FindBy (id = "flda_60")
	public WebElement txtOtherRelationship_Bene2;
	
	@FindBy (id = "flda_52")
	public WebElement txtFN_Bene2;
	
	@FindBy (id = "flda_54")
	public WebElement txtLN_Bene2;
	
	@FindBy (id = "flda_51")
	public WebElement txtEntityName_Bene2;
	
	@FindBy (id = "flda_50")
	public WebElement txtSSN_Bene2;
	
	@FindBy (id = "flda_56") 
	public WebElement txtSharePer_Bene2;
	
	@FindBy (id = "rdo_129_1")
	public WebElement radioMale_Bene2;
		
	@FindBy (id = "rdo_129_2")
	public WebElement radioFemale_Bene2;
	
	@FindBy (id = "lb_76")
	public WebElement dropDownRelnship_Bene3;
	
	@FindBy (id = "flda_75")
	public WebElement txtOtherRelationship_Bene3;
	
	@FindBy (id = "flda_68")
	public WebElement txtFN_Bene3;
	
	@FindBy (id = "flda_70")
	public WebElement txtLN_Bene3;
	
	@FindBy (id = "flda_67")
	public WebElement txtEntityName_Bene3;
	
	@FindBy (id = "flda_66")
	public WebElement txtSSN_Bene3;
	
	@FindBy (id = "flda_71")
	public WebElement txtSharePer_Bene3;
	
	@FindBy (id = "rdo_128_1")
	public WebElement radioMale_Bene3;
		
	@FindBy (id = "rdo_128_2")
	public WebElement radioFemale_Bene3;
	
	@FindBy (id = "lb_92")
	public WebElement dropDownRelnship_Bene4;
	
	@FindBy (id = "flda_91")
	public WebElement txtOtherRelationship_Bene4;
	
	@FindBy (id = "flda_84")
	public WebElement txtFN_Bene4;
	
	@FindBy (id = "flda_86")
	public WebElement txtLN_Bene4;
	
	@FindBy (id = "flda_83")
	public WebElement txtEntityName_Bene4;
	
	@FindBy (id = "flda_82")
	public WebElement txtSSN_Bene4;
	
	@FindBy (id = "flda_87")
	public WebElement txtSharePer_Bene4;
	
	@FindBy (id = "rdo_127_1")
	public WebElement radioMale_Bene4;
		
	@FindBy (id = "rdo_127_2")
	public WebElement radioFemale_Bene4;
	
	@FindBy (id = "lb_108")
	public WebElement dropDownRelnship_Bene5;
	
	@FindBy (id = "flda_107")
	public WebElement txtOtherRelationship_Bene5;
	
	@FindBy (id = "flda_100")
	public WebElement txtFN_Bene5;
	
	@FindBy (id = "flda_102")
	public WebElement txtLN_Bene5;
	
	@FindBy (id = "flda_99")
	public WebElement txtEntityName_Bene5;
	
	@FindBy (id = "flda_98")
	public WebElement txtSSN_Bene5;
	
	@FindBy (id = "flda_103")
	public WebElement txtSharePer_Bene5;
	
	@FindBy (id = "rdo_126_1")
	public WebElement radioMale_Bene5;
		
	@FindBy (id = "rdo_126_2")
	public WebElement radioFemale_Bene5;
	
	@FindBy (id = "lbl_2")
	public WebElement labelSharePercentage;
	
	@FindBy (id = "btn_36")
	public WebElement btnSave;
	
	@FindBy (id = "rdo_14_2")
	public WebElement rdoContingentBeneficiary_No;
	
	@FindBy (id = "btn_2")
	public WebElement btnNext;
	
	//Initializing the Page Objects:
	public BeneficiaryInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
