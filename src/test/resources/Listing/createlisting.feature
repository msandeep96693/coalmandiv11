Feature: Create Coal Product Listing

Background:
Given user should navigate to the login page
When Enter the url as "https://coalmandi.rokkun.dev/"
Then Verify that the customer is navigated to the customer website
And Enter the email address as "sandeep+importer123@rokkun.io" and password as "Sandeep@123"
And  Clicks on the login button


Scenario: Successfully create a new coal product listing with all valid details
And the user navigates to the Create Coal Product Listing page
When the user selects a valid Business Profile
And the user selects a valid Coal Type
And the user selects Origin of Coal

And the user selects Source of Coal
And the user selects Grade of coal except washeries
And the user selects CIL Subsidiary
And the user selects a valid Mine

When the user enters data in the Fixed Carbon Percentage field
And selects Max from the Fixed Carbon MINMAX dropdown
And enters data in the Ash Content Percentage field
And selects Max from the Ash Content MINMAX dropdown
And enters data in the Volatile Matter Percentage field
And selects Max from the Volatile Matter MINMAX dropdown
And enters data in the Total Moisture Percentage field
And selects Max from the Total Moisture MINMAX dropdown

And the user selects Delivery Mode
And the user enters Railway siding code
And the user enters Quantity in MT
And the user enters Rate per MT in INR
And the user selects Delivery Terms
And the user selects Payment Terms
And the user enters credit days
And the user enters EMD%

And the user enters Free Payment Period in days
And the user enters Free Lifting Period in days
And the user selects Validity Start Date
And the user selects Validity End Date
And the user enters a valid Loading Point Address
And the user enters Other Remarks
And the user uploads required documents 
And the user clicks on the Create Listing button
Then the system should successfully create the coal product listing and redirected to mylisting page
And a confirmation message should be displayed

And user click on profile icon
And user click on logout button
Then verify the login page is displayed
And close the application







