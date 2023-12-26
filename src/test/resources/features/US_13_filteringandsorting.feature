@US13
  Feature: Filtering and Sorting
    Scenario: TC001 Verify that users can filter and sort search results effectively

      Given User navigates to "url"
       And User waits 2 seconds
       Then User enters "New York" on Destination box
       And User waits 2 seconds
       When user  checks in and checks out.
       And User waits 2 seconds
       And user enters Adults, Children and Rooms number and clicks apply button
       And User waits 2 seconds
       And User clicks the search button
       And User waits 2 seconds
       Then validate filters and sort results

