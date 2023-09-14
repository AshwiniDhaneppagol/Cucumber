Feature: Negative Login Test

  @smoke
  Scenario Outline: Negative Login Test DevEx
    Given The user is on the login page
    When  The user logs in using "<username>" and "<password>"
    Then The warning message contains "<message>"
    Examples:
      | username           | password                   | message                                                                                  |
      | eurotech@gmail.com | 1                          | Please lengthen this text to 6 characters or more (you are currently using 1 character). |
      | eurotech           | 1                          | Please include an '@' in the email address. 'eurotech' is missing an '@'.                |
      | eurotech@          | 1                          | Please enter a part following '@'. 'eurotech@' is incomplete.                            |
      | eurotech@@@        | 1                          | A part following '@' should not contain the symbol '@'.                                  |
      | eurotech@gmail.com | Tesfhdjkfhkjdshfkjdhkjshfk | Invalid Credentials                                                                     |
    #  | euro@gmail         | Tesfhdjkfhkjdshfkjdhkjshfk | Please include a valid email!                                                            |
