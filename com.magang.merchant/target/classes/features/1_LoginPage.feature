Feature: Wordpress Login

	Scenario: Testing the authentication
		Given User go to the Website
		When User input username password and click Login
		Then User can login to the Website