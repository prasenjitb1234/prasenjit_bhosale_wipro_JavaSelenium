Feature: check user is able to login with valid credentials

Scenario Outline: successful login
Given login page should be open in default browser
When click on username button and enter valid <username1>
And add <password1>
And click on signin button <status>
Then login successfully and open home page

Examples:
| username1| password1 | status|
| username | fk456gvfthbjh     | fail |
| prasenjit| fakepassword| fail |
| demo    | 789bjkmm     | fail |
| username | password   | pass |
