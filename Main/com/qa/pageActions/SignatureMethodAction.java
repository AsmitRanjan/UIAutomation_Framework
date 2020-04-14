package com.qa.pageActions;

import com.qa.pages.SignatureMethodPage;
import com.relevantcodes.extentreports.LogStatus;

public class SignatureMethodAction extends SignatureMethodPage{
	
	public SignatureMethodAction() {
		super();
	}
	
	//Actions
	public eSigDisclosuresAction enterDataSignatureMethod() throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - Signature Method Page - ");
		switchToFrame(frameSignatureMethodScreen);
		ClickElement(cbCollectESignature, "Collect eSignature");
		takeScreenshot("SignatureMethodPage");
		ClickElement(btnNext, "Next button");		
		switchToDefault();
		Thread.sleep(5000);
		return new eSigDisclosuresAction();
	}
}
