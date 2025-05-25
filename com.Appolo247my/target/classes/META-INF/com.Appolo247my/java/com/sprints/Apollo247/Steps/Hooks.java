//package com.sprints.Apollo247.Steps;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.BeforeAll;
//
//public class Hooks {
//      
//	
//	public static ExtentReports report;
//
//	public static ExtentTest test;
//
////	
//
//	@BeforeAll
//
//	public static void forExtentStart()
//
//	{
//
//		Hooks.report = new ExtentReports("C:\\Users\\BVILASJI\\Sprints\\Apollo247\\src\\test\\resources\\Reports\\extentReports\\medicines.html");	
//
//		Hooks.test = report.startTest("Medicines Module");
//
//	}
//
//	@AfterAll
//
//	public static void forExtentEnd()
//
//	{
//
//		report.endTest(test);
//
//		report.flush();
//
//	}
//}
