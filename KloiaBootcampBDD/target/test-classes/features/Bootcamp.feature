Feature: bootcamp tests

  Background:
    Given homepage is open
    And I close the pop up

  Scenario: logo verification
    Then logo should be displayed

  Scenario: search result test
    When I search for "shoes"
    Then search result "shoes" should be seen

  Scenario: sign in page verification
    And I open the "Account" dropdown menu
    When I choose "Account" submenu
    Then sign in page should open

  Scenario: credit card application page test
    When I open my best buy credit card page
    And I open application page
    Then application page should be open
