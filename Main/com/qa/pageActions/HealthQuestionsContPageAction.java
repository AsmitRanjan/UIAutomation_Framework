package com.qa.pageActions;

import com.qa.pages.HealthQuestionsContPage;
import com.relevantcodes.extentreports.LogStatus;

public class HealthQuestionsContPageAction extends HealthQuestionsContPage{
	public HealthQuestionsContPageAction() {
		super();
	}
	
	//Actions
	public FamilyHistoryPageAction enterHealthQueCont(String isTermConversion) {
		if(isTermConversion.equalsIgnoreCase("Yes")) {
			try {
				extentTest.log(LogStatus.INFO, " - Health Questions Page Cont - ");
				switchToFrame(frameHealthQuestionsCont);	
				ClickElement(rdoQuestionNo_1, "Question_1_No");
				ClickElement(rdoQuestionNo_2, "Question_2_No");
				ClickElement(rdoQuestionNo_3, "Question_3_No");
				ClickElement(rdoQuestionNo_4, "Question_4_No");
				ClickElement(rdoQuestionNo_5, "Question_5_No");
				ClickElement(rdoQuestionNo_6, "Question_6_No");
				ClickElement(rdoQuestionNo_7, "Question_7_No");	
				ClickElement(rdoQuestionNo_8, "Question_8_No");
				takeScreenshot("HealthQuestionsPageCont");
				ClickElement(btnNext, "Next button");
				switchToDefault();
				Thread.sleep(5000);
				return new FamilyHistoryPageAction();
			}
			catch(Exception e) {
				e.printStackTrace();
				return new FamilyHistoryPageAction();
			}
		}
		else {
			return new FamilyHistoryPageAction();
		}
	}

}
