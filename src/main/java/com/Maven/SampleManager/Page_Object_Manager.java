package com.Maven.SampleManager;

import org.openqa.selenium.WebDriver;

import com.Maven.Adactin.Book_Hotel;
import com.Maven.Adactin.Booking_Confirmation;
import com.Maven.Adactin.Login_Page;
import com.Maven.Adactin.Search_Hotel;
import com.Maven.Adactin.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver;

	private Login_Page lp;
	private Search_Hotel sh;

	private Select_Hotel shh;
	private Book_Hotel bh;
	private Booking_Confirmation bc;

	public Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public Login_Page getInsianceLogin() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}

		return lp;
	}

	public Search_Hotel getInsianceSearchHotel() {
		if (sh == null) {
			sh = new Search_Hotel(driver);
		}

		return sh;
	}

	public Select_Hotel getInsianceSelectHotel() {
		if (shh == null) {
			shh = new Select_Hotel(driver);
		}

		return shh;
	}

	public Book_Hotel getInstanceBookHotel() {
		if (bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	public Booking_Confirmation getInstanceBookingConfirmation() {

		if (bc == null) {
			bc = new Booking_Confirmation(driver);

		}
		return bc;
	}

}
