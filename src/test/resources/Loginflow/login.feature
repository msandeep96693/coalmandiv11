Feature: customer login fuctionality

Background:
	Given user should navigate to the login page
	When Enter the url as "https://coalmandi.rokkun.dev/"
	Then Verify that the customer is navigated to the customer website


@smoke
Scenario: The customer login with valid email address
	And Enter the email address as "sandeep@rokkun.io" and password as "Sandeep@1234"
	And  Clicks on the login button
	Then Verify that the customer is navigated to the dashboard page with the confirmation message
	And user click on profile icon
	And user click on logout button
	Then verify the login page is displayed
	And close the application

@invalidemailID @all
Scenario: The customer login with invalid email address
  When user enter the invalid email address as "dummymail@test.com" and valid password as "Sandeep@123"
	And  Clicks on the login button
	Then Verify the email not registered error message
	And close the application

@invalidpassword @all
Scenario: The customer login with invalid password
	When user enter the valid email address as "sandeep+importer123@rokkun.io" and invalid password as "dummypassword"
	And  Clicks on the login button
	Then Verify the invalid password error message
	And close the application

@loginwithotp @all
Scenario: The customer login with OTP functionality
	When user enter the email address as "sandeep+importer123@rokkun.io"
	And  Clicks on the login with OTP button
	And  extract otp from email and enter otp into otp fields
	#And  user click on Verify & Log in button
	Then Verify that the customer is navigated to the dashboard page with the confirmation message
	And close the application
	
	
	
	
	