package com.sprints.Apollo247.Main;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\BVILASJI\\Sprints\\Apollo247\\src\\test\\resources\\Feature\\Medicines.feature",
glue= {"com.sprints.Apollo247.Steps"} ,tags="@Apollo",
plugin= {"pretty","html:target/myreport.html",
		"json:target/myjson.json",
		"junit:target/Cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class MedicinesRunner extends AbstractTestNGCucumberTests
{
	
}