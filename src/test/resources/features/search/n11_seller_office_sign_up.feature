Feature: n11 seller office sign up

  Scenario: seller office sign up
    Given user launch browser and open the sign up page
    When user signed in seller office with valid credentials without clicking the contract box
    Then user sees error message
