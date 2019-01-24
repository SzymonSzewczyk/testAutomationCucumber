Feature: User form test
  Tests checking user form fields

  Background:
    Given Flight picked from "San Diego" to "Cairo" with flight 1 selected

  Scenario:  Do not fill the form, just Submit
    When Submit without filling the form
    Then Form not filled text is displayed

  Scenario Outline: Fill the form and Submit
    When Purchase form is submitted using "<Name>" "<Address>" "<City>" "<State>"
    Then Form is submitted for the correct data "<Name>" "<Address>" "<City>" "<State>"
    Examples:
      | Name            | Address      | City      | State       |
      | Jan Nowak       | Nadwodnia 18 | Nowy Targ | małopolskie |
      | Grażyna Belicka | Biedna 12    | Warszawa  | mazowieckie |
      | Paweł Rolnik    | Długa 1      | Kraków    | małopolskie |




