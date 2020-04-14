package com.qa.pageActions;

import com.qa.pages.eSignaturePartiesPage;
import com.qa.util.Wait;
import com.relevantcodes.extentreports.LogStatus;

public class eSignaturePartiesAction extends eSignaturePartiesPage{
	
	public eSignaturePartiesAction() {
		super();		
	}
	
	Wait wait = new Wait();
	
	//Actions 
	public RepresentativeInformationAction enterDataeSignatureParties(String willTheProposedInsuredBeOwner, String isMultipleOwner, String isSurvivorPurchaseOptionRider) throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - eSignatureParties Page - ");
		switchToFrame(frameESignatureParties);
		EnterText(txtCity, "Alska", "City");
		ClickElement(cbInsuredAgreement, "InsuredAgreement Checkbox");	
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No")) {
			ClickElement(cbOwner, "Owner Checkbox");
			if(isMultipleOwner.equalsIgnoreCase("Yes")) {
				ClickElement(cbMO, "Owner Checkbox");
			}
		}
		if(isSurvivorPurchaseOptionRider.equalsIgnoreCase("Yes")) {
			ClickElement(cbSurvivor, "Owner Checkbox");
		}
		
		ClickElement(btnApply, "Apply Button");
		Thread.sleep(5000);
		wait.waitForPageLoad(driver);
		takeScreenshot("eSignatureParties");
		ClickElement(btnYesContinue, "YesContinue Button");
		switchToDefault();
		Thread.sleep(5000);
		return new RepresentativeInformationAction();
	}
}
