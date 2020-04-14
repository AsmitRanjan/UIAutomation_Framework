package com.qa.pageActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.qa.pages.HealthQuestionsPage;
import com.relevantcodes.extentreports.LogStatus;

public class HealthQuestionsPageAction extends HealthQuestionsPage{
	public HealthQuestionsPageAction() {
		super();
	}
	
	//Actions
	public HealthQuestionsContPageAction enterHealthQuestions(String isTermConversion) {
		if(isTermConversion.equalsIgnoreCase("Yes")) {
			try {
				extentTest.log(LogStatus.INFO, " - Health Questions Page - ");
				switchToFrame(frameHealthQuestions);
				ClickElement(btnProposedInsured, "Proposed Insured");
				switchToDefault();
				Thread.sleep(5000);
				switchToFrame(frameHealthQuestionsDetails);
				ComboSelectValue(dropdownHeight_ft, "5", "Height ft");
				ComboSelectValue(dropdownHeight_In, "6", "Height_In");
				EnterText(txtWeight, "121", "Weight");
				ClickElement(rdoLostGainedWait_No, "LostGainedWait_No");
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);				
				switchToDefault();
				switchToFrame(frameHealthQuestions);		
				Thread.sleep(5000);
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
				takeScreenshot("HealthQuestionsPage");
				ClickElement(btnNext, "Next button");
				switchToDefault();
				Thread.sleep(5000);
				return new HealthQuestionsContPageAction();
			}
			catch(Exception e) {
				e.printStackTrace();
				return new HealthQuestionsContPageAction();
			}
		}
		else {
			return new HealthQuestionsContPageAction();
		}
	}
}
