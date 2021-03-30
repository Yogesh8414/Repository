Feature: Login functionality for adactin Application 

Scenario: User enter valid username and valid password 
	Given User launch application 
	When User enter "yogesh84" as username 
	And User enter "Qwerty@7890" as password 
	Then User verify valid username and valid password 
	
Scenario: Users search hotels 
	When User selects the "Sydney" as the location 
	And User selects the "Hotel Creek" as the hotels 
	And User selects the "Super Deluxe" as the room type 
	And User selects the "2 - Two" as the number of rooms 
	And User selects the "28/03/2021" as the checkin date 
	And User selects the "29/03/2021" as the checkout date 
	And User selects the "1 - One" as the number od adults 
	And User selects the "0 - None" as the number of children 
	Then User verify the Valid Details 