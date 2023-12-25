
@Search
Feature:Search_button_function

  Scenario: Define_City_Checking_checkOut
    Given user goes to homepage
    When User click destination
    #Then dropdown scrolled out
    And user input city name to the empty field
    And click search button
    Then verified Banf Hotels appear on the window
    And user clicks check in field
    And user clicks check in calendar open and user select check in date
    And user clicks check out field
    And user clicks check out calendar open and user select check out date
    And user clicks to Search button
    And search button clickable and search result appear on website
    Then user verified search outcomes is visible

@US02
Feature:Verify that user can use search functionalty by destination and by dates

  Scenario: TC_02_Searching

    Given user goes to "Trivago"
    Then user input "Banf" on where to field
    And user clicks CheckIn button
    And  user selects check in data
    And user clicks apply button for guest
    And user clicks on Search button
    And user preses close button to be able to close the guest windows
    Then verify the  hotels appear on the window


