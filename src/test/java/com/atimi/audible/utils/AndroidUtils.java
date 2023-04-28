package com.atimi.audible.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

/**
 * This is 'AndroidUtils' class.
 */
public class AndroidUtils {

    /**
     * Scroll to text.
     *
     * @param driver driver
     * @param text text
     */
    public static void scrollToText(final AppiumDriver<MobileElement> driver, final String text) {
       driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"));"));
    }
}
