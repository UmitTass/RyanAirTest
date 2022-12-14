package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogInPage {


    public LogInPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//button[contains(@class,'ry-button--full login-touchpoint__login-button')]")
    public WebElement logInButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[contains(@class,'auth-submit__button ry-button--full')]")
    public WebElement logInStep;
}
