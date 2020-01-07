@Math
Feature: Simple math

  @TC1
  Scenario: Add two numbers

    When number 2 is added to 3
    Then operation result is 5
    And operation result square is 25
    And accumulative result is 5

  @TC2
  Scenario: Add other two numbers

    When number 7 is added to 8
    Then operation result is 15
    And operation result square is 225
    And accumulative result is 15

  @TC3
  Scenario: Add other two numbers

    When number 4 is added to 5
    Then operation result is 9
    And operation result square is 81
    And accumulative result is 9

  @TC4
  Scenario: Add other two numbers

    When number 2 is added to 2
    Then operation result is 4
    And operation result square is 16
    And accumulative result is 4