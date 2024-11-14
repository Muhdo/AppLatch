package Tests;

import BaseClasses.TestBase;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signUpTest extends TestBase {
    LandingPage landingPage;
    RegisterPage registerPage;
    WhosePhonePage whosePhonePage;
    AddProfilePage addProfilePage;

    public void initializer(){
        landingPage = new LandingPage(androidDriver);
        registerPage = new RegisterPage(androidDriver);
        whosePhonePage = new WhosePhonePage(androidDriver);
        addProfilePage = new AddProfilePage(androidDriver);
    }
    @Test(priority = 1)
    public void TC01 (){
        initializer();
        landingPage.clickSignUpBtn();
        landingPage.clickConsentBox();
        landingPage.clickAllowAccessBtn();
        registerPage.inputParentName(testData.getProperty("ParentName")); //should make random
        registerPage.inputEmail(testData.getProperty("email")); // should also be random
        registerPage.inputPassword(testData.getProperty("password"));
        registerPage.clickTickToReceiveMarketingEmail(); //can be optional I think
        registerPage.clickRegisterBtn();
        Assert.assertEquals(whosePhonePage.getWhosePhoneText(), "Whose phone is this?", "User is not on the whose phone is this page");
        whosePhonePage.clickParentDevice();
        addProfilePage.inputFirstName(testData.getProperty("firstname"));
        addProfilePage.inputDeviceType(testData.getProperty("deviceType"));
        addProfilePage.inputDOB(testData.getProperty("DOB"));
        addProfilePage.clickCreateANewChildProfileBtn();
        addProfilePage.clickFeedback();
        addProfilePage.clickShareFeedBackBtn();





    }
}
