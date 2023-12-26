@us06

Feature: US06 Confirm that hotel details pages provide accurate information.



  Scenario: Verify House Details Page
    Given user go to home page
    Then user clicks on search button
    Then user clicks property type dropdown menu
    When user selects the house or apartment checkbox
    Then user clicks the apply button
    And user verify the house price is visible
    When user clicks the house name
    Then user clicks the overview button
    Then verify top amenities is visible
