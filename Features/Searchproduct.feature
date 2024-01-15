@TutorialsNinjaSearchProduct
Feature: Search Product Functionality of TutorialsNinja

  @ValidProduct
  Scenario: Search with valid product
    Given User opens the application
    When User enters valid product "HP"
    And User clicks on search button
    Then User gets valid product info display in search page