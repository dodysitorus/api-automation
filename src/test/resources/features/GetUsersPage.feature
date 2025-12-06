@Regression1
Feature: Get Users Page

  Scenario: Successfully get users page
    Given user sends GET request to "/api/users?page=1"
    And response status get users page should be 200