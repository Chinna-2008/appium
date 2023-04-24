package com.atimi.audible.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.util.HashMap;

/**
 * This is 'IOS' class.
 */
public class IOS {

    /**
     * Scroll to text in ios.
     *
     * @param driver driver
     * @param text text
     */
    public static void scrollToTextInIOS(final AppiumDriver<MobileElement> driver, final String text) {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("value", text);
        driver.executeScript("mobile: scroll", scrollObject);
    }
}
