package com.qa.pageActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import com.qa.pages.eSignatureConsentPage;
import com.relevantcodes.extentreports.LogStatus;

public class eSignatureConsentAction extends eSignatureConsentPage{
	
	public eSignatureConsentAction() {
		super();
	}
	
	//Actions
	public eSignaturePartiesAction enterDataESignatureConsent(String willTheProposedInsuredBeOwner, String isMultipleOwner, String isSurvivorPurchaseOptionRider) throws InterruptedException, AWTException {
		extentTest.log(LogStatus.INFO, " - eSignatureConsent Page - ");
		switchToFrame(frameeSignatureConsent);
		scrollIntoView(btnReviewApplication, driver);
		ClickElement(btnReviewApplication, "Review Application button");
		Thread.sleep(20000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		ClickElement(cbApplicants, "Applicants CheckBox");
		ClickElement(cbAgent, "Agent CheckBox");
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No")) {
			ClickElement(cbOwner, "Owner Checkbox");
			if(isMultipleOwner.equalsIgnoreCase("Yes")) {
				ClickElement(cbMO, "Owner Checkbox");
			}
		}
		
		if(isSurvivorPurchaseOptionRider.equalsIgnoreCase("Yes")) {
			ClickElement(cbSurvivor, "Survivor Checkbox");
		}
		takeScreenshot("eSignatureConsentPage");
		ClickElement(btnNext, "NextButton");
		switchToDefault();
		Thread.sleep(5000);
		return new eSignaturePartiesAction();
	}
}
