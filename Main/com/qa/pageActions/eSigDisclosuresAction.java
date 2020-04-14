package com.qa.pageActions;

import com.qa.pages.eSigDisclosuresPage;
import com.relevantcodes.extentreports.LogStatus;

public class eSigDisclosuresAction extends eSigDisclosuresPage{
	
	public eSigDisclosuresAction() {
		super();
	}
	
	//Actions
	public eSignatureConsentAction enterDataESigDisclosures(String willTheProposedInsuredBeOwner, String isMultipleOwner, String isSurvivorPurchaseOptionRider) throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - eSigDisclosures Page - ");
		switchToFrame(frameESigDisclosures);
		ClickElement(rdoProInsYes, "Proposed Insured Yes radio button");
		ComboSelectValue(dropdownIdentification, "Drivers License", "Proof of Identification");
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No")) {
			ClickElement(rdoProInsYes_Owner, "Proposed Insured Yes radio button for Owner");
			ComboSelectValue(dropdownIdentification_Owner, "Drivers License", "Proof of Identification for Owner");
		}
		
		if(isSurvivorPurchaseOptionRider.equalsIgnoreCase("Yes")) {
			ClickElement(rdoProInsYes_Survivor, "Proposed Insured Yes radio button for Owner");
			ComboSelectValue(dropdownIdentification_Survivor, "Drivers License", "Proof of Identification for Owner");
		}
		
		takeScreenshot("eSigDisclosuresPage");
		ClickElement(btnNext, "Next Button");
		Thread.sleep(5000);
		
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No") && isMultipleOwner.equalsIgnoreCase("Yes")) {
			ClickElement(rdoProInsYes_MO, "Proposed Insured Yes radio button for Owner");
			ComboSelectValue(dropdownIdentification_MO, "Drivers License", "Proof of Identification for Owner");
			takeScreenshot("eSigDisclosuresPageCo_Owner");
			ClickElement(btnNext2, "Next Button");
		}
		
		
		
		
		switchToDefault();
		Thread.sleep(5000);
		return new eSignatureConsentAction();
	}

}
