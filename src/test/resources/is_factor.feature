Feature: Output 'Pling' 'Plang' 'Plong'
  As a PlingPlangPlong enthusiast, I want to output 'Pling' 'Plang' 'Plong' individually or
  concatenated depending on if the input number is a factor of 3, 5, 7 so that I can display
  my programming and testing practice.

  Scenario: Using plingPlangPlong method with numbers that only have a factor of 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method
    And I enter 7 as the input
    Then I return "Pling"
