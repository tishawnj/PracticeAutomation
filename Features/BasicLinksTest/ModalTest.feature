  Feature: Test for modal page
  Description: Practice Automation for Validations


    Scenario: Validation for Simple Modal Text
    Given I am on Home page
    When I click Modals Link
    And I click Simple Modal Link
    And I should see Simple Modal Text
    Then I verify text "Hi, I’m a simple modal." in the modal
      Then I close the modal
      #And I click Close Button




      Scenario Outline: Validation for Form Field Model
        Given I am on Home page
        When I click Modals Link
        And I click Form Field Modal Link
        And i fill in the form with name "<name>" and email "<email>" and message "<message>" in the modal

        #And I click Close Button



        Examples:
          | name        | email          | message                       |
          | Barry Bonds | bbonds@aol.com | I am in the modal, Thank you! |
          | Jerry Lewis | JLewis@aol.com | Hi Jerry, Thank You!          |


