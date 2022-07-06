$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/a/eclipse-workspace/Maven-Project/src/test/java/com/Maven_Project/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the booking functionality of Adactin Application",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user Must Lauch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"sathish8939\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"I33B64\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click The LoginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Lauch_The_Url()"
});
formatter.result({
  "duration": 2528522600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sathish8939",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 240863300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I33B64",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 104684600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_LoginButton()"
});
formatter.result({
  "duration": 848294500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user Select \"London\" In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Select \"Hotel Creek\" In The Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Select \"Super Deluxe\"In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select \"3 - Three\" In NumberOfRooms",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Enter The \"29/06/2022\" In Checkindate",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Enter The \"30/06/2022\" In CheckOut",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Select The \"3 - Three\" in Aduleperroom",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Select The \"1 - One\" in Childrenperroom",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Click on SearchButton",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_In_The_Location_Field(String)"
});
formatter.result({
  "duration": 178231100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_In_The_Hotels_Field(String)"
});
formatter.result({
  "duration": 189833200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_In_The_Room_Type_Field(String)"
});
formatter.result({
  "duration": 292555800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 - Three",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_In_NumberOfRooms(int)"
});
formatter.result({
  "duration": 506127100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29/06/2022",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Checkindate(String)"
});
formatter.result({
  "duration": 249067300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30/06/2022",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_CheckOut(String)"
});
formatter.result({
  "duration": 119867500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 - Three",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_Select_The_in_Aduleperroom(String)"
});
formatter.result({
  "duration": 161606700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_Select_The_in_Childrenperroom(String)"
});
formatter.result({
  "duration": 187369200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_on_SearchButton()"
});
formatter.result({
  "duration": 866020600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user Select on Radio-Button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Click on Continue Button And It Navigates To BookHotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_on_Radio_Button()"
});
formatter.result({
  "duration": 89365400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_on_Continue_Button_And_It_Navigates_To_BookHotel_Page()"
});
formatter.result({
  "duration": 639392000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Book Hotel Hotel Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-application;book-hotel-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user Enter \"sathish\" In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Enter \"kumar\" In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter \"98 Victoria Street LondonS\" in billingaddress",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enter \"1234567892345678\" in Creditnumber",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Select \"VISA\" in CreditType",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Select \"February\" From Month",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Select \"2013\" From Year",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter \"987\" In Cvvnumber",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Click On Book Now Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sathish",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_Enter_In_First_Name_Field(String)"
});
formatter.result({
  "duration": 148771700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_Enter_In_Last_Name_Field(String)"
});
formatter.result({
  "duration": 130395500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "98 Victoria Street LondonS",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_Enter_in_billingaddress(String)"
});
formatter.result({
  "duration": 125568100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567892345678",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_Enter_in_Creditnumber(String)"
});
formatter.result({
  "duration": 125756200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_in_CreditType(String)"
});
formatter.result({
  "duration": 196294200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "February",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_From_Month(String)"
});
formatter.result({
  "duration": 396144800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2013",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_Select_From_Year(String)"
});
formatter.result({
  "duration": 343123400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "987",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_Enter_In_Cvvnumber(String)"
});
formatter.result({
  "duration": 274944700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Book_Now_Button()"
});
formatter.result({
  "duration": 149933400,
  "status": "passed"
});
});