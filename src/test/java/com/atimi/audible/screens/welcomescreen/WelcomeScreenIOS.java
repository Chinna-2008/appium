package com.atimi.audible.screens.welcomescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

/**
 * This is 'WelcomeScreenIOS' class.
 */
public class WelcomeScreenIOS extends BaseScreen {

    private final WelcomeScreenObject welcomeScreenObject;

    public WelcomeScreenIOS(IOSDriver<IOSElement> driver) {
        super(driver);
        welcomeScreenObject = new WelcomeScreenObject(driver);
    }

    @Override
    public void waitForScreenToLoad() {
    }

    /**
     * Taps on get started.
     */
    public void tapGetStarted() {
        welcomeScreenObject.getGetStarted().click();
    }
}