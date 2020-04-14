package com.qa.pageActions;

import com.qa.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageAction extends LoginPage{
	
	public LoginPageAction() {
		super();
	}
	
	//Actions:
	public CaseInformationPageAction logIn(String un, String pwd){
		extentTest.log(LogStatus.INFO, " - Login Page - ");
		EnterText(txtUserId, un, "UserId");
		EnterText(txtPassWord, pwd, "Password");
		takeScreenshot("LogInPage");
		ClickElement(btnLogin, "Login Button");
		ClickElement(btnStartNewCase, "Start New Case Button");
		return new CaseInformationPageAction();
	}
	
	
		
}
