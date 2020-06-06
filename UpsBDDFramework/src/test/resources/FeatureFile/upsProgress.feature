@upsprogress @FunctionalTest
Feature: Track Item, look for Shipment Progress and Proof of delivery.  
Description: As a user I want to track for item,look for Shipment Progress and Proof of delivery.

Scenario Outline: Positive  

Given User open browser

When The user navigate to the UPS home page "https://www.ups.com/us/en/Home.page?"

Then User Enter valid tracking number "<Trackingnumber>"

And Submit search

Then User click on Shipment Progress

And User click on Detailed view tab

And User Hover over to Proof of Delivery to verify then exit out of it.

Then Validate logout page and user close the browser

Examples:

|Userid      |Password     	|Trackingnumber    |
#|touseefimam |Texas29121983	|1ZW494600328764231|
|mokter27    |Mokter@7752	|1ZW494700325802284|