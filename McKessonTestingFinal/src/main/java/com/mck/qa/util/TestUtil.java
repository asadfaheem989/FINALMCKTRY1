package com.mck.qa.util;

import com.mck.qa.base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestUtil extends TestBase {
	
	public ExtentReports extent; 
	public ExtentTest extentTest;
	
	public static long PAGE_LOAD_TIMEOUT = 20; 
	public static long IMPLICIT_WAIT = 10; 
	
}

