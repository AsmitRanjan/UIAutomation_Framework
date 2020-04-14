package com.qa.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.pages.CaseInformationPage;
import com.qa.util.Wait;
import com.relevantcodes.extentreports.LogStatus;

public class CaseInformationPageAction extends CaseInformationPage{
	
	public CaseInformationPageAction() {
		super();
	}
	
	Wait wait = new Wait();
	
	//Actions:
	public ProposedInsuredInfoAction selectProduct(String firstName, String lastName, String dob, String gender, String state, String productType, String product) throws InterruptedException {
		
		extentTest.log(LogStatus.INFO, " - Case Information Page - ");
		switchToFrame(frameCaseInformation);
		EnterText(txtFirstName, firstName, "FirstName");
		EnterText(txtLastName, lastName, "LastName");
		enterDOB(dob);
		selectState(state);
		selectProductType(productType);
		Thread.sleep(2000);
		wait.waitForElementToEnable(driver, btnFindAvailableProducts);
		ClickJSElement(btnFindAvailableProducts, "Find Available Products Button");
		clickOnSelect(product);	
		takeScreenshot("CaseInformationPage");
		Thread.sleep(15000);
		switchToDefault();
		return new ProposedInsuredInfoAction();
	}
	
	public void selectState(String state)
	{
         driver.findElement(By.xpath("//div[@id='UpdatePanel1']/div/button/span[@class='filter-option pull-left']")).click();
         WebElement ddlState = driver.findElement(By.xpath("//span[text()=" +  "'" + state + "'" + "]"));
         ClickJSElement(ddlState, "State: "+state);         
	}
	
	public void selectProductType(String productType) throws InterruptedException
	{	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='UpdatePanel2']/div/button/span[@class='filter-option pull-left']")).click();
		WebElement ddlProductType = driver.findElement(By.xpath("//span[text()=" +  "'" + productType + "'" + "]"));
        ClickJSElement(ddlProductType, "Product Type: "+productType);  
	}
	
	public void enterDOB(String dob)
	{	
		String[] dateOfBirth = dob.split("/");
		String strMonth = dateOfBirth[0];
		String strDay = dateOfBirth[1];
		String strYear = dateOfBirth[2];
		txtMonth.sendKeys(strMonth);
		txtYear.sendKeys(strYear);
		txtDay.sendKeys(strDay);
		
		extentTest.log(LogStatus.PASS, dob + " is entered in DOB");	
	}
	
	public void clickOnSelect(String product) {
		WebElement element = driver.findElement(By.xpath("//div[@id='divAvailableProductsGrid1']/div/table/tbody/tr[td[3][contains(text(),'"+product+"')]]/td[5]/input"));
		ClickJSElement(element, "Select button under iGO e-App for "+product);		
	}
	
}
