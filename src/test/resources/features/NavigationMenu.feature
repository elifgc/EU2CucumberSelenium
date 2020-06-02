@navigate
Feature: Navigation Menu

  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    And the user enter sales manager information
    When the user navigates to Fleet, Vehicles
    Then the title should be Vehicles

  Scenario: Navigating Marketing —- Campaigns
    Given the user is on the login page
    And the user enter sales manager information
    When the user navigates Marketing, Campaigns
    Then the title should be Campaigns

  Scenario: Navigating Activities —- Calendar Events
    Given the user is on the login page
    And the user enter sales manager information
    When the user navigates Activities, Calendar Events
    Then the title should be Calendars

