Feature: Customer business profile creation functionality

Scenario: Business info profile creation
Given user should navigate to the login page
When Enter the url as "https://coalmandi.rokkun.dev/"
Then Verify that the customer is navigated to the customer website
And Enter the email address as "sandeep@rokkun.io" and password as "Sandeep@1234"
And  Clicks on the login button
And verify Profile review page will display

#business info

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
When customer click on Proceed button

#Add sub business unit

And customer enter remember As into textfield
And verify the GST number
And customer verify the business name and registered address data
And customer enter city into textfield
And customer enter state into textfield
And customer enter sub unit address into textfield
And customer select a option from ownership dropdown
And customer select a option from industry dropdown
And customer select a option from product to Trade dropdown
And customer select a option from origin of coal dropdown

And customer enter customer person name into textfield
And customer enter designation into textfield
And customer enter Business email into textfield
And customer enter mobile number into textfield
When customer click on save button

#Add kyc documents

And customer upload a authorization letter and click on submit button
Then verify authorization letter confirmation message


And customer upload a Pan card and click on submit button
Then verify Pan card confirmation message
And customer upload a GST certificate and click on submit button
Then verify GST certificate confirmation message
And customer upload a Bank details and click on submit button
Then verify Bank details confirmation message
And customer upload a Udyam certificate and click on submit button
Then verify Udyam certificate confirmation message
And customer upload a IEC certificate and click on submit button
Then verify IEC certificate confirmation message
And customer upload a D&B number and click on submit button
Then verify D&B numberconfirmation message
When customer click on save & proceed button
And verify the redirected to review & submit page
When customer select the confirm info correctness checkbox
When customer select the accept terms checkbox
When customer click on submit for verification button
Then verify the review button page





