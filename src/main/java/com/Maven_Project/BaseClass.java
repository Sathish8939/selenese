package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void lauchUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void inputPass(WebElement element ,String input) {
		
		element.sendKeys(input);
		
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void dropdownVisibleText(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	public static void dropdownValue(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByValue(value);
		
	}
	
	public static void dropdownIndex(WebElement element,int index) {
	
	Select select=new Select(element);
	select.selectByIndex(index);
	
}
	
	public static void screenshotMethod(String location) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(location);
		FileUtils.copyFile(src, dest);
		
		
	}
	
	
	
	
	
}
