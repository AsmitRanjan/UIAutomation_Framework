package com.qa.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pageActions.ApplyESignatureSubmitAction;
import com.qa.pageActions.BeneficiaryInfoPageAction;
import com.qa.pageActions.CaseInformationPageAction;
import com.qa.pageActions.ExistingInsuranceAction;
import com.qa.pageActions.FamilyHistoryPageAction;
import com.qa.pageActions.HIVConsentAction;
import com.qa.pageActions.HealthQuestionsContPageAction;
import com.qa.pageActions.HealthQuestionsPageAction;
import com.qa.pageActions.LoginPageAction;
import com.qa.pageActions.MultipleOwnersPageAction;
import com.qa.pageActions.OwnerInfoContPageAction;
import com.qa.pageActions.OwnerInformationPageAction;
import com.qa.pageActions.PerInfoSurviPurchaseOptPageAction;
import com.qa.pageActions.PersonalInformationAction;
import com.qa.pageActions.PremiumInformationAction;
import com.qa.pageActions.PremiumPayorInfoPageAction;
import com.qa.pageActions.ProposedInsuredInfoAction;
import com.qa.pageActions.RepresentativeInformationAction;
import com.qa.pageActions.SignatureMethodAction;
import com.qa.pageActions.SurvivorPurchaseOptionPageAction;
import com.qa.pageActions.TemporaryInsuranceAgreementAction;
import com.qa.pageActions.TermConversionPageAction;
import com.qa.pageActions.USAPatriotActAction;
import com.qa.pageActions.ValidateAndLockDataAction;
import com.qa.pageActions.WholeLifeCoverageRidersAction;

import com.qa.pageActions.eSigDisclosuresAction;
import com.qa.pageActions.eSignatureConsentAction;
import com.qa.pageActions.eSignaturePartiesAction;
import com.qa.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class WholeLifeTest extends TestBase{
	LoginPageAction loginPageAction;
	CaseInformationPageAction caseInformationPageAction;
	ProposedInsuredInfoAction proposedInsuredInfoAction;
	OwnerInformationPageAction ownerInformationPageAction;
	OwnerInfoContPageAction ownerInfoContPageAction;
	MultipleOwnersPageAction multipleOwnersPageAction;
	PremiumPayorInfoPageAction premiumPayorInfoPageAction;
	BeneficiaryInfoPageAction beneficiaryInfoPageAction;
	TermConversionPageAction termConversionPageAction;
	WholeLifeCoverageRidersAction wholeLifeCoverageRidersAction;
	SurvivorPurchaseOptionPageAction survivorPurchaseOptionPageAction;
	PersonalInformationAction personalInformationAction;
	PerInfoSurviPurchaseOptPageAction perInfoSurviPurchaseOptPageAction;
	HealthQuestionsPageAction healthQuestionsPageAction;
	HealthQuestionsContPageAction healthQueContPageAction;
	FamilyHistoryPageAction familyHistoryPageAction;
	HIVConsentAction HIVconsentAction;
	ExistingInsuranceAction existingInsuranceAction;
	PremiumInformationAction premiumInformationAction;
	USAPatriotActAction usaPatriotActAction;
	TemporaryInsuranceAgreementAction temporaryInsuranceAgreementAction;
	ValidateAndLockDataAction validateAndLockDataAction;
	SignatureMethodAction signatureMethodAction;
	eSigDisclosuresAction eSigdiclosuresAction;
	eSignatureConsentAction eSignatureconsentAction;
	eSignaturePartiesAction eSignaturepartiesAction;
	RepresentativeInformationAction representativeInformationAction;
	ApplyESignatureSubmitAction applyESignatureSubmitAction;
	
	
	public WholeLifeTest() {
		super();	
	}
	
	@DataProvider
	public Object[][] getCOTestData(){
		Object data[][] = TestUtil.getTestData("Sheet1");
		return data;
	}
	
	@Test(priority=1, dataProvider="getCOTestData")
	public void WholeLifeApplicationTest(String scenarioName, String indExecute, String userId, String pwd, String firstName, 
			String lastName,String dob, String gender, String state, String productType,
			String product, String isTermConversion, String doFaceAmtIncrease, String SSN, String birthCountry, 	
			String birthState, String MaritalQuestion, String Street, String City, String ZipCode, 
			String County, String yearsAtAddress, String PhoneNumber, String willTheProposedInsuredBeOwner, String whoWillBePayor, 
			
			String DoesInsuredHaveDL, String DLNo, String IssueState, String ExpirationDate, String earned,
			String unEarned, String netWorth, String isProposedInsuredUSCitizen, String countryofCitizenship, String doesProposedInsuredHoldGreenCard,	
			String greenCardNumber, String GCExpirationDate, String doesProposedInsuredHoldUSVisa, String typeOfVisa, String visaExpirationDate, 	
			String visaNumber, String provideDetails, String typeOwner, String relnProposedIns, String ownerFirstName, 
			String ownerLastName, String ownerSSN, String strDOB, String ownerBirthState, String ownerGender,
			
			
			
			String ownerMaritalStatus, String ownerDL_State, String strDLExpDate, String isMultipleOwner, String numOfPB, 
			String strShareIndicator, String strDeceasedSharePaid, String strRelationshipBene1, String strFirstNameBene1, String strLastNameBene1,
			String strGenderBene1, String strSSNBene1, String strSharePerBene1, String strEntityNameBene1, String strCorporateOfficer_Bene1, 
			String strTitle_Bene1, String strStateIncorporation_Bene1, String strOtherRelation_Bene1, String strRelationshipBene2, String strFirstNameBene2, 
			String strLastNameBene2, String strGenderBene2, String strSSNBene2, String strSharePerBene2, String strEntityNameBene2, 
			
			
			String strOtherRelation_Bene2, String strRelationshipBene3, String strFirstNameBene3, String strLastNameBene3, String strGenderBene3,
			String strSSNBene3, String strSharePerBene3, String strEntityNameBene3, String strOtherRelation_Bene3, String strRelationshipBene4, 
			String strFirstNameBene4, String strLastNameBene4, String strGenderBene4, String strSSNBene4, String strSharePerBene4, 
			String strEntityNameBene4, String strOtherRelation_Bene4, String strRelationshipBene5, String strFirstNameBene5, String strLastNameBene5,
			String strGenderBene5, String strSSNBene5, String strSharePerBene5, String strEntityNameBene5, String strOtherRelation_Bene5, 
			
			String baseFaceAmount, String initialBasePremium, String cashWithApp, String premiumAmount,String indexedDividendAllocation,
			String nonforfeiture, String paymentMode, String otherMode, String isAcceleratorPaidRider, String isBlendAcceleratorRider, 
			String isSameInsuredTermRider, String isSurvivorPurchaseOptionRider) throws IOException, InterruptedException, AWTException {
		
		
		
		
		extentTest = extent.startTest("coverageOptionsTest - " + scenarioName);
		if (indExecute.equalsIgnoreCase("No")) {
	        throw new SkipException(scenarioName + " is Skipped");
	    }
		intialization();
		extentTest.log(LogStatus.INFO, "Browser used: " + prop.getProperty("browser"));
		extentTest.log(LogStatus.INFO, "URL: " + prop.getProperty("url"));
		loginPageAction = new LoginPageAction();	 
		caseInformationPageAction = loginPageAction.logIn(userId, pwd);
		proposedInsuredInfoAction = caseInformationPageAction.selectProduct(firstName, lastName, dob, gender, state, productType, product);
		
		
		ownerInformationPageAction = proposedInsuredInfoAction.enterData(isTermConversion, doFaceAmtIncrease, SSN, gender, birthCountry, birthState, MaritalQuestion, 
				Street, City, ZipCode, County, 
				yearsAtAddress, PhoneNumber, willTheProposedInsuredBeOwner, whoWillBePayor, DoesInsuredHaveDL, DLNo, IssueState, 
				ExpirationDate, earned, unEarned, netWorth, isProposedInsuredUSCitizen, countryofCitizenship, doesProposedInsuredHoldGreenCard,
				greenCardNumber, GCExpirationDate, doesProposedInsuredHoldUSVisa, typeOfVisa, visaExpirationDate, visaNumber, provideDetails);
		//************************
		
		ownerInfoContPageAction = ownerInformationPageAction.enterOwnerInformationData(willTheProposedInsuredBeOwner, typeOwner, relnProposedIns,
				ownerFirstName, ownerLastName, ownerSSN, strDOB, ownerBirthState, ownerGender, ownerMaritalStatus, ownerDL_State, strDLExpDate, isMultipleOwner);
		
		multipleOwnersPageAction = ownerInfoContPageAction.enterOwnerinfoCont(willTheProposedInsuredBeOwner, typeOwner);
		
		premiumPayorInfoPageAction = multipleOwnersPageAction.enterMultipleOwners(willTheProposedInsuredBeOwner, isMultipleOwner);
		
		beneficiaryInfoPageAction = premiumPayorInfoPageAction.enterPremiumPayorInfo(whoWillBePayor);
		
		termConversionPageAction = beneficiaryInfoPageAction.detailsOfPrimaryBenef(numOfPB, strShareIndicator, strDeceasedSharePaid, strRelationshipBene1, 
				strFirstNameBene1, strLastNameBene1, strGenderBene1, strSSNBene1, strSharePerBene1, strEntityNameBene1, strCorporateOfficer_Bene1, 
				strTitle_Bene1, strStateIncorporation_Bene1, strOtherRelation_Bene1, strRelationshipBene2, strFirstNameBene2, strLastNameBene2, strGenderBene2, 
				strSSNBene2, strSharePerBene2, strEntityNameBene2, strOtherRelation_Bene2, strRelationshipBene3, strFirstNameBene3, strLastNameBene3, strGenderBene3, 
				strSSNBene3, strSharePerBene3, strEntityNameBene3, strOtherRelation_Bene3, strRelationshipBene4, strFirstNameBene4, strLastNameBene4, strGenderBene4, 
				strSSNBene4, strSharePerBene4, strEntityNameBene4, strOtherRelation_Bene4, strRelationshipBene5, strFirstNameBene5, strLastNameBene5, strGenderBene5, 
				strSSNBene5, strSharePerBene5, strEntityNameBene5, strOtherRelation_Bene5);
			
		wholeLifeCoverageRidersAction = termConversionPageAction.enterDataTermConversion(isTermConversion);	
		
		survivorPurchaseOptionPageAction = wholeLifeCoverageRidersAction.enterDataWholeLifeCoverageRiders(baseFaceAmount, initialBasePremium, cashWithApp, premiumAmount, 
				indexedDividendAllocation, nonforfeiture, isAcceleratorPaidRider, isBlendAcceleratorRider,
				isSameInsuredTermRider, isSurvivorPurchaseOptionRider);
		
		personalInformationAction = survivorPurchaseOptionPageAction.enterSurvivorPurchaseOption(isSurvivorPurchaseOptionRider);
		
		perInfoSurviPurchaseOptPageAction = personalInformationAction.enterDataPersonalInformation();
		
		healthQuestionsPageAction = perInfoSurviPurchaseOptPageAction.enterPerInfoSurvivorPurchaseOpt(isSurvivorPurchaseOptionRider);
		
		healthQueContPageAction = healthQuestionsPageAction.enterHealthQuestions(isTermConversion);
		familyHistoryPageAction = healthQueContPageAction.enterHealthQueCont(isTermConversion);
		HIVconsentAction = familyHistoryPageAction.enterFamilyHistory(isTermConversion);
		
		existingInsuranceAction = HIVconsentAction.enterDataHIVConsent(state);
		premiumInformationAction = existingInsuranceAction.enterDataExistingInsurance();
		usaPatriotActAction = premiumInformationAction.enterDataPremiumInformation(paymentMode, otherMode);
		temporaryInsuranceAgreementAction = usaPatriotActAction.enterDataUSAPatriotAct(willTheProposedInsuredBeOwner, isMultipleOwner);
		validateAndLockDataAction = temporaryInsuranceAgreementAction.enterDataTempInsAgreement();
		signatureMethodAction = validateAndLockDataAction.enterDataValAndLockData();
		eSigdiclosuresAction = signatureMethodAction.enterDataSignatureMethod();
		eSignatureconsentAction = eSigdiclosuresAction.enterDataESigDisclosures(willTheProposedInsuredBeOwner, isMultipleOwner, isSurvivorPurchaseOptionRider);
		eSignaturepartiesAction = eSignatureconsentAction.enterDataESignatureConsent(willTheProposedInsuredBeOwner, isMultipleOwner, isSurvivorPurchaseOptionRider);
		representativeInformationAction = eSignaturepartiesAction.enterDataeSignatureParties(willTheProposedInsuredBeOwner, isMultipleOwner, isSurvivorPurchaseOptionRider);
		applyESignatureSubmitAction = representativeInformationAction.enterDataRepresentativeInfo();
		applyESignatureSubmitAction.enterApplyESignatureSubmit();
	}
	
}
