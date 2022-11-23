Feature: Ebebek Product Search Add Show

  Scenario: A search is made for "biberon" and the first product is added to the cart and checked.
    Given Open the home page
    And type biberon in the search bar
    Then Search
    And Click on first product
    Then Click the Add to Cart button
    Then Click on View Cart button
    Then Check that the product has been added to the cart