package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import pages.HomePage;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();
    @Then("user fills in departure and destination")
    public void user_fills_in_departure_and_destination() {
        // Select departure (Barcelona)
        homePage.homeDepartureBox.click();
        homePage.homeDepartureBox.findElement(By.xpath("//span[text()=' Spain ']")).click();
        homePage.homeDepartureBox.findElement(By.xpath("//span[text()=' Barcelona ']")).click();
        // Select destination (Malaga)
        homePage.homeDestinationBox.findElement(By.xpath("//span[text()=' Spain ']")).click();
        homePage.homeDestinationBox.findElement(By.xpath("//span[text()=' Malaga ']")).click();

        homePage.homeChoseDepartDateBox.findElement(By.xpath("/html/body/ry-tooltip[1]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-flexible-datepicker-container/fsw-datepicker/ry-datepicker-desktop/div[1]/calendar[2]/calendar-body/div[4]/div[1]/div")).click();
        homePage.homeChoseDateReturnBox.findElement(By.xpath("/html/body/ry-tooltip[1]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-flexible-datepicker-container/fsw-datepicker/ry-datepicker-desktop/div[1]/calendar[2]/calendar-body/div[5]/div[1]/div")).click();

        homePage.homeSearchButton.click();



    }}



