Feature: Login into the Application


Scenario Outline: Login_with_valid_credentials

Given Launch_the_browser
When provide the URL "http://20.127.21.109/#/auth/login"
When provide user and password and click on login button 
Then Validate the page after Login








