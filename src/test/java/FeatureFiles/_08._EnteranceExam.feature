#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: Exam Functionality

  Background: # before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Exam create and delete
    And Click on the element in LeftNav
      | entranceExamsOne  |
      | examsetup         |
      | enteranceExamsTwo |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | furexam3 |

    And Click on the element in DialogContent
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne  |
      | examsetup         |
      | enteranceExamsTwo |

    And User delete item from Dialog Content
      | furexam3 |

    Then Success message should be displayed