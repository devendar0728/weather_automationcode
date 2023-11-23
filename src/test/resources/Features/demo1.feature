Feature: testing login

Scenario Outline: Cehck login is succesfull for valid credentials
Given user is on Login page
When user enters <usrname> and <password>
And clicks on login button
Then user is navigated to home page

Examples: 
|usrname|password|
