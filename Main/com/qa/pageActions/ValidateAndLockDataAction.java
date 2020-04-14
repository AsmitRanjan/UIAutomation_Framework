package com.qa.pageActions;

import com.qa.pages.ValidateAndLockDataPage;
import com.qa.util.Wait;
import com.relevantcodes.extentreports.LogStatus;

public class ValidateAndLockDataAction extends ValidateAndLockDataPage{
	
	public ValidateAndLockDataAction() {
		super();
	}
	Wait wait = new Wait();
	
	//Actions:
	public SignatureMethodAction enterDataValAndLockData() throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - Validate And Lock Data Page - ");
		switchToFrame(frameValidateAndLockData);	
		ClickElement(btnLockData, "Lock Data Button");
		Thread.sleep(5000);	
		wait.waitForPageLoad(driver);
		ClickElement(btnNext, "Next button");
		Thread.sleep(5000);	
		wait.waitForPageLoad(driver);
		takeScreenshot("ValidateAndLockDataPage");
		ClickElement(btnWetSignedNext, "Next button");
		switchToDefault();
		Thread.sleep(5000);
		return new SignatureMethodAction();
	}
}
