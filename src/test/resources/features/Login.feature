@login
Feature: Users should be able to login
  @driver @smoke @VYT-123
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enter the driver information
    Then the user should be able to login
  @sales_manager @VYT-123 @wip
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enter sales manager information
    Then the user should be able to login
  @store_manager @smoke
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enter store manager information
    Then the user should be able to login



