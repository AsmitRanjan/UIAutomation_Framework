package com.qa.pageActions;

import com.qa.pages.ApplyESignatureSubmitPage;
import com.relevantcodes.extentreports.LogStatus;


public class ApplyESignatureSubmitAction extends ApplyESignatureSubmitPage{
	public ApplyESignatureSubmitAction() {
		
	}
	
	//Actions 
	public void enterApplyESignatureSubmit() throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - Apply eSignature Submit Page - ");
		switchToFrame(frameApplyESignatureSubmit);
		ClickElement(cbRepresentative, "Representative check box");
		EnterText(txtCity, "Carmel", "City");
		ComboSelectValue(dropdownState, "Indiana", "State");
		ClickElement(btnClkApplyeSign, "Click Apply eSign");
		Thread.sleep(5000);
		takeScreenshot("ApplyESignatureSubmitPage");
		ClickElement(btnClkHereSubmitApp, "Click here Submit Application Button");
		Thread.sleep(5000);
		scrollIntoView(txtThankYouMsg,driver);
		takeScreenshot("ThankyouMessage");
		assertText(txtThankYouMsg, "Thank you again for using our Electronic Application!", "Thank you message");
		switchToDefault();
		Thread.sleep(5000);
	}

}
