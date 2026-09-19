Feature:  User login and verify in omrbranch 
Scenario Outline: user login with valid credentials
Given user is on the omrbranch page
When user enters "<username>" , "<password>"
Then user should verify login page of success message

Examples:
|username|password|
|shanmugapriya2593@gmail.com|Priya@2408|

