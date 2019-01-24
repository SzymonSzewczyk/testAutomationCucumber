Feature: Flight options test
  Sample tests displayed flight options data

  Background:
    Given Blazedemo choose flight page opened

  Scenario: Verify flights price
    When Flight picked up from "Portland" to "Berlin"
    Then Displayed price for "Lufthansa" is "$233.98"


  Scenario Outline: Verify that flight Airline is correct for Flight #
    When Flight picked up from "Portland" to "Berlin"
    Then Displayed "<Airline>" for "<FlightNo>"
    Examples:
      | FlightNo | Airline         |
      | 234      | United Airlines |
      | 9696     | Aer Lingus      |
      | 4346     | Lufthansa       |
