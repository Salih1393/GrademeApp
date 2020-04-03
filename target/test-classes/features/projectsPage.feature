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
    
    
  @editorTest @smoke
    Scenario Outline: Verifies editor is working
      Given User opens "login" page
      And User logins to admin page
      And User opens "Projects" page
      And User selects week "1"
      When User opens "Hello World" project
      And User inputs "<code>"
      Then Verifies the text "PASS"
      Examples:
      |                  code                  |
      | System.out.println(\"Hello, World!\"); |
    
