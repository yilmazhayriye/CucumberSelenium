Feature: Contacts page
@number
  Scenario:Default page number
  Given The user is on the login Page
  When  The user enters username and password and login button
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1