Feature: Navigate to menu with parameters

  Background:
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"

  @wip
  Scenario: User navigates to Developers Menu
    And The user navigates to "All Posts" menu
    Then The should be able to see header as "Posts"


  Scenario: User navigates to My Account Menu
    And The user navigates to "My Account" menu
    Then The should be able to see header as "Dashboard"

    # create a scenario outline covering the above 2 scenario

  @smoke
  Scenario Outline: User navigates to different menu and verify the header
    And The user navigates to "<menu>" menu
    Then The should be able to see header as "<header>"

    Examples:
      | menu       | header    |
      | All Posts  | Posts    |
      | My Account | Dashboard |


    #Homework
  #Create a new feature file named "NegativeLoginTest"