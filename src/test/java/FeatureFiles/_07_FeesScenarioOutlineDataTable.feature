#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fee multiple values Functionality

  Background: # before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intcode>  |
      | priority        | <priority> |

    And Click on the element in DialogContent
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Success message should be displayed

    Examples:
      | name | code | intcode  | priority |
      | fur1 | 1111 | payPal   | 666      |
      | fur2 | 2222 | cash     | 777      |
      | fur3 | 3333 | cheque   | 888      |
      | fur4 | 4444 | applePay | 999      |
      | fur5 | 5555 | crypto   | 001      |