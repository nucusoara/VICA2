Feature: Loghin functionality test
  Scenario: Positive login page testing
    Given user insert username
    And user insert password
    When user cliks on loghin button
    Then user is redirect to homepage
    And user clicks on LogOut button
    And insert valid username
    And insert valid password
