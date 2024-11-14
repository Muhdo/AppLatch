package BaseClasses;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PageBase {
    public static AppiumDriver appiumDriver;
    WebDriverWait wait;

    public PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.appiumDriver = appiumDriver;
    }



    public void waitForClickAbility(WebElement element){
        wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForVisibility(WebElement element){
        wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        int attempt = 0;
        while (attempt < 3) {
            try {
                waitForClickAbility(element);
                element.click();
                break;
            } catch (Exception e) {
                e.printStackTrace();
                attempt++;
            }
        }
        if (attempt == 3) {
            System.out.println("Failed to click the element after 3 attempts");
        }

    }


    public void enterText(WebElement element, String text) {
        int attempt = 0;

        while (attempt < 3) {
            try {
                waitForVisibility(element);
                element.sendKeys(text);
                break;

            } catch (Exception e) {
                e.printStackTrace();
                attempt++;
            }

            if (attempt == 3) {
                System.out.println("Failed to click the element after 3 attempts");
            }
        }

    }
    public void sleep (int seconds){
        try{
            Thread.sleep(1000 * seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void clearText(WebElement element){
        waitForVisibility(element);
        element.clear();
    }
}
