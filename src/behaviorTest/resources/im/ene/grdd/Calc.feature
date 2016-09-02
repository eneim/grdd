Feature: I would like to verify my calculator

  Scenario: I want to test a plus of two doubles
    Given I have two double: 9 and 1.5
    When I call a plus of them
    Then I should have the result of 10.5

  Scenario Outline: I want to test a subtraction of two doubles.
    Given There are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat | left |
      |  12   |  5  |  7   |
      |  20   |  5  |  15  |
