package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Wait;
import com.relevantcodes.extentreports.LogStatus;
import com.qa.base.TestBase;

public class GenericFunction extends TestBase{
	
	Wait wait = new Wait();

	public GenericFunction() {
		super();
	}
	
	// ------------------------------------------------------------------------------------
     // ---------------------- OneAmerica Reusable Library Starts Here --------------------- 	 
	// ------------------------------------------------------------------------------------
	//----------------------Author - Asmit Ranjan Behara ------------------------------------
	
	
	public void EnterText(WebElement element, String strValue, String strdesc)
	 {
	 	try
	 	{
	 		
	 		if(!strValue.isEmpty())
	 		{
	 			strValue = strValue.trim();
	 			element.clear();			
	 			element.sendKeys(strValue);
	 			extentTest.log(LogStatus.PASS, strValue + " is entered to " + strdesc);
	 		}
	 		else
	 		{
	 			extentTest.log(LogStatus.FAIL, strdesc + " is not empty");
	 		}	
	 	}	
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
//	 		extentTest.log(LogStatus.FAIL, strValue + " is not entered to " + strdesc);
	 	}
	 }
	 public void EnterValue(WebElement element, String intValue, String strdesc)
	 {
	 	try
	 	{
	 		
	 		if(!intValue.isEmpty())
	 		{
	 			intValue = intValue.trim();
	 			element.clear();			
	 			element.sendKeys(intValue);	
	 			extentTest.log(LogStatus.PASS, intValue + " is entered to " + strdesc);
	 		}	
	 		else
	 		{
	 			extentTest.log(LogStatus.FAIL, strdesc + " is not empty");
	 		}
	 	}	
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 		extentTest.log(LogStatus.FAIL, intValue + " is not entered to " + strdesc);
	 	}
	 }

	 public void getSelectedComboValue(WebElement element,String strValue)
	 {
	       Select select = new Select(element);
	       WebElement selectedvalue = select.getFirstSelectedOption();
	       
	     	  if(selectedvalue.getText().contains(strValue))
	     	  {
	     		 extentTest.log(LogStatus.INFO, "DropDown: "+ strValue + "  is selected ");
	     		 		  
	           }
	     	  else
	     	  {
	     		 extentTest.log(LogStatus.INFO, "DropDown: "+ strValue + "  is not selected ");
	           }
	       
	 }

	 
	 public void ClickElement(WebElement element, String strButtonName)
	 {
	 	try 
	 	{	
		 	wait.waitForElementToEnable(driver,element);
		 	element.click();
		 	extentTest.log(LogStatus.PASS, strButtonName + " is clicked");
	 	}
	 	catch(NoSuchElementException e)
		{	
	 		e.printStackTrace();
	 		extentTest.log(LogStatus.FAIL, strButtonName + " is not clicked");
		}
	 	catch(Exception e)
	 	{		
	 		e.printStackTrace();
	 		extentTest.log(LogStatus.FAIL, strButtonName + " is not clicked");
	 	}
	 }
	
	 public void ClickJSElement(WebElement element, String strButtonName)
	 {
	 	try
	 	{
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		js.executeScript("arguments[0].click();",element); 	
	 		extentTest.log(LogStatus.PASS, strButtonName + " is clicked");
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 		extentTest.log(LogStatus.FAIL, strButtonName + " is not clicked");
	 	}
	 	
	 }
	 public void ComboSelectValue(WebElement element,String strValue,String strdesc) {
		 	try 
		 	{		
		 		Select select = new Select(element);
		 		if (!strValue.isEmpty()) 
		 		{
		 			select.selectByVisibleText(strValue);	
		 			extentTest.log(LogStatus.PASS, strValue + " is selected in dropdown: " + strdesc);
		 		}
		 		else
		 		{
		 			extentTest.log(LogStatus.FAIL, strdesc + " dropdown is not empty");
		 		}
		 	} 
		 	catch (NoSuchElementException e) 
		 	{
		 		e.printStackTrace();
		 		extentTest.log(LogStatus.FAIL, strValue + " is not selected in dropdown: " + strdesc);
		 	}
		 	catch(Exception e1)
		 	{
		 		e1.printStackTrace();	
		 		extentTest.log(LogStatus.FAIL, strValue + " is not selected in dropdown: " + strdesc);
		 	}

		 }
	 
	public void takeScreenshot(String testMethodName) {
		File Srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String dateName = new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss").format(new Date());
			FileUtils.copyFile(Srcfile,
					new File(".//Screenshots//PassedTestCases//"
							+ testMethodName + "_" + dateName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean SelectionIndAsYes(String string1, String desc)
	 {
	 	if(string1.equalsIgnoreCase("Yes"))
	 	 { 
	 		 return true;
	 	 }
	 	 else			 
	 	 {
	 		 return false;
	 	 }
	 }
	
	public void DrawBorder(WebElement element, WebDriver driver)
	 {
	 	try
	 	{
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		js.executeScript("arguments[0].style.border='3px solid red'",element); 	
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 	}
	 }
	
	public void generateAlert(WebDriver driver, String message)
	 {
	 	try
	 	{
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		js.executeScript("alert('"+message+"')"); 	
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 	}
	 }
	
	public void refreshBrowserByJS(WebDriver driver)
	 {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		js.executeScript("history.go(0)"); 	
	 }
	
	public String getTitleByJS(WebDriver driver)
	 {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		String title = js.executeScript("return document.title;").toString();
	 		return title;
	 }
	
	public String getPageInnerText(WebDriver driver)
	 {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
	 		return pageText;
	 }
	
	public void scrollPageDown(WebDriver driver)
	 {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 }
	
	public void scrollIntoView(WebElement element, WebDriver driver)
	 {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		js.executeScript("arguments[0].scrollIntoView(true);", element);
	 }
	
	public void assertElementDisplayed(WebElement element, String elementName)
	{
		try
		{
	 		if(element.isDisplayed())
	 		{
	 			extentTest.log(LogStatus.PASS, elementName + " is displayed");
	 		}
	 		else
	 		{
	 			extentTest.log(LogStatus.FAIL, elementName + " is not displayed");
	 		}
		}catch(NoSuchElementException e)
		{
			e.printStackTrace();
			extentTest.log(LogStatus.FAIL, elementName + " is not displayed");
		}	
	}
	
	public void assertText(WebElement element, String expectedText, String elementName)
	{
		try
		{	
	 		if(element.getText().equals(expectedText))
	 		{
	 			extentTest.log(LogStatus.PASS, elementName + "'s Text is " + expectedText);
	 		}
	 		else
	 		{
	 			extentTest.log(LogStatus.FAIL, elementName + "'s Text is " + element.getText() + " but should be " + expectedText);
	 		}
		}catch(NoSuchElementException e)
		{
			e.printStackTrace();
			extentTest.log(LogStatus.FAIL, elementName + "'s Text is not displayed");
		}	
	}
	
	public void switchToLastWindow(){
		try
		{
		Set<String> windowvalue = driver.getWindowHandles(); 
		int k = windowvalue.size();
		String lastwindow = (String) windowvalue.toArray()[k-1];
		
		driver.switchTo().window(lastwindow);
		extentTest.log(LogStatus.INFO, "Switched the control to the last opened window");
		}
		catch(Exception e)
    	{
			e.printStackTrace();
    	}
	}
	
	public void closeAndSwitchToPreviousWindow(){
	    try
	    {
			Set<String> windowvalue = driver.getWindowHandles();
			int k = windowvalue.size();
			String lastwindow = (String) windowvalue.toArray()[k-1];
			String window = (String) windowvalue.toArray()[k-2];
			
			driver.switchTo().window(lastwindow).close();
			extentTest.log(LogStatus.INFO, "Closed the last opened window");
			driver.switchTo().window(window);		
			extentTest.log(LogStatus.INFO, "Switched the control back to the previous window");
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		}
	public void navigateBack(){
		driver.navigate().back();
		extentTest.log(LogStatus.PASS, "Navigated to previous page");
	}
	    
	public void switchToFrame(WebElement frmaeLocator) {
		driver.switchTo().frame(frmaeLocator);
	}
	
	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}
	
	
	
	
	public void selectGender(String gender, WebElement male, WebElement female)
	{
		if(StringCompare(gender, "Male", "Gender"))
		{
			if(male.isEnabled())
			{
				ClickJSElement(male, "Male");
			}
		}
		else if(StringCompare(gender, "Female", "Gender"))
		{
			if(female.isEnabled())
			{
				ClickJSElement(female, "Female");
			}
		}
	}
	
	public boolean StringCompare(String string1, String string2, String desc)
	 {
	 	if(string1.equalsIgnoreCase(string2))
	 	 {	
	 		extentTest.log(LogStatus.INFO, desc + ": " + string1+" is selected");
	 		return true;
	 	 }
	 	 else			 
	 	 {
	 		 extentTest.log(LogStatus.INFO, desc + ": " + string1+","+string2 + " are not same");
	 		 return false;
	 	 }
	 }
	
	public void maritalStatusReusable(String strMaritalStatusIndicator, WebElement married, WebElement notMarried)
	{	
		if(strMaritalStatusIndicator.equalsIgnoreCase("Yes"))			
		{
			ClickElement(married, "Married");
		}
		if(strMaritalStatusIndicator.equalsIgnoreCase("No"))
		{		
			ClickElement(notMarried, "Not Married");
		}
	}
	
	public void selectYesNoRdoBtn(String indicator, String desc, WebElement yesBtn, WebElement noBtn)
	{	
		if(indicator.equalsIgnoreCase("Yes"))			
		{
			ClickElement(yesBtn, "Yes Button");
			extentTest.log(LogStatus.INFO, desc + ": " + indicator +" is selected");
		}
		if(indicator.equalsIgnoreCase("No"))
		{		
				ClickElement(noBtn, "No Button");
				extentTest.log(LogStatus.INFO, desc + ": " + indicator +" is selected");
		}
	}
	
	public boolean isEnabledElement(WebElement element) {
		try {
			if(element.isEnabled()) {
				return true;
			}else {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean isDisplayedElement(WebElement element) {
		try {
			if(element.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
	public void enterDOB(String dob, WebElement month, WebElement day, WebElement year)
	{
 		try
 		{
	 		if(!dob.isEmpty())
	 		{
				String[] dateOfBirth = dob.split("/");
				String strMonth = dateOfBirth[0];
				String strDay = dateOfBirth[1];
				String strYear = dateOfBirth[2];		
				
				if(year.isDisplayed())
				{
					year.sendKeys(strYear);
					day.sendKeys(strDay);								
					month.sendKeys(strMonth);
					
				}
	 		}
	 		else
	 		{
	 			
	 		}
 		}
 		catch(Exception e)
 		{
 			
 		}
	}
}
