package com.Maven.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement dd1;

	@FindBy(id = "hotels")
	private WebElement dd2;

	@FindBy(id = "room_type")
	private WebElement dd3;

	@FindBy(id = "room_nos")
	private WebElement dd4;

	@FindBy(id = "datepick_in")
	private WebElement checkindatein;

	@FindBy(id = "datepick_out")
	private WebElement checkindateout;

	@FindBy(id = "adult_room")
	private WebElement adultperroom;

	@FindBy(id = "child_room")
	private WebElement childrenperroom;

	@FindBy(id = "Submit")
	private WebElement submitbtn;

	public Search_Hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDd1() {
		return dd1;
	}

	public WebElement getDd2() {
		return dd2;
	}

	public WebElement getDd3() {
		return dd3;
	}

	public WebElement getDd4() {
		return dd4;
	}

	public WebElement getCheckindatein() {
		return checkindatein;
	}

	public WebElement getCheckindateout() {
		return checkindateout;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
