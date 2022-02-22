Feature: Redirect to Apple product page

  Scenario: Check Apple technique button on the main page
    Given I launch the chrome browser
    When I openTouch home page
    Then I verify that Apple technique button presents on the page
    And Close browser