package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(".//Resource//com//qa//config//config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Initialization of Driver and launching of browser with proper URL 
	public static void intialization() throws IOException {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".//Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
	
	@BeforeSuite
	public void setupSuite() {
		String dateName = new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss").format(new Date());
		extent = new ExtentReports(System.getProperty("user.dir")+"/Reports/"
				+ prop.getProperty("projectName")+ "_" + dateName + ".html", true);
		
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED is "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED is "+result.getThrowable()); //to add error/exception in extent report
			
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED is " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED is " + result.getName());
		}
		extent.endTest(extentTest); 
		extent.flush();
	}
}
