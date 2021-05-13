Feature: Binary Search
  As a user
  I want to use divide and operators to calculate numerical expressions


  Scenario Outline: calculate expression <first> <opt> <second>
    Given I have a Calculator
    When I ask value of <first> <opt> <second>
    Then I should be told <result>

    Examples:
      | first | second | opt        | result |
      | 6     | 2      | /          | 3   |
      | 6     | 2      | ^          | 36   |

