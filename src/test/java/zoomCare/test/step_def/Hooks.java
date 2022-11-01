package zoomCare.test.step_def;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import zoomCare.test.utilities.ConfigurationReader;
import zoomCare.test.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setupScenario() {
        System.out.println("Before scenario runs");
        Driver.getDriver().manage().window().fullscreen();

        //Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("After scenario runs");
        if (scenario.isFailed()){
            byte[]screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }
}

//

