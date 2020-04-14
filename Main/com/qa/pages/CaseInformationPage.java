package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class CaseInformationPage extends GenericFunction{
	
	//Page Factory - OR:
	@FindBy(id="CossScreenFrame")
	public WebElement frameCaseInformation;
	
	@FindBy(xpath="//input[@id='txtFirstName']")
	public WebElement txtFirstName;
	
	@FindBy(id="txtLastName")
	public WebElement txtLastName;
	
	@FindBy(xpath="//button[@data-id='ddlGender']")
	public WebElement dropDownGender;
	
	@FindBy(xpath="//button[@data-id='ddlState']")
	public WebElement dropDownApplicantResidentState;
	
	@FindBy(xpath="//button[@data-id='ddlProductType']")
	public WebElement dropDownProductType;
	
	@FindBy(id="btnFindAvailableProducts")
	public WebElement btnFindAvailableProducts;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-month hint']")
	public WebElement txtMonth;
	
	@FindBy (xpath = "//input[@class='jq-dte-day hint']")
	public WebElement txtDay;
	
	@FindBy (xpath = "//span/input[@class='jq-dte-year hint']")
	public WebElement txtYear;
		
	//Initializing the Page Objects:
	public CaseInformationPage() {
		super();
		PageFactory.initElements(driver, this);
	}

}
