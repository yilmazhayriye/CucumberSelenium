Feature: Account Type

  Scenario: Driver user
    Given The user logged in as a "driver"
    When The user navigates to "Activities" "Calendar Events"
    Then The title contains "Calendar Events - Activities"

  Scenario: Sales Manager
    Given The user logged in as a "sales manager"
    When The user navigates to "Customers" "Accounts"
    Then The title contains "Accounts - Customer"

  Scenario: Store Manager
    Given The user logged in as a "store manager"
    When The user navigates to "Customers" "Contacts"
    Then The title contains "Contacts - Customer"
