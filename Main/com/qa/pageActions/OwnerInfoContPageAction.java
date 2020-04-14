package com.qa.pageActions;

import com.qa.pages.OwnerInformationContPage;
import com.relevantcodes.extentreports.LogStatus;

public class OwnerInfoContPageAction extends OwnerInformationContPage{
	
	public OwnerInfoContPageAction() {
		super();
	}
	
	public MultipleOwnersPageAction enterOwnerinfoCont(String willTheProposedInsuredBeOwner, String typeOfOwner) {
		
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No")) {
			try {
											
				boolean flag = typeOfOwner.equalsIgnoreCase("Business") || typeOfOwner.equalsIgnoreCase("Qualified Plan") || typeOfOwner.equalsIgnoreCase("412");
				if(flag) {
					
					extentTest.log(LogStatus.INFO, " - Owner Information Cont. Page - ");
					switchToFrame(frameOwnerInformationCont);
					EnterText(txtFirstName, "First name", "First Name");
					EnterText(txtLastName, "Last Name", "Last Name");
					EnterText(txtPosition, "Test", "Position or Title");
					ComboSelectValue(dropdownState, "GA", "State");
					takeScreenshot("OwnerInformationdContPage");
					ClickElement(btnNext, "Next Button");
					switchToDefault();
					Thread.sleep(5000);
					
				}
				else if (typeOfOwner.equalsIgnoreCase("Established Trust")) {
					extentTest.log(LogStatus.INFO, " - Owner Information Cont. Page - ");
					switchToFrame(frameOwnerInformationCont);
					EnterText(txtFirstNameTrustee, "First name", "First Name");
					EnterText(txtSSN, "756339751", "SSN");
					EnterText(txtLastNameTrustee, "Last Name", "Last Name");
					ComboSelectValue(dropdownTrustInfo, "Family", "Trust Information");		
					takeScreenshot("OwnerInformationdContPage");
					ClickElement(btnNext, "Next Button");
					switchToDefault();
					Thread.sleep(5000);
					
				}
				return new MultipleOwnersPageAction();
				
			}	
			catch (Exception e) {
				e.printStackTrace();
				return new MultipleOwnersPageAction();
			}
		}else {
			return new MultipleOwnersPageAction();
		}
	}	
}
