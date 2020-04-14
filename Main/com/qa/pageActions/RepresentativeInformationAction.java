package com.qa.pageActions;

import com.qa.pages.RepresentativeInformationPage;
import com.relevantcodes.extentreports.LogStatus;

public class RepresentativeInformationAction extends RepresentativeInformationPage{
	public RepresentativeInformationAction() {
		super();
	}
	
	//Actions 
	public ApplyESignatureSubmitAction enterDataRepresentativeInfo() throws InterruptedException {
		extentTest.log(LogStatus.INFO, " - Representative Information Page - ");
		switchToFrame(frameRepresentativeInformation);
		ComboSelectValue(dropdownRepresentativeCode, "11253", "Representative Code");
		EnterText(txtName, "TestName", "Name");
		EnterText(txtPhoneNumber, "3110012316", "Phone Number");
		ClickElement(rdoQuestion1_No, "Question1_No");
		ClickElement(rdoQuestion2_No, "Question2_No");
		ClickElement(rdoQuestion3_Yes, "Question3_Yes");
		ClickElement(rdoQuestion4_Yes, "Question4_Yes");
		ClickElement(cbPhotoID, "PhotoID");	
		ClickElement(rdoShdAppEvaluated_No, "ShdAppEvaluated_No");	
		takeScreenshot("RepresentativeInformationPage");
		ClickElement(btnNext, "NextButton");	
		switchToDefault();
		Thread.sleep(5000);
		return new ApplyESignatureSubmitAction();
	}
}
