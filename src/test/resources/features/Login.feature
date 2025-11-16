@Regression
Feature: Login API

  Scenario: Successful login
    Given user prepare header request x-api-key "reqres-free-v1"
    When user prepare email login payload "eve.holt@reqres.in"
    Then user prepare password login payload "cityslicka"
    And user sends POST request to "/api/login"
    And response status should be 200