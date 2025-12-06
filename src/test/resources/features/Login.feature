@Regression
Feature: Login API

  Scenario: Successful login
    Given user prepare email login payload "eve.holt@reqres.in"
    When user prepare password login payload "cityslicka"
    Then user sends POST request to "/api/login"
    And response status should be 200