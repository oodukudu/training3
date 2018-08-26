Feature: Registration using examples
  This is a test for the registration page

  Scenario Outline: Valid Registration
    Given I navigate to the site
    When I click on register link
    And I enter firstname "<firstname>"
    And I enter lastname "<lastname>"
    And I enter email address "<email>"
    And I enter password "<password>"
    And I confirm password "<confirmpassword>"
    And I click on signup
    Then I should be registered


    Examples:
    |firstname|lastname|email|password|confirmpassword|
    |Seun|Odukudu|oodukudu@gmail.com|adebola2|adebola2|
