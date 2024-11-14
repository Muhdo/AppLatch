package DeviceCapabilities;

import BaseClasses.TestBase;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DeviceCaps extends TestBase {

    public static void Infinix_X6517() {
        caps = new DesiredCapabilities();
        //Ignore the device nsme, na samsung A14 i use
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:appPackage", "net.apptimist.applatchkidsandroid");
        caps.setCapability("appium:appActivity", "net.apptimist.applatchkidsandroid.activity.IntroActivity");
        caps.setCapability("appium:udid", "096604039P005247");
        caps.setCapability("appium:platformVersion", "");
        caps.setCapability("appium:deviceName","SM-A145F");
        caps.setCapability("appium:noReset", true);
        caps.setCapability("appium:newCommandTimeout", "9999");
        caps.setCapability("appium:autoGrantPermissions", true);

        //adb -s RF8W902YVGW shell pm grant net.apptimist.applatchkidsandroid android.permission.IntroActivity



        //{192a178 u0 net.apptimist.applatchkidsandroid/net.apptimist.applatchkidsandroid.activity.IntroActivity}

    }

    public static void iPhoneX (){
        caps = new DesiredCapabilities();
//        caps.setCapability("appium:platformName", "ios");
//        caps.setCapability("appium:platformVersion", "16.1");
//        caps.setCapability("appium:automationName", "xcuitest");
//        caps.setCapability("appium:udid", "203e7e96ae9ebfa637db76479a780f79e117f5c1");
//        caps.setCapability("appium:deviceName", "iPhone X");
//        caps.setCapability("appium:noReset", true);
//        caps.setCapability("appium:newCommandTimeout", "9999");
//        caps.setCapability("bundleId", "com.apple.Preferences");

        caps.setCapability("appium:platformName", "iOS");
        caps.setCapability("appium:deviceName", "iPhone X");
        caps.setCapability("appium:automationName", "xcuitest");
        caps.setCapability("appium:platformVersion", "16.1");
        caps.setCapability("appium:udid", "203e7e96ae9ebfa637db76479a780f79e117f5c1"); // your device UDID
        caps.setCapability("appium:bundleId", "ng.mtn.nextgen"); // bundle ID of the app you want to open
        caps.setCapability("appium:newCommandTimeout", 9999);
        caps.setCapability("appium:noReset", true);

        //If the app is available on app store, go to https://www.apple.com/app-store/ and search for it and click on it,
        //the url would return something like this, https://apps.apple.com/us/app/app-name/id123456789
        //get the id and put in this url https://itunes.apple.com/lookup?id=123456789
        //this will download a json file, search for bundle ID there and get it
        // if the app is not available on app store, tell the developers to provide the bundle id

    }

}
