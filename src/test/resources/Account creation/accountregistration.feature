Feature: Customer Account Registration functionality

Scenario: customer account Registration
Given user should navigate to the login page
When Enter the url as "https://coalmandi.rokkun.dev/"
Then Verify that the customer is navigated to the customer website
When customer click on create an account button
And customer should select one subrole
And customer click on continue button
And customer enter fullname 
And customer enter whatsapp number
And customer enter emailID
When customer click on send otp button
And Extract the OTP from whatsapp number and enter into whatsapp number field
And Extract the OTP from email and enter into emailid field
When customer click on verify account button
And then user navigate to create password page
And customer enter password 
And customer enter confirm password 
When customer click on create Account button with confirmation message
And Profile profile view page will display
And click on logout button
And close the application





 






