Feature: Room Booking functionality

Scenario: Validating the Personal Details of User

Given User is on home page of registration for the room
When User clicks on next without entering 'First Name'
Then alert box with message 'Please fill the First Name' should display
When User clicks on next without entering 'Last Name'
Then alert box with message 'Please fill the Last Name' should display
When User clicks on next with wrong format of 'Email'
Then alert box with message 'Please fill the Email' should display
When User clicks on next without entering 'Contact No'
Then alert box with message 'Please fill the Contact No.' should display
When User clicks on next with invalid 'Contact No'
Then alert box with message 'Please enter valid Contact no.' should display
When User clicks on next without entering 'Number of people attending'
Then alert box with message 'Please fill the Number of people attending' should display
When User clicks on next without entering 'Building Name & Room No'
Then alert box with message 'Please fill the Building & Room No' should display
When User clicks on next without entering 'Area Name'
Then alert box with message 'Please fill the Area name' should display
When User clicks on next without entering 'city'
Then alert box with message 'Please select city' should display
When User clicks on next without entering 'State'
Then alert box with message 'Please select state' should display
When User clicks on next without selecting the 'Membership Status'
Then alert box with message 'Please Select MemeberShip status' should display
When User clicks on 'Next' after entering all valid details
Then alert box with message 'Personal details are validated.' should display
And User should be navigated to the payment page
When User clicks on make payment without entering 'Card Holder Name'
Then alert box with message 'Please fill the Card holder name' should display
When User clicks on make payment without entering 'Debit Card Number'
Then alert box with message 'Please fill the Debit card Number' should display
When User clicks on make payment without entering 'CVV'
Then alert box with message 'Please fill the CVV' should display
When User clicks on make payment without entering 'Expiration month'
Then alert box with message 'Please fill expiration month' should display
When User clicks on make payment without entering 'Expiration Year'
Then alert box with message 'Please fill the expiration year' should display
When User clicks on 'Make Payment' after entering all valid details
Then alert box with message 'Conference Room Booking successfully done!!!' should display





