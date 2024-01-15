@TutorialsNinjaLogout
Feature: Logout functionality of TutorialsNinja


  @ValidCredentials
  Scenario: Logout from the accountpage
    Given User goes to LoginPage
    When User enters valid email address for logout 'mashrufa100@gmail.com'
    And User enters a valid password for logout 'Mashrufa100'
    When User clicks Login 
    Then User is directed to AccountPage
    When User clicks on MyAccount 
    And User clicks on LogOut Button
    Then User is navigated to logout page
    
    
    