$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 2,
  "name": "This is a Login feature",
  "description": "",
  "id": "this-is-a-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the devtest URL",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 8,
  "name": "Login with valid username and password",
  "description": "",
  "id": "this-is-a-login-feature;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@login_1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "given valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should be logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser driver",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});