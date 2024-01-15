@TutorialsNinjaLogin
Feature: Login functionality of TutorialsNinja


  @ValidCredentials
  Scenario: Login with valid credentials
    Given User navigates to LoginPage
    When User enters valid email 'mashrufashanjia100@gmail.com'
    And User enters valid password 'Mashrufa@123'
    And User clicks on Login Button
    Then User is navigated to AccountPage