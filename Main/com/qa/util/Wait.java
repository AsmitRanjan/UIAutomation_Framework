package com.qa.util;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait implements org.openqa.selenium.support.ui.Wait<WebDriver>{
	
	private static final int WAIT_TIMEOUT = 200;
	/**
	 * Method to wait for an Element. This method will receive argument as
	 * driver object and UIMap element name
	 * 
	 * @param WebDriver
	 *            driver - Web driver instance containing  element final
	 *            String element - uimap element to wait for
	 * 
	 * @return void
	 * 
	 *
	 */
	public void waitForElementToDisplay(WebDriver driver, final WebElement element) {

		try {
			new WebDriverWait(driver, WAIT_TIMEOUT)
					.until(new ExpectedCondition<Boolean>() {

						@Override
						public Boolean apply(WebDriver driver) {
							// return getElement(element).isDisplayed();
							System.out.println(element +" Element is displayed");
							return element.isDisplayed();
							
						}
					});
		} catch (TimeoutException e) {
			
		}
	}
	
	public void waitForElementToEnable(WebDriver driver, final WebElement element) {

		try {
			new WebDriverWait(driver, WAIT_TIMEOUT)
					.until(new ExpectedCondition<Boolean>() {

						@Override
						public Boolean apply(WebDriver driver) {
							// return getElement(element).isDisplayed();
//							System.out.println(element.isEnabled());
//							System.out.println(element.isDisplayed());
							return element.isEnabled();
						}
					});
		} catch (TimeoutException e) {
			System.out.println(
					"The Expected element : \""+
							 element.toString()
							+ "\" is not present in the Application even after the stipulated time "
							+ " TimeOutException is caught in WaitForElement method."
							+ " Please verify the application by manually.");

		}
	}

	public void  waitAndClick(By locator,WebDriver driver) {
			WebElement element = null;
		try {
				//WebElement element = null;
		
				WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT);
		
				element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		
				element.click();

		  }	catch (TimeoutException e) {
		System.out.println(
				"The Expected element : \""+
						 element.toString()
						+ "\" is not present in the Application even after the stipulated time "
						+ " TimeOutException is caught in WaitForElement method."
						+ " Please verify the application by manually.");

	}
	}
	
	
	
	public WebElement waitForElementVisible(By locator,WebDriver driver) {
		WebElement element = null;

		try{
		//WebElement element = null;

		WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		

		return element;
		}catch (TimeoutException e) {
			System.out.println(
					"The Expected element : \""+
							 element.toString()
							+ "\" is not present in the Application even after the stipulated time "
							+ " TimeOutException is caught in WaitForElement method."
							+ " Please verify the application by manually.");
		

		}
		return element;
	}
	
	public WebElement fluentWait(final By locator,WebDriver driver){
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                        return driver.findElement(locator);
                }
                }
        		);
                           return  element;   
                           
	}     ;
	
	public void waitForTitle(WebDriver driver,int timeout)
	{
		  // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver,timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
            	 return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
	
	}
	/**
	 * Method to wait and return an Element. This method will receive argument
	 * as driver object and UIMap element name
	 * 
	 * @param WebDriver
	 *            driver - Web driver instance containing uimap element final
	 *            String element - uimap element to wait for
	 * 
	 * @return void
	 * 
	 * 
	 */
	public WebElement waitAndGetElement(WebDriver driver,final WebElement element) {
		try {
			new WebDriverWait(driver, 60)
					.until(new ExpectedCondition<Boolean>() {

						@Override
						public Boolean apply(WebDriver driver) {
							return element.isDisplayed();
						}
					});
			return element;
		} catch (TimeoutException e) {
			System.out.println(
					"The Expected element : \""+
							element.toString()
							+ "\" is not present in the Application even after the stipulated time. "
							+ " TimeOutException is caught in WaitForElement method."
							+ " Please verify the application by manually.");

		}
		return element;
	}
	public boolean isPageLoad(WebDriver driver,String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,WAIT_TIMEOUT);
		boolean isTitle=wait.until(ExpectedConditions.titleContains(title));
		return isTitle;
	}
	
	// ---------------------------------------------------------
		// ---------------------- PAGE LOAD ------------------------
		// ---------------------------------------------------------

		/**
		 * Method to wait for the page to get loaded. This method can be used at the
		 * situation where you might expect some delay in page load. This method
		 * will wait based on the "document.readystate" is "complete".
		 * 
		 * @param nothing
		 * @Example: waitForPageLoad()
		 * @return nothing
		 * 
		 */

		public void waitForPageLoad(WebDriver driver) {
			// Making the WebDriver to wait for 60Sec
			new WebDriverWait(driver, WAIT_TIMEOUT).until(new ExpectedCondition<Boolean>() {
				// Overriding the apply method <apply method is an in-built Selenium
				// method>
				@Override
				public Boolean apply(WebDriver driver) {
					// Using JavaScriptExecutor executing the "document.readyState"
					// property of browser
					return ((JavascriptExecutor) driver)
							.executeScript("return document.readyState").toString()
							.equalsIgnoreCase("complete");
				}
			});
		}

	/*@Override
	public <T> T until(Function<? super WebDriver, T> arg0) {
		
		return null;
	}*/
		
	public void WaitforElement(WebDriver driver,By objLocator)
	{
		try
        {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        	WebElement input = (new WebDriverWait(driver,1)).until(ExpectedConditions.presenceOfElementLocated(objLocator));
        	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        	if(input.isDisplayed())
        	{
        		//Element is present
        	}        	
        }
        catch(Exception e)
        {
        	//Report with e.getMessage();        	
        }
	}

	@Override
	public <T> T until(Function<? super WebDriver, T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
