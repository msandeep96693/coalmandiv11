Feature: Customer Account Registration functionality

Scenario: Business info profile creation
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

When customer click on create business profile button
And customer click on image upload icon
And customer enter remember As into textfield
And customer enter GST number into textfield
And customer click on verify GST button
And customer verify the business name and registered address data
And customer enter city into textfield
And customer enter state into textfield
And customer select a option from ownership dropdown
And customer select a option from industry dropdown
And customer select a option from product to Trade dropdown
And customer select a option from origin of coal dropdown

And customer enter customer person name into textfield
And customer enter designation into textfield
And customer enter Business email into textfield
And customer enter mobile number into textfield
When customer click on save & Proceed button




