@smoke
Feature: Users should be able to login

  Scenario: Login as a driver

    Given The user is on the login Page
    When  The user enters username and password and login button
    Then  The user should be able to login


  Scenario: Login as a sales manager

    Given The user is on the login Page
    When  The user enters sales manager username and password and login button
    Then  The user should be able to login

  Scenario: Login as a store manager

    Given The user is on the login Page
    When  The user enters store manager username and password and login button
    Then  The user should be able to login