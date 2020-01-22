@test_home_page
Feature: Testing Home Page
  Testing home page

  Background: 
    Given User is on home page

  Scenario: Steps to check Homepage functionalty
    Given check the title
    Then User click on Logo
    Then Verify number of Menu is 5
    Then Verify items of Menu bar
    Then Verify Our Service headers
    And Verify QA Testing Boot Camps Learn More button
    And Verify Software Testing Learn More button
    And Verify Onsite Trainings Learn More button
    Then Verify Our Boot Camps headers
    And Verify Second Registration button
    Then Verify Registration button
    Then Verify Home button
    Then Verify About button
    Then Verify Services button
    Then Verify Boot Camp button
    Then Verify Contanct button
    
