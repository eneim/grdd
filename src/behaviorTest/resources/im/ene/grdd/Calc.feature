Feature: I would like to verify my calculator

  Scenario: I want to test a plus of two doubles
    Given I have two double: 9 and 1.5
    When I call a plus of them
    Then I should have the result of 10.5