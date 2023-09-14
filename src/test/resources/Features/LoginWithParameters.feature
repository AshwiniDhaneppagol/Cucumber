Feature: Login as different user



  @wip
  Scenario: Login as teacher with parameter
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The welcome message contains "Teacher"

  @wip
  Scenario: Login as a student with parameters
    Given The user is on the login page
    When The user logs in using "emrah@gmail.com" and "emrah12345"
    Then The user should be able to login
    Then The welcome message contains "Emrah"