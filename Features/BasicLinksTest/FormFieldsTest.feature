Feature: Test for Form Fields Modal page
  Description: Practice Automation for Form Fields Page


  Scenario Outline: Open the Form Fields Modal page
    Given I am on Home page
    And I click on FormFields Link
    When I enter "<name>" in the name fields textbox
    And I enter "<password>" in the password fields textbox
    And then I answer what is my favorite "<drink>" drink
    And I enter what is my favorite "<color>" color
    And I answer do i like automation "<response>"
    And I enter "<email>" in the email fields textbox
    Then I enter "<message>" in the message fields textbox


    Examples:
      | name     | password | drink | color | response | email                | message                         |
      | John Doe | john123  | tea   | blue  | yes      | john.doe@example.com | I love learning and automation! |