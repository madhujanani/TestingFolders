$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/login.feature");
formatter.feature({
  "name": "",
  "description": "To Find the login functionallity",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate login funtionality using valid and invalid inputs",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter into kohls application using chrome driver",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.enter_into_kohls_application_using_chrome_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user needs to enter valid username \u003c\"hello@123\"\u003e and invalid password \u003c\"1234557\"\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_needs_to_enter_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user needs to click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_needs_to_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User needs to reach invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_needs_to_reach_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});