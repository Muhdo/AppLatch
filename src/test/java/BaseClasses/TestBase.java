package BaseClasses;

import DeviceCapabilities.DeviceCaps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import static DeviceCapabilities.DeviceCaps.Infinix_X6517;
import static DeviceCapabilities.DeviceCaps.iPhoneX;

public class TestBase {
    public  String filePath = "src/test/java/Utils/testData.properties";
    public Properties testData;
    FileInputStream fis;
    DeviceCaps deviceCaps;
    public static DesiredCapabilities caps;
    public URL url;
    public static AndroidDriver androidDriver;
    public static IOSDriver iosDriver;
    String device;

    public TestBase(){
        loadTestData();
    }

    public void loadTestData(){
        testData = new Properties();
        try {
            fis = new FileInputStream(filePath);
            testData.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @BeforeClass
    public void mainSetup() {
        device = testData.getProperty("device1"); //device1 = android, device 2 = iphone
        if (device.equals("Infinix_X6517")) {
            Infinix_X6517();

            try {
                //currently using head spin url, when I have an android device, I am to change it to my local host url
                url = new URL("https://mtn-ng-los-0.headspin.io:7015/v0/55a8e08fe059463e8ac131905ded7144/wd/hub");
                androidDriver = new AndroidDriver(url, caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }
        else if(device.equals("iPhoneX")){
            iPhoneX();
            try{
                url = new URL("https://mtn-ng-los-0.headspin.io:7017/v0/55a8e08fe059463e8ac131905ded7144/wd/hub");
                iosDriver  = new IOSDriver(url, caps);
            }catch (Exception e){
                e.printStackTrace();
            }
            iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }
    }

    public void sleep (int seconds){
        try{
            Thread.sleep(1000 * seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown(){

        if(device.equalsIgnoreCase("Infinix_X6517") && androidDriver != null){
            androidDriver.quit();
        }
        else if(device.equalsIgnoreCase("iPhoneX") && iosDriver != null){
            iosDriver.quit();
        }
    }

    //If the above does not work, try this
//    public void tearDown() {
//        if (androidDriver != null) {
//            androidDriver.quit();

//        }
//        if (iosDriver != null) {
//            iosDriver.quit();

//        }
//    }
}
