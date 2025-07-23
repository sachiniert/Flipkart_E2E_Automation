Feature: To validate the Flipkart Application

Background: 

Given Launch the Flipkart Application
When close the popup
Then It should Navigate to the Home page

Scenario: To validate the Search functionality 

Given User enter the Text in the Search field
When Click the search button
Then It should navigate to the search result page the relevent details
And Select Minimun and Maximum Amount
And Select the Brand
And Select the Ram
And Select the Battery Capacity
Then It should display the Relevent result