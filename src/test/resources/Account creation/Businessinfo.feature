Feature: Customer business profile creation functionality

Scenario: Business info profile creation
Given user should navigate to the login page
When Enter the url as "https://coalmandi.rokkun.dev/"
Then Verify that the customer is navigated to the customer website
And Enter the email address as " sandeep+ynu@rokkun.io" and password as "Sandeep@123"
And  Clicks on the login button
#And Profile profile view page will display

#business info

When customer click on create business profile button
And customer click on image upload icon
And customer enter remember As into textfield
And customer enter GST number into textfield
And customer click on verify GST button
#And customer verify the business name in business info
And customer enter city into textfield
And customer enter state into textfield

And customer select a option from ownership dropdown
And scroll the page upto to the contact field
And customer select a option from industry dropdown
And customer select a option from product to Trade dropdown
And customer select a option from origin of coal dropdown

And customer enter customer person name into textfield
And customer enter designation into textfield
And customer enter Business email into textfield
And customer enter mobile number into textfield
When customer click on Proceed button

And customer verify the review page
When user click on add sub business unit button

#Add sub business unit

And customer enter remember As into textfield
And verify the GST number
And customer verify the business name
And customer enter city into textfield
And customer enter state into textfield
And scroll the page upto the product to trade
And customer enter sub unit address into textfield
And customer select a option from ownership dropdown
And customer select a option from industry dropdown
And customer select a option from product to Trade dropdown
And scroll upto the business email field
And customer select a option from origin of coal dropdown

And customer enter customer person name into textfield
And customer enter designation into textfield
And customer enter Business email into textfield
And customer enter mobile number into textfield
When customer click on save button
Then verify the additional sub unit business profile created

#Add kyc documents

When the user uploads an authorization letter and submits the form
Then the authorization letter success confirmation message should be displayed

When the user uploads an PAN card and submits the form
Then the PAN card success confirmation message should be displayed

When the user uploads an GST certificate and submits the form
Then the GST certificate success confirmation message should be displayed

When the user submits the form with valid bank details and a cancelled cheque
Then the form should be submitted successfully

When the user submits the form with valid Udyam certificate details and Upload Udyam Certificate file 
Then the form should be submitted successfully

When the user submits the form with valid IEC certificate details and Upload IEC certificate file
Then the form should be submitted successfully

When the user submits the form with valid D&B numberer details and Upload D&B number file
Then the form should be submitted successfully

When customer click on save & proceed button
And the user redirected to review & submit page
When customer select the confirm info correctness and accept terms checkbox
When customer click on submit for verification button
Then verify the review button page





