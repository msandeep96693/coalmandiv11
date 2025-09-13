Feature: Create Coal Product Listing

Background:
Given the user has logged into the application
And the user navigates to the "Create Coal Product Listing" page

Scenario: Successfully create a new coal product listing with all valid details
When the user selects a valid "Business Profile"
And the user selects a valid "Coal Type"
And the user selects "Origin of Coal"
And the user selects "Source of Coal"
And the user selects "Grade of coal" except washeries
And the user selects CIL Subsidiary
And the user selects a valid Mine

When the user enters "65" in the Fixed Carbon Percentage field
And selects Max from the Fixed Carbon MIN/MAX dropdown
And enters "15" in the Ash Content Percentage field
And selects Max from the Ash Content MIN/MAX dropdown
And enters "20" in the Volatile Matter Percentage field
And selects Max from the Volatile Matter MIN/MAX dropdown
And enters "5" in the Total Moisture Percentage field
And selects Max from the Total Moisture MIN/MAX dropdown

And the user selects "Delivery Mode"
And the user enters "Quantity" as 1000 MT
And the user enters "Rate per MT" as 1500 INR
And the user selects "Delivery Terms"
And the user selects "Payment Terms"
And the user enters "EMD%" as 5
And the user enters "Free Payment Period" as 10 days
And the user enters "Free Lifting Period" as 15 days
And the user selects "Validity Start Date"
And the user selects "Validity End Date"
And the user enters a valid "Loading Point Address"
And the user enters "Other Remarks"
And the user uploads required documents (max 3, within 10MB each)
And the user clicks on the "Create Listing" button
Then the system should successfully create the coal product listing and redirected to mylisting page
And a confirmation message should be displayed