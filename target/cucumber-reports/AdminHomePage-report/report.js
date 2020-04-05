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
  "name": "Verifies navigation to TechLead Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@adminHomePage"
    },
    {
      "name": "@navigateToTechLeadPage"
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
  "name": "User opens \"Tech Lead\" page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies title is \"Coding Boot-camp | Tech Lead Academy\"",
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
});