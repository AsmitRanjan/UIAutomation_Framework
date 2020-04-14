package com.qa.pageActions;

import com.qa.pages.TemporaryInsuranceAgreementPage;
import com.relevantcodes.extentreports.LogStatus;

public class TemporaryInsuranceAgreementAction extends TemporaryInsuranceAgreementPage{
	
	public TemporaryInsuranceAgreementAction() {
		super();
	}
	
	//Actions
	public ValidateAndLockDataAction enterDataTempInsAgreement() throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - Temporary Insurance Agreement Page - ");
		switchToFrame(frameTemporaryInsuranceAgreement);
		ComboSelectValue(dropDownPaymentMethod, "Check", "PaymentMethod");
		ClickElement(rdoQuestionNo_1, "Question_1_No");
		ClickElement(rdoQuestionNo_2, "Question_2_No");
		ClickElement(rdoQuestionNo_3, "Question_3_No");
		takeScreenshot("TemporaryInsuranceAgreementPage");
		ClickElement(btnNext, "Next button");
		switchToDefault();
		Thread.sleep(5000);
		return new ValidateAndLockDataAction();
	}
}
