package com.qa.testCases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class DemoTest extends TestBase{
	
	public DemoTest() {
		super();	
	}
	
	@BeforeMethod
	public void setUp(Method testMethod) throws IOException{
		intialization();
		extentTest = extent.startTest(testMethod.getName());
		
	}
	
	@DataProvider
	public Object[][] getCOTestData(){
		Object data[][] = TestUtil.getTestData("Sheet1");
		return data;
	}
	
	@Test(dataProvider="getCOTestData")
	public void optionsTest (Object... objArray) {
		
		extentTest = extent.startTest("Test1 - ");
		String strArray[] = Arrays.stream(objArray).toArray(String[]::new);
		for(String s: strArray) {
			System.out.println(s);
		}
		
	}
}
