@adminHomePage
  Feature: Admin Home Page testing

    @adminPageVerifyTitle @smoke
      Scenario: Verifies admin page title
        Given User opens "login" page
        When User logins to admin page
        Then Verifies title is "GRADEME"

    @logOutButtonTest @smoke
      Scenario: Verifies log out button
        Given User opens "login" page
        When User logins to admin page
        And User logs out from admin page
        Then Verifies the text "Log In to your account"

    @navigateToTechLeadPage
      Scenario: Verifies navigation to TechLead Page
        Given User opens "login" page
        When User logins to admin page
        And User opens "Tech Lead" page
        Then Verifies title is "Coding Boot-camp | Tech Lead Academy"