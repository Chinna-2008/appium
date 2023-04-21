package com.atimi.audible;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

/**
 * This is 'BaseScreen' class.
 */
public abstract class BaseScreen {

    public AppiumDriver driver;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    /**
     * Waits for screen to load.
     */
    public abstract void waitForScreenToLoad();

    /**
     * Checks element is displayed or not.
     *
     * @param mobileElement mobile element
     * @return true / false
     */
    protected boolean isDisplayed(final MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (final NotFoundException exception) {
            return false;
        }
    }

    /**
     * Waits for until element to display.
     *
     * @param element element
     */
    protected void waitForElementToDisplay(final MobileElement element) {
        getWait().until(driver -> element.isDisplayed());
    }

    /**
     * Gets wait.
     *
     * @return duration in seconds
     */
    protected WebDriverWait getWait() {
        return new WebDriverWait(driver, 70);
    }

    /**
     * Scroll to text.
     *
     * @param driver driver
     * @param text text
     */
    public static void scrollToText(AppiumDriver<MobileElement> driver, final String text) {
        MobileElement mobileElement =  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"));"));
    }

    /**
     * Scroll to text.
     *
     * @param driver driver
     * @param text text
     */
    public static void scrollToTextInIOS(AppiumDriver<MobileElement> driver, final String text) {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("predicateString", "label == "+ text+"");
        driver.executeScript("mobile: scroll", scrollObject);
    }
}