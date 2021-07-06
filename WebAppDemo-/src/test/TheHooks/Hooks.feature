Feature: Test user login functionality

  Scenario: Chack login successful
    Given user in login page
    When user enter username and password
    And Click on login button
    Then user in home page
