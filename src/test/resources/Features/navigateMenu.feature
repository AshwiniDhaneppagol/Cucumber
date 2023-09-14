  #Scenario 1:
#Login as Teacher
#At first get the text of welcome
#Then go to Developers menu and get the text of Developers

#Scenario 2:
#Login as Teacher
#Get the text of welcome
#Then go to All Posts menu and get the text of Posts
#Then go to All Posts menu and get the t of Posts

#Scenario 3:
#Login as Teacher
#Get the text of welcome
#Then go to My Account menu and get the text of Dashboard

#Create new feature file which is navigateMenu
#Write scenarios
#Create step definitions
#Implement step definitions by adding printLn


  Feature: EuroTech navigateMenu Tests

    Background:
      Given The user Logged in as Teacher
      Then The user get the text of welcome

    @NavigateMenu
    Scenario: 1
   #   Given The user Logged in as Teacher
    #  Then  The user get the text of welcome
      When  user go to Developers Menu
      Then The user should be able get the text of Developers

    @NavigateMenu
    Scenario: 2
    #  Given The user Logged in as Teacher
    #  Then The user get the text of welcome
      When The user go to All Posts menu
      Then The user get the text of Posts
      When The user go to All Posts menu
      Then The user get the text of Posts

    @NavigateMenu
    Scenario: 3
   #   Given The user Logged in as Teacher
   #   Then The user get the text of welcome
      When The user go to My Account menu
      Then The user get the text of Dashboard

