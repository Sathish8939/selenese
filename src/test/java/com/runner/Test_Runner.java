package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)				
@CucumberOptions(features = "C:\\Users\\a\\eclipse-workspace\\Maven-Project\\src\\test\\java\\com\\Maven_Project\\Adactin.feature", glue="com.StepDefinition")	
	public class Test_Runner{
		
		public static WebDriver driver; 
		
		
		@BeforeClass
	public static void setUp() {
		
		driver=BaseClass.browserLaunch("chrome");
	}
	
	@AfterClass
	public static void teardown() {
		BaseClass.closeBrowser();

	}
	
	
	
	
	
	
	
	
	
	
}
