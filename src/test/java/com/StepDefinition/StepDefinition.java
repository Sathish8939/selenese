package com.StepDefinition;

import com.Maven.Hotel.File_Reader_Manager;
import com.Maven.SampleManager.Page_Object_Manager;
import com.Maven_Project.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Must Lauch The Url$")
	public void user_Must_Lauch_The_Url() throws Throwable {

		String url = File_Reader_Manager.getInstanceFrm().getInstanceCr().getUrl();
		lauchUrl(url);

	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		inputPass(pom.getInsianceLogin().getUn(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputPass(pom.getInsianceLogin().getPass(), password);
	}

	@Then("^user Click The LoginButton$")
	public void user_Click_The_LoginButton() throws Throwable {
		clickOnElement(pom.getInsianceLogin().getLoginBtn());
	}

	@When("^user Select Location In The Location Field$")
	public void user_Select_Location_In_The_Location_Field(String location) throws Throwable {

		dropdownVisibleText(pom.getInsianceSearchHotel().getDd1(), location);
	}

	@When("^user Select \"([^\"]*)\" In The Hotels Field$")
	public void user_Select_In_The_Hotels_Field(String hhotel) throws Throwable {
		dropdownValue(pom.getInsianceSearchHotel().getDd2(), hhotel);
	}

	@When("^user Select \"([^\"]*)\"In The Room Type Field$")
	public void user_Select_In_The_Room_Type_Field(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dropdownValue(pom.getInsianceSearchHotel().getDd3(), arg1);
	}

	@When("^user Select \"([^\"]*)\" In NumberOfRooms$")
	public void user_Select_In_NumberOfRooms(int noof) throws Throwable {

		dropdownIndex(pom.getInsianceSearchHotel().getDd4(), noof);
	}

	@When("^user Enter The \"([^\"]*)\" In Checkindate$")
	public void user_Enter_The_In_Checkindate(String checkin) throws Throwable {

		inputPass(pom.getInsianceSearchHotel().getCheckindatein(), checkin);
	}

	@When("^user Enter The \"([^\"]*)\" In CheckOut$")
	public void user_Enter_The_In_CheckOut(String checkout) throws Throwable {
		inputPass(pom.getInsianceSearchHotel().getCheckindateout(), checkout);

	}

	@When("^User Select The \"([^\"]*)\" in Aduleperroom$")
	public void user_Select_The_in_Aduleperroom(String adult) throws Throwable {
		dropdownVisibleText(pom.getInsianceSearchHotel().getAdultperroom(), adult);
	}

	@When("^User Select The \"([^\"]*)\" in Childrenperroom$")
	public void user_Select_The_in_Childrenperroom(String children) throws Throwable {
		dropdownVisibleText(pom.getInsianceSearchHotel().getChildrenperroom(), children);
	}

	@Then("^user Click on SearchButton$")
	public void user_Click_on_SearchButton() throws Throwable {
		clickOnElement(pom.getInsianceSearchHotel().getSubmitbtn());
	}

	@When("^user Select on Radio-Button$")
	public void user_Select_on_Radio_Button() throws Throwable {
		clickOnElement(pom.getInsianceSelectHotel().getSelectradio());
	}

	@Then("^user Click on Continue Button And It Navigates To BookHotel Page$")
	public void user_Click_on_Continue_Button_And_It_Navigates_To_BookHotel_Page() throws Throwable {
		clickOnElement(pom.getInsianceSelectHotel().getContinuebtn());
	}

	@When("^user Enter \"([^\"]*)\" In First Name Field$")
	public void user_Enter_In_First_Name_Field(String arg1) throws Throwable {
		inputPass(pom.getInstanceBookHotel().getFirstname(), arg1);
	}

	@When("^user Enter \"([^\"]*)\" In Last Name Field$")
	public void user_Enter_In_Last_Name_Field(String lastname) throws Throwable {
		inputPass(pom.getInstanceBookHotel().getLastname(), lastname);
	}

	@When("^user Enter \"([^\"]*)\" in billingaddress$")
	public void user_Enter_in_billingaddress(String billingAdress) throws Throwable {
		inputPass(pom.getInstanceBookHotel().getBillingaddress(), billingAdress);
	}

	@When("^user Enter \"([^\"]*)\" in Creditnumber$")
	public void user_Enter_in_Creditnumber(String creditCardNumber) throws Throwable {
		inputPass(pom.getInstanceBookHotel().getCreditcrdnum(), creditCardNumber);
	}

	@When("^user Select \"([^\"]*)\" in CreditType$")
	public void user_Select_in_CreditType(String type) throws Throwable {
		dropdownVisibleText(pom.getInstanceBookHotel().getCreditcrdtype(), type);
	}

	@When("^user Select \"([^\"]*)\" From Month$")
	public void user_Select_From_Month(String month) throws Throwable {
		dropdownVisibleText(pom.getInstanceBookHotel().getMonth(), month);
	}

	@When("^user Select \"([^\"]*)\" From Year$")
	public void user_Select_From_Year(String year) throws Throwable {
		dropdownVisibleText(pom.getInstanceBookHotel().getYear(), year);
	}

	@When("^user Enter \"([^\"]*)\" In Cvvnumber$")
	public void user_Enter_In_Cvvnumber(String cvvNumber) throws Throwable {
		inputPass(pom.getInstanceBookHotel().getCvv(), cvvNumber);
	}

	@Then("^user Click On Book Now Button$")
	public void user_Click_On_Book_Now_Button() throws Throwable {
		clickOnElement(pom.getInstanceBookHotel().getBooknowbtn());
	}

}
