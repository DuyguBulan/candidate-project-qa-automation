@Smoke
Feature:ZoomCare scheduling


 @zoomCareScheduling
    Scenario:Verify the functionality of ZoomCare scheduling Page
    Given I'm the home page
    When I click the "Schedule" button
    Then I should see the Scheduling page


   @datePickerModule
   Scenario:Verify the functionality of calendar module
    Given I'm on the scheduling page
    When I click on the "Calendar" module and see the drop down
    And  I select "11/02/2022"
    Then  I will be able to navigate to doctor selection page

  @schedulingOptionModule
   Scenario:Verify the functionality of schedule page
    Given I'm on the scheduling page
    Then Illness Injury option should be selected by default on the Services drop down menu


   @validateLocationModule
    Scenario: Validate the location module function
    Given I'm on the scheduling page
    When I click on the location module
    Then I will be able to see the other location options Portland Area

     #