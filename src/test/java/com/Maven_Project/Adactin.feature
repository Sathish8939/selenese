Feature: Checking the booking functionality of Adactin Application
Scenario : Login Functionality
Given user Must Lauch The Url
When user Enter The "sathish8939" In The Username Field
And user Enter The "I33B64"   In Password Field
Then user Click The LoginButton  

Scenario: Search Hotel Functionality
When user Select "London" In The Location Field
And user Select "Hotel Creek" In The Hotels Field
And user Select "Super Deluxe"In The Room Type Field
And user Select "3 - Three" In NumberOfRooms
And user Enter The "29/06/2022" In Checkindate
And user Enter The "30/06/2022" In CheckOut
And User Select The "3 - Three" in Aduleperroom
And User Select The "1 - One" in Childrenperroom
Then user Click on SearchButton 

 Scenario: Select Hotel Functionality
 When user Select on Radio-Button
 Then user Click on Continue Button And It Navigates To BookHotel Page
 
  Scenario: Book Hotel Hotel Functionality
  When user Enter "sathish" In First Name Field
  And user Enter "kumar" In Last Name Field
  And user Enter "98 Victoria Street LondonS" in billingaddress
  And user Enter "1234567892345678" in Creditnumber
  And user Select "VISA" in CreditType
  And user Select "February" From Month
  And user Select "2013" From Year
  And user Enter "987" In Cvvnumber
  Then user Click On Book Now Button
  