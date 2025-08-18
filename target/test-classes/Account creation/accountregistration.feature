Feature: Customer Account Registration functionality

Scenario: customer account Registration
Given should navigate to the login page
When Enter the url as "https://coalmandi.rokkun.dev/"
Then Verify that the customer is navigated to the customer website
When user click on create an account button
And user should select one subrole
And user click on continue button
And user enter fullname 
And user enter whatsapp number
And user enter emailID
When user click on send otp button
#And Extract the OTP from whatsapp number and enter into whatsapp number field
#And Extract the OTP from email and enter into emailid field






