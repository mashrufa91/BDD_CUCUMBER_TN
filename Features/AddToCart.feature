@TutorialsNinjaAddToCart
Feature: Add to Cart Functionality of TutorialsNinja

  @AddValidProduct
  Scenario: Adding a product to the cart
  
    Given User opens the application for add to cart
    When User enters valid product in the search box "HP"
    And User clicks on the search button for add to cart
    Then User gets valid product info displayed
    When User clicks on Add to Cart Button
    And User clicks on Add to Cart button for checkout
    Then product gets added to the cart