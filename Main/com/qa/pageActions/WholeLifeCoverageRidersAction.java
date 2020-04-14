package com.qa.pageActions;

import com.qa.pages.WholeLifeCoverageRidersPage;
import com.relevantcodes.extentreports.LogStatus;

public class WholeLifeCoverageRidersAction extends WholeLifeCoverageRidersPage{

	public WholeLifeCoverageRidersAction() {
		super();
	}
	
	//Actions
	public SurvivorPurchaseOptionPageAction enterDataWholeLifeCoverageRiders(String baseFaceAmount, String initialBasePremium, String cashWithApp, String premiumAmount, 
			String indexedDividendAllocation, String nonforfeiture, String isAcceleratorPaidRider, 
			String isBlendAcceleratorRider, String isSameInsuredTermRider, String isSurvivorPurchaseOptionRider) throws InterruptedException {
		
		extentTest.log(LogStatus.INFO, " - Whole Life Coverage Riders Page - ");
		switchToFrame(frameWholeLifeCoverageRiders);
		EnterText(txtBaseFaceAmount, baseFaceAmount, "Base Face Amount");
		EnterText(txtInitialBasePremium, initialBasePremium, "Initial Base Premium");
		if(SelectionIndAsYes(cashWithApp, "CashWithApp")) {
			ClickElement(rdoCashWithApp_Yes, "CashWithApp_Yes");
			EnterText(txtPremiumAmount, premiumAmount, "PremiumAmount");
		}else {
			ClickElement(rdoCashWithApp_No, "CashWithApp_No");
		}
		
		EnterText(txtIndexedDividendAllocation, indexedDividendAllocation, "Indexed Dividend Allocation");
		
		if(SelectionIndAsYes(isAcceleratorPaidRider, "AcceleratorPaidAdditionsRider")) {
			ClickElement(cbAcceleratorRider, "cbAcceleratorRider");
			EnterText(txtBilledPrem, "1000", "BilledPrem");
			EnterText(txt1035Premium, "1000", "1035Premium");
			EnterText(txtNon1035Premium, "1000", "txtNon1035Premium");
		}

		if(SelectionIndAsYes(isBlendAcceleratorRider, "BlendAcceleratorPaidUpAdditionRider")) {
			ClickElement(cbBlendRider, "cbBlendRider");
			EnterText(txtBilledPremBlendAccelerator, "1000", "BilledPremBlendAccelerator");
			EnterText(txt1035PremiumBlendAccelerator, "1000", "1035PremiumBlendAccelerator");
			EnterText(txtNon1035PremiumBlendAccelerator, "1000", "Non1035PremiumBlendAccelerator");
			
			
			EnterText(txtTargetFaceAmt, "30000", "txtTargetFaceAmt");
			EnterText(txtAnnualFaceAmt, "50000", "txtAnnualFaceAmt");
		}

		if(SelectionIndAsYes(isSameInsuredTermRider, "SameInsuredTermRider")) {
			ClickElement(cbSameInsuredTermRider, "cbBlendRider");
			EnterText(txtAmount_SITR, "123456", "AnnualFaceAmt");
			ComboSelectValue(dropdownGuaranteedPeriod_SITR, "10", "GuaranteedPeriod_SITR");
		}

		if(SelectionIndAsYes(isSurvivorPurchaseOptionRider, "SurvivorPurchaseOptionRider")) {
			ClickElement(cbSurvivorPurchaseOptionRider, "cbBlendRider");
			EnterText(txtFaceAmt_SPO, "200000", "FaceAmt_SPO");
			EnterText(txtFirst_SPO, "First", "First_SPO");
			EnterText(txtLast_SPO, "Last", "txtLast_SPO");
		}
		
		ComboSelectValue(drodownNonforfeiture, nonforfeiture, "Nonforfeiture Dropdown");
		takeScreenshot("WholeLifeCoverageRidersPage");
		ClickElement(btnNext, "Next button");
		switchToDefault();
		Thread.sleep(5000);
		return new SurvivorPurchaseOptionPageAction();
	}

}

