package com.qa.pageActions;

import com.qa.pages.PersonalInformationPage;
import com.relevantcodes.extentreports.LogStatus;

public class PersonalInformationAction extends PersonalInformationPage {
	
	public PersonalInformationAction() {
		super();
	}
	
	//Actions
	public PerInfoSurviPurchaseOptPageAction enterDataPersonalInformation() throws InterruptedException {
		
		extentTest.log(LogStatus.INFO, " - Personal Information Page - ");
		switchToFrame(framePersonalInformation);
		ClickElement(rdoQuestionNo_1, "Question_1_No");
		ClickElement(rdoQuestionNo_2, "Question_2_No");
		ClickElement(rdoQuestionNo_3, "Question_3_No");
		ClickElement(rdoQuestionNo_4, "Question_4_No");
		ClickElement(rdoQuestionNo_5, "Question_5_No");
		ClickElement(rdoQuestionNo_6, "Question_6_No");
		ClickElement(rdoQuestionNo_7, "Question_7_No");
		ClickElement(rdoQuestionNo_8, "Question_8_No");
		ClickElement(rdoQuestionNo_9, "Question_9_No");
		ClickElement(rdoQuestionNo_10, "Question_10_No");
		ClickElement(rdoQuestionNo_11, "Question_11_No");
		ClickElement(rdoQuestionNo_12, "Question_12_No");
		ClickElement(rdoQuestionNo_13, "Question_13_No");
		scrollIntoView(rdoCompletingHealthInformationNo, driver);
		if(isEnabledElement(rdoCompletingHealthInformationNo)) {
			ClickElement(rdoCompletingHealthInformationNo, "Completing Health Information_No");
		}
		takeScreenshot("PersonalInformationPage");
		ClickElement(btnNext, "Next button");
		switchToDefault();
		Thread.sleep(5000);
		return new PerInfoSurviPurchaseOptPageAction();
	}
}
