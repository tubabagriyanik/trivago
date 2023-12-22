@tb_US_01
Feature: Homepage Navigation

  Scenario: Homepage load and  search bar is functional
    Given User goes to "https://www.trivago.com/" page
    When User goes to the center of the page
    And  User goes to the below of the page
    And User goes to the above of the page
    And User waits 2 seconds_tb
    Then User clicks to "Where to?" button_tb
    And User input "city_name"
    And User clicks to "check_in" button_tb
    And User selects to "date"
    And User clicks to "check_out" button_tb
    And User selects to "date"
    And User clicks to "Guest_and_rooms" button_tb
    And User clicks to Adult "+" button_tb
    And User clicks to Children "+" button_tb
    And User clicks to Rooms "+" button_tb
    And User clicks to "Children_age" button_tb
    And User choose "6" age
    And User clicks to "pet_friendly" button_tb
    And User clicks to "Apply" button_tb
    And User clicks to "Search" button_tb
    And User verify to search button








