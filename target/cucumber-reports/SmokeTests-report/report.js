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
