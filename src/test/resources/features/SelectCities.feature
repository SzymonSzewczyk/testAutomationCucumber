Feature: Selecting cities test
  Sample tests for selecting cities to flight

  Background:
    Given Blazedemo choose flight page opened

  Scenario Outline: Verify that flights for proper cities are displayed
    When Flight picked up from "<From>" to "<To>"
    Then Text is displayed: Flights from "<From>" to "<To>"
    Examples:
      | From      | To     |
      | Portland  | Rome   |
      | Boston    | Rome   |
      | San Diego | Rome   |
      | San Diego | London |
      | San Diego | Cairo  |





