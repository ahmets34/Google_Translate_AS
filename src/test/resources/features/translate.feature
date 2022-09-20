Feature:Verification for the translation



    Scenario Outline: translate the german word to spanish word
      Given user is on the homepage
      When user chose the german language

      And user enters "<german word>"
      Then user sees the verify "<spanish word>"
      Examples:
      |german word|spanish word|
      |Demokratien|Democracias|

Scenario:swap the words and verify
  And user swap the word
  Then user sees the verify the swapped word "Demokratie"

  Scenario:write a word with screen keyboard
   And user click clear button
   And user open the screen keyboard and enter Hi!
    Then verify the "Hi!"
