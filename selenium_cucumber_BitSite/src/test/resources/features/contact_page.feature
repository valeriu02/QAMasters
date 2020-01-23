@test_contact_page
Feature: Testing Contact Page
  I want to use this to test contact page fanctionality

  Background: 
    Given User is on home page
    Then Verify Contanct button

  Scenario Outline: Title of your scenario outline
    Given First user enters required <Your Name>
    When Second user enters required <Your Email>
    Then Third user enters <Subject>
    When Forth user enters <Your Message>
    When user send contact
    Then Verifies "Thank you"
    Then Chck Contact Info
    
    Examples: 
      | Your Name    | Your Email          | Subject      | Your Message  |
      | "Igor Shend" | "ishend1@gmail.com" | "My subject" | "Bla Bla Bla" |
      | "123"        | "1@gmail.com"       | "123"        | "123"         |
      | "123 Igor"   | "2@gmail.com"       | ""           | ""            |
