
Feature:
To validate the Create Account functionallity of NetShoe Application

Background:
Given user have Enter netShoe Application using chrome browser

Scenario:
To validate using valid credentials
When change the language to english and close the alert
When user needs to click on log in and need to give  valid email credentials
 

|email |greens@gmail.com  |white@gmail.com |blues@gmail.com |yellows@gmail.com |purple@gmail.com |red@gmail.com | 
Then click on the procced button


Scenario:
To validate using valid credentials
When change the language to english and close the alert
When user needs to click on log in and need to give invalid email credentials



|invalid email |blues@gmail.com |yellows@gmail.com |purple@gmail.com |red@gmail.com  | 
Then click on the procced button