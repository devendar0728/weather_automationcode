Feature: To test google functionality

Scenario: Validate the search function

Given Browser is open
And user is on google page
When user enter text 
And Hits enter
Then user is navigated to results page