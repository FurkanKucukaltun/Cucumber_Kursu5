Feature: Citizenship Functionality,

  Background: # before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed

    Examples:
      |  name     | short  |
      |  fursey13 | fuse13 |
      |  fursey23 | fuse23 |
      |  fursey33 | fuse33 |
      |  fursey43 | fuse43 |

