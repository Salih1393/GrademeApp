@projectsPageTest
  Feature: Project Page Testing

  @projectPage @smoke
    Scenario: Verifies title of projects
      Given User opens "login" page
      And User logins to admin page
      And User opens "Projects" page
      When User selects week "1"
      And User opens "Hello World" project
      Then Verifies the text "Requirement:"

