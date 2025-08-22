Feature:zerobank check valid credentials
Scenario Outline: successful login to zerobank
Given zerobank login should open in default browser
When click on usernamefield and enter <username2>
And add <password2>
And clicks on signIn Btn <status2>
Then Login Successfully to Zerobank Homepage

Examples:
| username2| password2 | status2|
| username | fk456gvfthbjh     | fail |
| demousername| fakepassword| fail |
| demo    | 789bjkmm     | fail |
| username | password   | pass |