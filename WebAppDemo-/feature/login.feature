Feature: Test user login functionality

  Scenario: Chack login successful
    Given user on login page
    When user enter username and password
    And Click on login button
    Then user is on home page
