package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @After
    // runs after all scenario and if it fails it takes a screenshot
    public void tearDown (Scenario scenario){
        //  System.out.println("This is after method");
        if (scenario.isFailed()) {
            // when test case fails , then attach the screenshot to the html report
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
    }
}
