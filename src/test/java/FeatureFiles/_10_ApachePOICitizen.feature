Feature: ApachePOI Citizen Functionality

  Background: # before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

    Scenario: Create and Delete Citizen from Excel
      When User Create citizenship with ApachePOI
      Then User Delete citizenship with ApachePOI
