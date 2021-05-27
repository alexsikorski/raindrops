Feature: Output 'Pling' 'Plang' 'Plong'
  As a PlingPlangPlong enthusiast, I want to output 'Pling' 'Plang' 'Plong' individually or
  concatenated depending on if the input number is a factor of 3, 5, 7 so that I can display
  my programming and testing practice.

  Scenario: Using plingPlangPlong method with numbers that only has a factor of 3
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 3
    Then I return "Pling"

  Scenario: Using plingPlangPlong method with numbers that only has a factor of 5
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 5
    Then I return "Plang"

  Scenario: Using plingPlangPlong method with numbers that only has a factor of 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 7
    Then I return "Plong"

  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3 and 5
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 15
    Then I return "PlingPlang"

  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 21
    Then I return "PlingPlong"

  Scenario: Using plingPlangPlong method with numbers that only have a factor of 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 35
    Then I return "PlangPlong"

  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3, 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 105
    Then I return "PlingPlangPlong"