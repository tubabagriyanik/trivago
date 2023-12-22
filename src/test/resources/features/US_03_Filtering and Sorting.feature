@US03
Feature: Verify that users can filter and sort search results effectively.

  Scenario:TC01 Filtering and Sorting

    Given User navigates to "url"
    Then User clicks on Destination home page
    And User waits 2 seconds
    When User enters a USA
    And User clicks search button
    And User waits 2 seconds
    And User clicks on price
    And User choose scroll button and change the price
    And User waits 2 seconds
    And User clicks Apply button
    And User clicks on Filters
    And User clicks 5star
    And User clicks Popular filters and choose Family friendly box,Pet-friendly box
    And User clicks Apply button
    And User waits 2 seconds
    And User see that the Stays found: 1000+ area has changed
    And User clicks on Guest Rating
    And User choose 8.5+ Excellent
    And User clicks Apply button
    And User waits 2 seconds
    And User see that the Stays found: 1000+ area has changed
    And User clicks on Property Type
    And User choose Hotel box
    And User clicks Apply button
    And User see that the Stays found: 1000+ area has changed
    And User review the result according to the selected sorting criteria and confirm accuracy
  