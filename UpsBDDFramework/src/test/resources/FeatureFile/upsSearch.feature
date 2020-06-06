@ups @RegressionTest
Feature: UPS Log In Track Item and Log Out

Description: As a user I want to login to UPS account, track for item and log out.

Scenario Outline: Positive

Given User open browser

When The user navigate to the UPS home page "https://www.ups.com/us/en/Home.page?"

Then User click on log in icon 

Then User enter User ID "<Userid>" and Password "<Password>"

And User click login button

Then User must login to the UPS account successfully

Then User Enter valid tracking number "<Trackingnumber>"

And Submit search

Then  User log out by clicking log out icon

Then Validate logout page and user close the browser

Examples:

|Userid      |Password     	|Trackingnumber    |
#|touseefimam |Texas29121983	|1ZW494600328764231|
|mokter27    |Mokter@7752	|1ZW494700325802284|
