package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageBase {
    public LandingPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mSignUp")
    private WebElement signUpBtn;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/checkConsent")
    private WebElement consentBox;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/read_label")
    private WebElement readLabel;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/btnAccept")
    private WebElement allowAccessBtn;

    public void clickAllowAccessBtn(){
        click(allowAccessBtn);
    }

    public void clickConsentBox(){
        try {
            if (readLabel.isDisplayed())
                click(consentBox);
        }catch (Exception e) {
            System.out.println("Consent page not displayed");
        }
    }

    public void clickSignUpBtn(){
        click(signUpBtn);
    }
}
