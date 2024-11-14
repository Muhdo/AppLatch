package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {
    public RegisterPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mEdtName")
    private WebElement parentNameField;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mEdtEmail")
    private WebElement emailField;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mEdtPassword")
    private WebElement passwordField;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mCheckBoxMarketing")
    private WebElement tickToReceiveMarketingEmail;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mBtnRegister")
    private WebElement registerBtn;


    public void clickRegisterBtn(){
        click(registerBtn);
    }

    public void clickTickToReceiveMarketingEmail(){
        click(tickToReceiveMarketingEmail);
    }

    public void inputPassword(String text){
        enterText(passwordField, text);
    }

    public void inputEmail(String text){
        enterText(emailField, text);
    }

    public void inputParentName(String text){
        enterText(parentNameField, text);
    }
}
