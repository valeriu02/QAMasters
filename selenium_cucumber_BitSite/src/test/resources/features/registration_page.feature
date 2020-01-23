@test_registration_page
Feature: Testing Registration Page
  Testing registratio  page

  Background: 
    Given User is on home page

  Scenario Outline: Title of your scenario outline
    Then Verify Registration button
    Then Check the title of the page
    Then User enter First Name <First Name>
    Then User enter Middle Name <Middle Name>
    Then User enter Last Name <Last Name>
    Then User select gender <Gender>
    Then User eneter Email <Email>
    Then User enter Phone Number <Phone>
    Then User select if he is Authorized to work in US <AUS>
    Then User select if he have Past Programming Experience <PPE>
    And User click on Subbmit Button
    Then Verify submiting by message
    Then User click on Logo

    Examples: 
      | First Name | Middle Name | Last Name   | Gender   | Email                    | Phone        | AUS   | PPE   |
      | "Nicholas" | "Gregory"   | "Thompson"  | "Male"   | "nickthompson@gmail.com" | "9129232390" | "Yes" | "No"  |
      | "Michael"  | "McDonald"  | "Peter"     | "Male"   | "Michael@gmail.com"      | "9129276390" | "Yes" | "Yes" |
      | "Ana"      | "Lora"      | "Mcalister" | "Female" | "Ana@gmail.com"          | "9123232390" | "No"  | "Yes" |
      | "Valeriia" | "Elenea"    | "Bordak"    | "Female" | "Veleria@gmail.com"      | "9129232230" | "No"  | "Yes" |
      | "124"      | "3234"      | "b"         | "Male"   | "324@gmail.com"          | "dsfsdfs"    | "Yes" | "No"  |
