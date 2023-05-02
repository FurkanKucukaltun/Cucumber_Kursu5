Feature: Country Functionality

  Background: # before scenario
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully
    And   Navigate to country page

  Scenario: Create Country
    When Create a country
    Then Success message should be displayed

  Scenario: Create Country 2
    When create a country name as "ismUlhk1d" code as "is22532"
    Then Success message should be displayed