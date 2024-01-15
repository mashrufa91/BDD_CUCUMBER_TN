@TutorialsNinjaRegistration
Feature: Register Functionality of TutorialsNinja

  @MandatoryFields
  Scenario: Register With Mandatory Fields
  
    Given User navigates to Register page
    When User enters below mandatory fields
      | firstname       | Mashrufa     |
      | lastname        | Shanjia      |
      | telephone       | 585765432    |
      | password        | Mashrufa@123 |
      | confirmpassword | Mashrufa@123 |
      
   And User selects Privacy Policy checkbox
    And User clicks on Continue button
    Then User account gets created successfully
     