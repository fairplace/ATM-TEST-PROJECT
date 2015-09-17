Feature: ATM simultor

Scenario: valid card 

Given I enter an valid "card number" in the ATM
When I click on the "next" button
And I Enter a "valid PIN" number
Then i should see "<4options>" displayed

|4options                                |                               
|Cash withdrawal without receip          |
|Cash withdrawal with receipt            |
|Balance                                 |
|Cancel                                  |

