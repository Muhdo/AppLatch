package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProfilePage extends PageBase {
    public AddProfilePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mEdtFirstName")
    private WebElement firstName;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mEdtDeviceType")
    private WebElement deviceType;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mEditDateOfBirth")
    private WebElement DOB;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mBtnAddDevice")
    private WebElement createANewChildProfileBtn;

    @FindBy(xpath = "net.apptimist.applatchkidsandroid:id/both_features")
    private WebElement feedback;

    @FindBy(id = "net.apptimist.applatchkidsandroid:id/mShareFeedback")
    private WebElement shareFeedBackBtn;

    public void clickShareFeedBackBtn(){
        click(shareFeedBackBtn);
    }

    public void clickFeedback(){
        click(feedback);
    }

    public void clickCreateANewChildProfileBtn(){
        click(createANewChildProfileBtn);
    }

    public void inputDOB(String text){
        enterText(DOB, text);
    }

    public void inputFirstName(String text){
        enterText(firstName, text);
    }

    public void inputDeviceType(String text){
        enterText(deviceType,text);
    }


}
