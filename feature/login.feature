Feature: Login feature file for test case

@login
Scenario: User should be able to login to the application

Given User is in login page
When User enters email id "tanu@gmail.com"
And User enters password "rta234"
Then User clicks the signin button
