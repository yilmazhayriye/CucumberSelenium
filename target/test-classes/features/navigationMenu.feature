@wip
Feature: Navigation Menu

  @car
  Scenario: Navigate Fleet --> Vehicle
    Given The user is on the login Page
    When  The user enters username and password and login button
    When The user navigates to Fleet,Vehicles
    Then The title contains Car
  @db
  Scenario: Navigate Marketing ->Campaigns
    Given The user is on the login Page
    When  The user enters username and password and login button
    When The user navigates to Marketing,Campaigns
    Then The title contains Campaigns
  @calendar
  Scenario: Navigate Activities -> Calendar Events
    Given The user is on the login Page
    When  The user enters username and password and login button
    When The user navigates to Activities -> Calendar Events
    Then The title contains Calendar Events
