Feature: login validation
Background:
Given open browser3
|chrome|
|firefox|
|safari|
And fnavigate to facebook.com

@Smoke
Scenario: as a user I should be able to logged in using valid cridential
When user types the username
And user types the password
And user click on log in button
Then user should be in his profile page

@Regression
Scenario Outline:as a user I should be able to logged in using valid cridential
When user types the "<username>"
And user types the "<password>"
And user click on log in button
Then user should not be in his profile page
Examples:
|username|password|
|hosssain|7779797|
|69779|gkjaf|
|hossainmd671@gmail.com|7167546020|

