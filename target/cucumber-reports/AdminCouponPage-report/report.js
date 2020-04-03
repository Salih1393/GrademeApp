$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/adminHomePage.feature");
formatter.feature({
  "name": "Admin Home Page testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@adminHomePage"
    }
  ]
});
formatter.scenario({
  "name": "Verifies admin page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@adminHomePage"
    },
    {
      "name": "@adminPageVerifyTitle"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"login\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins to admin page",
  "keyword": "When "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logins_to_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies title is \"GRADEME\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminHomePage_STEPS.verifies_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifies log out button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@adminHomePage"
    },
    {
      "name": "@logOutButtonTest"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"login\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins to admin page",
  "keyword": "When "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logins_to_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs out from admin page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logs_out_from_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies the text \"Log In to your account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminHomePage_STEPS.verifies_the_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});