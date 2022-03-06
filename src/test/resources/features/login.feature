Feature: Login
  This tests the login page on giftrete site

  Scenario: Valid Login
    Given I navigate to the site
    When I click on login link
    And I enter the email address
    And I enter the password
    And I click on secure login
    Then I am logged in

  Scenario: Invalid Login
    Given I navigate to the site
    When I click on login link
    And I enter the email address
    And I enter the invalid password
    And I click on secure login
    Then I should not be able to login

#  Scenario: TBC
    Given I navigate to the site
    When I click on login link
    And I enter the email address
    And I enter the invalid password
    And I click on secure login
    Then I should not be able to login