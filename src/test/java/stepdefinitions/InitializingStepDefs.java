package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utilities.ConfigurationReader;
import utilities.Driver;

public class InitializingStepDefs {


    @Given("user is on the RyanAir Homepage")
    public void user_is_on_the_ryan_air_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("ryanair_url"));
    }

    @When("accept cookie pop-up")
    public void accept_cookie_pop_up() {
        Driver.getDriver().findElement(By.className("cookie-popup-with-overlay__button")).click();
    }


}

