Feature: Verify Item Answer state functionality

  Scenario: Title of your scenario
  		Given navigation to TestNav URL "https://test815-tn8.pearsondev.com/client/index.html"
  		When perform login using username "nf32" and password "bm"
  		And start the test
  		When I navigate to question 1 from Review drop-down
  		And select values from question dropdown indexes 2, 2, 2, 2
  		And click on Review question button
      Then verify answer state for question

When I navigate to question 5 from Review drop-down
  		And select values from question dropdown indexes 2, 3
  		Then check if blanks are filled
  		And click on Review question button
  		Then verify answer state for question
  		
  		When I navigate to question 14 from Review drop-down
  		And check the checkboxes 2
  		And click on Review question button
  		Then verify answer state for question