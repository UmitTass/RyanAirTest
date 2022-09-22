package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LogInPage;


public class LogInPageStepDefs {

    LogInPage logInPage = new LogInPage();

    @Then("user does log in")
    public void user_does_log_in() {
        logInPage.logInButton.click();
        logInPage.emailBox.sendKeys("umittas2121@proton.me");
        logInPage.passwordBox.sendKeys("Umittas2121");
        logInPage.logInStep.click();




    }
}
