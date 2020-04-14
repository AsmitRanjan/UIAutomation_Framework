package com.qa.pageActions;

import com.qa.pages.ExistingInsurancePage;
import com.relevantcodes.extentreports.LogStatus;

public class ExistingInsuranceAction extends ExistingInsurancePage{
	
	public ExistingInsuranceAction() {
		super();
	}
	
	public PremiumInformationAction enterDataExistingInsurance() throws InterruptedException{
		
		extentTest.log(LogStatus.INFO, " - Existing Insurance Page - ");
		switchToFrame(frameExistingInsurance);
		ClickElement(rdoQuestionNo_1, "Question_1_No");
		ClickElement(rdoQuestionNo_3, "Question_3_No");
		ClickElement(rdoQuestionNo_4, "Question_4_No");
		takeScreenshot("ExistingInsurancePage");
		ClickElement(btnNext, "Next button");
		switchToDefault();
		Thread.sleep(5000);
		return new PremiumInformationAction();
	}
}
