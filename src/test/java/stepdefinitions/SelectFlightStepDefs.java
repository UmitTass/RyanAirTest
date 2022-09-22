package stepdefinitions;

import io.cucumber.java.en.*;
import pages.SelectFlightPage;

public class SelectFlightStepDefs {

    SelectFlightPage selectFlightPage = new SelectFlightPage();
//After creating page object patterns we can use different methods to finish our following steps.
    @Then("user selects the flight options")
    public void user_selects_the_flight_options() {
        selectFlightPage.selectDepartureBox.click();
        selectFlightPage.selectReturnBox.click();
        selectFlightPage.valuePriceBox.click();
        //selectFlightPage.continueWithValueFare.click(); //Sometimes it shows up --> in this case not, so i just closed this command
    }


}
