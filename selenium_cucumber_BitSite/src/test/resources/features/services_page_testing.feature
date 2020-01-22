@test_services_page
Feature: Testing Services Page
  Testing Services page

  Background: 
    Given User is on home page

  Scenario: 
    Then Verify Services button
    Then Verify Our Services header
    Then Verify QA header "QA Engineer Boot Camps"
    Then Verify QA Engineer Boot Camps list element "Switch career and become a successful QA Engineer"
    Then Verify Register Now button
    Then Verify Software Testing list element "Web services Testing"
    Then Onsite Trainings list element "Agile Training"
    Then User click on Logo

 
