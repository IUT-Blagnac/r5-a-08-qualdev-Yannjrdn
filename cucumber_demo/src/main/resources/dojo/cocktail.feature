Feature: Cocktail Ordering

  As Romeo, I want to offer a drink to Juliette so that we can discuss together (and maybe more).

  Scenario: Creating an empty order
    Given <nameX> who wants to buy a drink
    When  an order is declared for <nameZ>
    Then  there is <n> cocktail in the order

    Examples:
      | nameX          | nameZ     | n  |
      | Romeo          | Juliette  | 3  |
      | Sonic          | Shadow    | 2  |
      | SuperMario     | SuperLuigi| 1  |
    