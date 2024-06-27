Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters username "testruedata@Ruedatatest.com" and password "Compu123."
    And User clicks on the login button
    Then User is redirected to the homepage