@US09
Feature: Error Handling

  Background:
  Given User navigates to "url"

  @US09_TC001
  Scenario: Submit an invalid search query and validate the error message.
    Given User clicks on search query box
    When User enters invalid data
    Then User should see the error message.


  @US09_TC002
  Scenario: Intentionally provide incorrect payment information and check error handling.
    Given User enters a destination on home page
    When user clicks on search button
    And user clicks on View Deal button of the Hotel information box
    And website switches to another tab
    And user selects a room and clicks on Quick Book button
    And clicks Continue button on the pop-up message box
    And user enters invalid card number
    Then user should see the error message under card number box


