package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WhosePhonePage extends PageBase {
    public WhosePhonePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text=\"Parent Device\"]")
    private WebElement parentDevice;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Whose phone is this?\"]")
    private WebElement whosePhoneText;

    public String getWhosePhoneText(){
        return whosePhoneText.getText();
    }

    public void clickParentDevice(){
        click(parentDevice);
    }
}
