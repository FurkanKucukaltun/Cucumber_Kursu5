#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption         | GradeLevelOption |
#| Math exam is1   | academicPeriod1              | gradeLevel2  |
#| IT exam is1     | academicPeriod1              | gradeLevel3  |
#| Oracle exam is1 | academicPeriod1              | gradeLevel4  |
#| Math exam is2   | academicPeriod1              | gradeLevel5  |


Feature: Multiple Exam Functionality

  Background: # before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Multiple Exam create and delete
    And Click on the element in LeftNav
      | entranceExamsOne  |
      | examsetup         |
      | enteranceExamsTwo |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <ExamName> |

    And Click on the element in DialogContent
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |

    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne  |
      | examsetup         |
      | enteranceExamsTwo |

    And User delete item from Dialog Content
      | <ExamName> |

    Then Success message should be displayed

    Examples:
      | ExamName          | AcademicPeriodOption | GradeLevelOption |
      | Math exam is111   | academicPeriod1      | gradeLevel2      |
      | IT exam is111     | academicPeriod1      | gradeLevel3      |
      | Oracle exam is111 | academicPeriod1      | gradeLevel4      |
      | Math exam is211   | academicPeriod1      | gradeLevel5      |