package com.qa.pageActions;

import com.qa.pages.PerInfoSurvivorPurchaseOptPage;
import com.relevantcodes.extentreports.LogStatus;

public class PerInfoSurviPurchaseOptPageAction extends PerInfoSurvivorPurchaseOptPage{
	
	public PerInfoSurviPurchaseOptPageAction() {
		super();
	}
	
	//Actions
	public HealthQuestionsPageAction enterPerInfoSurvivorPurchaseOpt(String isSurvivorPurchaseOptionRider) {
		if(isSurvivorPurchaseOptionRider.equalsIgnoreCase("Yes")) {
			try {
				extentTest.log(LogStatus.INFO, " - Personal Information Survivor Purchase Option Page - ");
				switchToFrame(framePerInfoSurvivorPurchaseOption);
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
				ClickElement(rdoQuestionNo_14, "Question_14_No");
				takeScreenshot("PersonalInformationSurvivorPurchaseOptionPage");
				ClickElement(btnNext, "Next Button");
				switchToDefault();
				Thread.sleep(5000);
				return new HealthQuestionsPageAction();
			} catch (Exception e) {
				e.printStackTrace();
				return new HealthQuestionsPageAction();
			}
		}else {
			return new HealthQuestionsPageAction();
		}
	}
}
