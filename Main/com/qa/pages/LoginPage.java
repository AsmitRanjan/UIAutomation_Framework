package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.GenericFunction;

public class LoginPage extends GenericFunction{

	//Page Factory - OR:
	@FindBy(id="username")
	public WebElement txtUserId;
	
	@FindBy(id="password")
	public WebElement txtPassWord;
	
	@FindBy(id="btnLogin")
	public WebElement btnLogin;
	
	@FindBy(id="newcase-button")
	public WebElement btnStartNewCase;
	
	
	//-------------------
	@FindBy(xpath="(/html/body/div/form/div[4]/div/input)[1]")
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
	
	//Initializing the Page Objects:
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
		

}
