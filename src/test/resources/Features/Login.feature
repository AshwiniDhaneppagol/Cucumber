Feature: EuroTech Login Tests

  Background:
    Given The user is on the login page

  @Teacher @smoke @login
  Scenario: Login As Teacher
  #  Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  @Student @login @smoke
  Scenario: Login As Student
    #Pre condition
  #  Given The user is on the login page

    #when is representing action time
    When The user enters student credentials

    #Then is our verification part
    Then The user should be able to login

  @Developer @smoke
  Scenario: Login As Developer
  #  Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login

