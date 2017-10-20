Feature: Login Feature File
@selenium
Scenario: Login scenario test

Given navigate to delta login page
When user logged with username as userA and password as password
Then account page should be displayed