
@test_home_page
Feature: Testing Home Page
  Testing home page
  
    Background:
  Given User is on home page

  Scenario: 
    Given check the title
    Then  User click on Logo
    Then Verify number of Menu is 5
    Then Verify items of Menu bar
    Then Verify Registration button 
    Then Verify Our Service headers
    And Verify Learn More button
    Then Verify Our Boot Camps headers
    And Verify Second Registration button

