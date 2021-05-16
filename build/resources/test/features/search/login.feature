Feature: Login into the application
  Scenario: Successful login
    Given Prueba has an active account
    When he sends their valid credentials
    Then he should have access to manage his account