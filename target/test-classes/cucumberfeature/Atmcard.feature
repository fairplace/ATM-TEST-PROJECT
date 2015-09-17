Feature: card holder at the ATM

Scenario: Invalid card

Given I enter an invalid "card number"  in the ATM
Then the card is reject and exit

Scenario: valid card invalid PIN number

Given I enter an valid "card"card number" number" in the ATM
When Enter a "invalid PIN" 3 times
Then the ATM keeps card 



Scenario: valid card 

Given I enter an valid "card number" in the ATM
When I click on the "next" button
And I Enter a "valid PIN" number
Then i should see "<4options>" displayed

Example:
|4options|
||results                                |
|Invalid |Cash withdrawal without receipt|
| Valid |Cash withdrawal with receipt    |
|Balance                                 |
|Cancel                                  |






 
   
