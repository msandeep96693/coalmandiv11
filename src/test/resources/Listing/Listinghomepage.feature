Feature: Listing Page Functionality

Background:
Given the user has logged into the application
And the user is on the "Listing" page

#participated
Scenario: Verify the user can search listings
When the user enters a valid keyword in the "Search" box
Then the matching listing(s) should be displayed

Scenario: Verify the user can filter listings by status
When the user selects "Active" from the "All Status" dropdown
Then only listings with "Active" status should be displayed

#mylisiting
Scenario: Verify the user can search listings
When the user enters a valid keyword in the "Search" box in mylisting page
Then the matching listing(s) should be displayed

Scenario: Verify the user can filter listings by status
When the user selects "Active" from the "All Status" dropdown in mylisting page
Then only listings with "Active" status should be displayed
