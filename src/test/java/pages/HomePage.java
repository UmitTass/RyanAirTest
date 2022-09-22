package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    // in general in pages package I used page object patterns to localize different WebElements to work with them
    // afterwards in the stepdefinitions package.

    public HomePage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "input-button__departure")
    public WebElement homeDepartureBox;

    @FindBy(id = "input-button__destination")
    public WebElement homeDestinationBox;

    @FindBy(xpath ="/html/body/hp-app-root/hp-home-container/hp-home/hp-search-widget-container/hp-search-widget/div/hp-flight-search-widget-container/fsw-flight-search-widget-container/fsw-flight-search-widget/div/fsw-flight-search-widget-controls-container/fsw-flight-search-widget-controls/div[2]/div/fsw-input-button[1]")
    public WebElement homeChoseDepartDateBox;

    @FindBy(xpath = "//div[normalize-space()='Return']")
    public WebElement homeChoseDateReturnBox;

    @FindBy(xpath = "//button[@aria-label='Search']")
    public WebElement homeSearchButton;

}


