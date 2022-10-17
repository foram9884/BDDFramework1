Feature: Nopcommerce Login

  Background:
    Given User able to open browser
    And Enter Url

  Scenario: Nopcommerce Valid Login Test
    Then User click on login Link
    And User on login page and  verify login page title
    When User enter username and password and click on login button
    Then User is on Home page
    Then User close the browser
