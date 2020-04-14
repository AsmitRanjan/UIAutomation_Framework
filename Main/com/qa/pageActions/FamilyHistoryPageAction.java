package com.qa.pageActions;

import com.qa.pages.FamilyHistoryPage;
import com.relevantcodes.extentreports.LogStatus;

public class FamilyHistoryPageAction extends FamilyHistoryPage{
	public FamilyHistoryPageAction() {
		super();
	}
	
	//Actions
	public HIVConsentAction enterFamilyHistory(String isTermConversion) {
		if(isTermConversion.equalsIgnoreCase("Yes")) {
			try {
				extentTest.log(LogStatus.INFO, " - Family History Page - ");
				switchToFrame(frameFamilyHistory);	
				ClickElement(rdoDoSibling_No, "Do you have Siblings_no");
				EnterText(txtAgeMother, "65", "Age Mother");
				EnterText(txtAgeFather, "68", "Age father");
				ClickElement(rdoCancerMother, "CancerMother");
				ClickElement(rdoCancerFather, "CancerFather");
				ClickElement(rdoHeartMother, "HeartMother");
				ClickElement(rdoHeartFather, "HeartFather");
				ClickElement(rdoDiabetesMother, "DiabetesMother");
				ClickElement(rdoDiabetesFather, "DiabetesFather");
				takeScreenshot("FamilyHistoryPage");
				ClickElement(btnNext, "Next button");
				switchToDefault();
				Thread.sleep(5000);
				return new HIVConsentAction();
			}
			catch(Exception e) {
				e.printStackTrace();
				return new HIVConsentAction();
			}
		}
		else {
			return new HIVConsentAction();
		}
	}	
}
