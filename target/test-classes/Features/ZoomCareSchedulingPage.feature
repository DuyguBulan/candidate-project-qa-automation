Feature:ZoomCare scheduling

  #TC_ZC_Scheduling_001
 @zoomCareScheduling
    Scenario:Verify the functionality of ZoomCare scheduling Page
    Given I'm the home page
    When I click the "Schedule" button
    Then I should see the Scheduling page


   #TC_ZC_Scheduling_007
   @datePickerModule
   Scenario:Verify the functionality of calendar module
    Given I'm on the scheduling page
    When I click on the "Calendar" module and see the drop down
    And  I select "11/02/2022"
    Then  I will be able to navigate to doctor selection page

  @schedulingOptionModule
  Scenario:Verify the functionality of schedule page
    Given I'm on the scheduling page
    And Illness Injury option should be selected by default on the Services drop down menu
    Then I should be able see the next available dates displayed

   #TC_ZC_Scheduling_008
   @validateLocationModule
    Scenario: Validate the location module function
    Given I'm on the scheduling page
    When I click on the location module
    Then I will be able to see the other location options Portland Area