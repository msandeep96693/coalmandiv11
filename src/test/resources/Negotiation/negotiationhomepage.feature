Feature: Negotiation Management


Scenario: Verify user can search negotiations
Given the user is on the "Negotiation Management" page
When the user enters a valid keyword in the "Search" box
Then the system should display negotiations matching the search keyword


Scenario: Verify the user can search completed listings
When the user enters a valid keyword in the "Search" box
Then the matching listing(s) should be displayed


Scenario: Verify the user can filter listings by status
When the user selects "Accepted" from the "All Status" dropdown in completed page
Then only listings with "Accepted" status should be displayed