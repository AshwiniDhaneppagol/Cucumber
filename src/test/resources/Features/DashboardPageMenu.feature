Feature: Dashboard menu page

  Scenario: user should be able to see Dashboard menu after login
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |

  @wip
  Scenario: user should be able to see Dashboard menu after login
    Given The user is on the login page
#    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    When The user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |