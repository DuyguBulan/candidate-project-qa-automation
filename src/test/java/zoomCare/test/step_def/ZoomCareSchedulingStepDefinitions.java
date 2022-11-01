package zoomCare.test.step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import zoomCare.test.pages.BasePage;
import zoomCare.test.pages.SchedulingPage;
import zoomCare.test.utilities.ConfigurationReader;
import zoomCare.test.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ZoomCareSchedulingStepDefinitions {

    BasePage basePage = new BasePage();
    SchedulingPage schedulingPage = new SchedulingPage();

    @Given("I'm the home page")
    public void i_m_the_home_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
// title verify the zoomCare page first
    }
    @When("I click the {string} button")
    public void i_click_the_button(String buttonName) {
        basePage.schedulingButton.click();
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals("Schedule | ZoomCare", Driver.getDriver().getTitle().toString());
    }
    @Then("I should see the Scheduling page")
    public void i_should_see_the_scheduling_page()  {
        schedulingPage.calendarDropdownMenu.click();
        schedulingPage.illnessDropDownButton.click();
        schedulingPage.illnessInjuryDropDownDelection.click();
        // verifying that the expected result is String which is the expected result  and what you see on the page

    }


    @Given("I'm on the scheduling page")
    public void im_on_the_schedule_page () {
            Driver.getDriver().get(ConfigurationReader.getProperty("url.schedule"));
        }

        @When("I click on the {string} module and see the drop down")
        public void iClickOnTheModuleAndSeeTheDropDown (String arg){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        schedulingPage.calendarDropdownMenu.click();


        }

        @And("I select {string}")
        public void iSelect (String arg){
        Driver.getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         schedulingPage.LocationOfNovSecond.click();

        }


        @Then("I will be able to navigate to doctor selection page")
        public void i_will_be_able_to_navigate_to_doctor_selection_page() {
       Assert.assertEquals("I will be able to navigate to doctor selection page", schedulingPage.landingPageForDatePicker.getText());
    }




        @When("I click on the location module")
        public void iClickOnTheLocationModule () {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        schedulingPage.locationButton.click();
        }

        @Then("I will be able to see the other location options Portland Area")
        public void iWillBeAbleToSeeTheOtherLocationOptions () {
        Assert.assertEquals("Portland Area",schedulingPage.portlandArea.getText());
        }



    @Then("Illness Injury option should be selected by default on the Services drop down menu")
    public void iiinessInjuryOptionShouldBeSelectedByDefaultOnTheServicesDropDownMenu() {
        Assert.assertEquals("Illness/Injury",schedulingPage.illnessInjuryDropDownDelection.getText());
    }

}


