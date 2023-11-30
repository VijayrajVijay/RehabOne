Feature: Validate all pages in rehab one
  
 Background:
     Given I want to launch rehab page
    Then Enter username and password
    And clickon sign in button


  @tag1
  Scenario: Validate pages in rehab one application
    And validate dashoard page is displayed
    And validate patientCharge page is displayed
    And validate Reports page is displayed
    And validate portal admin access page is displayed

@tag2
  Scenario: Validate departments pages in rehab one application
    And validate dashoard page is displayed
    And validate departments portal page is displayed

  @tag3
  Scenario: Validate patient portal page in rehab one application
    And validate dashoard page is displayed
    And validate patient portal page is displayed
 