Feature: Login Feature File
@selenium
Scenario: Login scenario test for Gmail

Given navigate to gmail page
When user logged with username as userA and password as password
Then account page should be displayed