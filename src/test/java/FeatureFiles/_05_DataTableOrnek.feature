Feature: DataTable Ornek

  Scenario: User List
    When Write username "furkan"
    And Write username and Password "furkan" and "1234"
    And Write username as DataTable
      | zahid  |
      | furkan |
      | seyda  |
      | agah   |

    And Write username and password as DataTable
      | zahid  | 1236 |
      | furkan | 1234 |
      | seyda  | 1258 |
      | agah   | 2568 |