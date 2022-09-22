package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SelectFlightPage {

    public SelectFlightPage(){ PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//button[text()=' Select ']")
    public WebElement selectDepartureBox;

    @FindBy(css= "html>body>app-root>flights-root>div>div>div>div>flights-lazy-content>flights-summary-container>flights-summary>div>div:nth-of-type(2)>journey-container>journey>flight-list>div>flight-card>div>div>div:nth-of-type(3)>button")
    public WebElement selectReturnBox;

    @FindBy(xpath = "//button[contains(@class,'fare-card__button fare-card__price')]")
    public WebElement valuePriceBox;

    @FindBy(xpath = "//*[@id=\"ry-modal-portal\"]/div/fare-upgrade-container/fare-upgrade-component/ry-dialog/div/div/div[3]/button[2]")
    public WebElement continueWithValueFare;
}

