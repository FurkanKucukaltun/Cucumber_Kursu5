Feature: DataTable Functionality,

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | fursey24 |
      | codeInput | 12351    |

    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | fursey24 |

  @Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | fursey2dsds4 |

    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | fursey2dsds4 |

  @Regression
  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | fursey1111124 |
      | codeInput       | 12351         |
      | integrationCode | 44            |
      | priority        | 555           |

    And Click on the element in DialogContent
      | toggleBar |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | fursey1111124 |

    Then Success message should be displayed