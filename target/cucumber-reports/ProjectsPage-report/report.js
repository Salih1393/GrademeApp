$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projectsPage.feature");
formatter.feature({
  "name": "Project Page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@projectsPageTest"
    }
  ]
});
formatter.scenario({
  "name": "Verifies title of projects",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@projectsPageTest"
    },
    {
      "name": "@projectPage"
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
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logins_to_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"Projects\" page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects week \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectsPage_STEPS.user_selects_week(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"Hello World\" project",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectsPage_STEPS.user_opens_project(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies the text \"Requirement:\"",
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