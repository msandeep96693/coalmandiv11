Feature: customer login fuctionality

Background:
	Given user should navigate to the login page
	When Enter the url as "https://coalmandi.rokkun.dev/"
	Then Verify that the customer is navigated to the customer website


Scenario: The customer login with valid email address
	And Enter the email address as "sandeep@rokkun.io" and password as "Sandeep@1234"
	And  Clicks on the login button
	Then Verify that the customer is navigated to the dashboard page with the confirmation message
	

Scenario: The customer login with invalid email address
  When user enter the invalid email address as "sandeep@test.com" and valid password as "Sandeep@123"
	And  Clicks on the login button
	Then Verify the email not registered error message will display


Scenario: The customer login with invalid password
	When user enter the valid email address as "customer@test.com" and invalid password as "1234"
	And  Clicks on the login button
	Then Verify the invalid password error message will display


#Scenario: The customer login with OTP functionality
#	When user enter the email address as "anything@50ih2qmm.mailosaur.net"
#	And  Clicks on the login with OTP button
#	And  extract otp from email and enter otp into otp fields
#	And  user click on Verify & Log in button
#	Then verify that user redirected to dashboard page
	
	
	
	
	