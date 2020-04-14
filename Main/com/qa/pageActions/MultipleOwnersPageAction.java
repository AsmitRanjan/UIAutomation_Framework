package com.qa.pageActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.qa.pages.MultipleOwnersPage;
import com.relevantcodes.extentreports.LogStatus;

public class MultipleOwnersPageAction extends MultipleOwnersPage {
	public MultipleOwnersPageAction() {
		super();
	}
	
	//Actions
	public PremiumPayorInfoPageAction enterMultipleOwners(String willTheProposedInsuredBeOwner, String isMultipleOwner) {
		if(willTheProposedInsuredBeOwner.equalsIgnoreCase("No") && isMultipleOwner.equalsIgnoreCase("Yes")) {
			try {
				extentTest.log(LogStatus.INFO, " - Multiple Owners Page - ");
				switchToFrame(frameMultipleOwners);
				ClickElement(btnClickHere, "Proposed Insured");
				switchToDefault();
				Thread.sleep(5000);
				switchToFrame(frameMultipleOwnersInformation);
				
				EnterText(txtFirst, "First", "First");
				EnterText(txtLast, "Last", "Last");
				EnterText(txtStreet, "Street", "Street");
				EnterText(txtCity, "City", "City");
				ComboSelectValue(dropdownState, "Alaska", "State");
				EnterText(txtZipcode, "000124520", "ZIPCode");			
				enterDOB("01/11/1960", txtMonth, txtDay, txtYear);
				EnterText(txtSSN, "698541236", "SSN");
				
				Robot r = new Robot();
				for(int i=1; i<=2; i++) {
					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
				switchToDefault();
				switchToFrame(frameMultipleOwners);		
				Thread.sleep(5000);
				
				ClickElement(rdoAnyOwner, "AnyOwner");
				
				takeScreenshot("HMultipleOwnersPage");
				ClickElement(btnNext, "Next button");
				switchToDefault();
				Thread.sleep(5000);
				return new PremiumPayorInfoPageAction();
			}
			catch(Exception e) {
				e.printStackTrace();
				return new PremiumPayorInfoPageAction();
			}
		}
		else {
			return new PremiumPayorInfoPageAction();
		}
				
				
	}
}
