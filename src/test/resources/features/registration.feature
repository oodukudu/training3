Feature: Registration
  This is a test for the registration page

  Scenario: Valid Registration
    Given I navigate to the site
    When I click on register link
    And I enter firstname "Seun"
    And I enter lastname "Odukudu"
    And I enter email address "oodukudu@gmail.com"
    And I enter password "adebola2"
    And I confirm password "adebola2"
    And I click on signup
    Then I should be registered