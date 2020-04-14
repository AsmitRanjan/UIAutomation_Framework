package com.qa.pageActions;

import com.qa.pages.HIVConsentPage;
import com.relevantcodes.extentreports.LogStatus;

public class HIVConsentAction extends HIVConsentPage{
	
	public HIVConsentAction() {
		super();
	}
	
	//Actions
	public ExistingInsuranceAction enterDataHIVConsent(String state) throws InterruptedException {
		String[] stateBucket = {"Arkansas", "Alaska", "Georgia", "Illinois", "Maine", "Maryland", "Minnesota", "Mississippi", 
				"North Carolina", "North Dakota", "South Carolina", "Tennessee", "Wisconsin", "Wyoming"};
		boolean flag = false;
		for(String s : stateBucket) {
			if((state.equalsIgnoreCase(s))) {
				flag = false;
				break;
			}else {
				flag = true;
			}
		}		
		if(flag) {
			extentTest.log(LogStatus.INFO, " - HIV Consent Page - ");
			switchToFrame(frameHIVConsent);	
			takeScreenshot("HIVConsentPage");
			ClickElement(btnNext, "Next button");
			switchToDefault();
			Thread.sleep(5000);	
		}
		return new ExistingInsuranceAction();
	}

}
