Feature:  User login and verify in omrbranch 
Scenario Outline: user login with valid credentials
Given user is on the omrbranch page
When user enters "<username>" , "<password>"
Then user should verify login page of success message

Examples:
|username|password|
|shanmugapriya2593@gmail.com|Priya@2408|

Scenario:
When user enters valid username and invalid password
Then user get Errormessage of invalid credentials