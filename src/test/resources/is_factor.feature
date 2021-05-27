Feature: Output 'Pling' 'Plang' 'Plong'
  As a PlingPlangPlong enthusiast, I want to output 'Pling' 'Plang' 'Plong' individually or
  concatenated depending on if the input number is a factor of 3, 5, 7 so that I can display
  my programming and testing practice.

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with a number that only has a factor of 3
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 3
    Then I return "Pling"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with a number that only has a factor of 5
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 5
    Then I return "Plang"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with a number that only has a factor of 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 7
    Then I return "Plong"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3 and 5
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 15
    Then I return "PlingPlang"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 21
    Then I return "PlingPlong"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with numbers that only have a factor of 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 35
    Then I return "PlangPlong"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3, 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 105
    Then I return "PlingPlangPlong"

  @ValidPositiveNumberTests
  Scenario: Using plingPlangPlong method with numbers that only have a factor of 3, 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 105
    Then I return "PlingPlangPlong"

  @InvalidNumberTests
  Scenario: Using plingPlangPlong method with a number that do not have factors of 3, 5 or 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 34
    Then I return "34"

  @InvalidNumberTests
  Scenario: Using plingPlangPlong method with a number that do not have factors of 3, 5 or 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input 0
    Then I return "0"

  @InvalidNumberTests
  Scenario: Using plingPlangPlong method with a number that do not have factors of 3, 5 or 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -11
    Then I return "-11"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only has a factor of 3
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -3
    Then I return "Pling"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only has a factor of 5
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -25
    Then I return "Plang"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only has a factor of 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -14
    Then I return "Plong"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only have factor of 3 and 5
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -30
    Then I return "PlingPlang"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only have factor of 3 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -42
    Then I return "PlingPlong"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only have factor of 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -70
    Then I return "PlangPlong"

  @ValidNegativeNumberTests
  Scenario: Using plingPlangPlong method with a negative number that only have factor of 3, 5 and 7
    Given I create an instance of Raindrops
    When I use the plingPlangPlong method with the input -210
    Then I return "PlingPlangPlong"
