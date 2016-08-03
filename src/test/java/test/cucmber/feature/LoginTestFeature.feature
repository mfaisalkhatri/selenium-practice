#Sample Feature Definition Template
@tag
Feature: Login Feature
	Feature to test Login functionality.

@tag1
Scenario: When I Test successful Login attempt
Given I navigate to "http://the-internet.herokuapp.com/login"
When I login with User name as "tomsmith"
	And Password as "SuperSecretPassword!"
Then I should see message "You logged into a secure area!"
