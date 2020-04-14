package com.qa.pageActions;

import com.qa.pages.TermConversionPage;
import com.relevantcodes.extentreports.LogStatus;

public class TermConversionPageAction extends TermConversionPage{
	
	public TermConversionPageAction() {
		super();
	}
	
	//Actions:
	public WholeLifeCoverageRidersAction enterDataTermConversion(String isTermConversion) throws InterruptedException {
		
		if(SelectionIndAsYes(isTermConversion, "Is Term Conversion")) {
			extentTest.log(LogStatus.INFO, " - Term Conversion Page - ");
			switchToFrame(frameTermConversion);
			EnterText(txtPolicyNumber, "0625437890", "Policy Number");
			ClickElement(rdoConversionOf_TermPolicy, "ConversionOf_TermPolicy");
			ClickElement(rdoConversionType_Full, "ConversionType_Full");
			EnterText(txtTotalAmountConvert, "60000", "TotalAmountConvert");
			takeScreenshot("TermConversionPage");
			ClickElement(btnNext, "Next Button");
			Thread.sleep(5000);
			switchToDefault();		
		}
		return new WholeLifeCoverageRidersAction();
	}

}
