Feature: Check the Edge Devices

Scenario: Visit the  Edge Devices Page
Given Open the browser
When provide the URL "http://20.127.21.109/#/auth/login"
When provide user and password and click on login button 
Then Validate the page after Login
When  tab is avilable 
Then Go to the EDGEDevice Tab
Then validate the EDGEDevice heading and functions