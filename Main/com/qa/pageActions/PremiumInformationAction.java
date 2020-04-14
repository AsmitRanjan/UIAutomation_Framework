package com.qa.pageActions;

import com.qa.pages.PremiumInformationPage;
import com.relevantcodes.extentreports.LogStatus;

public class PremiumInformationAction extends PremiumInformationPage{
	
	public PremiumInformationAction() {
		super();
	}
	
	public USAPatriotActAction enterDataPremiumInformation(String paymentMode, String otherMode) throws InterruptedException {
		
		extentTest.log(LogStatus.INFO, " - Premium Information Page - ");
		switchToFrame(framePremiumInformation);
		ComboSelectValue(dropdownPaymentMode, paymentMode, "Payment Mode");
		if(paymentMode.equalsIgnoreCase("Other")) {
			EnterText(txtOtherMode, otherMode, "Other Mode");
		}
		ClickElement(rdoIsPolicyBeingFunded_No, "IsPolicyBeingFunded_No");
		takeScreenshot("PremiumInformationPage");
		ClickElement(btnNext, "Next button");
		switchToDefault();
		Thread.sleep(5000);
		return new USAPatriotActAction();
	}
}
