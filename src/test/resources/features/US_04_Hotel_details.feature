@Us_04
Feature: hotel details

  Scenario: Verify hotel details
    Given user go to home page
Then user clicks on search button
Then user clicks property type dropdown menu
Then user selects the Hotel checkbox
Then user clicks the apply button
And user verify the hotel price is visible
When user clicks the hotel name
When user clicks the overview button
Then verify top amenities is visible