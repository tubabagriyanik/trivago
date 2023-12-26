@US13
  Feature: Filtering and Sorting
    Scenario: TC001 Verify that users can filter and sort search results effectively

      Given User navigate to "url"
       Then User enters destination on Destination box
       When user  checks in and checks out.
       And user enters Adults, Children and Rooms number and clicks apply button
       And User clicks the search button
       Then validate filters and sort results

