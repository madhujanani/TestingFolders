Feature:
To validate the Login functionallity of NetShoe Application
Scenario Outline:

To validate using valid and invalid credentials
Given user have Enter netShoe Application using chrome browser
When change the language to english and close the alert
When user needs to click on log in and need to give invalid email "<email>" and invalid password "<password>" credentials
Then click on the Access account button 



Examples:
|email              |  password  |
|greens@gmail.com   |  greens123 |
|white@gmail.com    |  white123  |
|blues@gmail.com    |  blue123   |
|yellows@gmail.com  |  yellow123 |
|purple@gmail.com   |  purple123 |
|red@gmail.com      |   red123   |


