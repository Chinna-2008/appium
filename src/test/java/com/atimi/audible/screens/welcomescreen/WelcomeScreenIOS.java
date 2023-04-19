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

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(welcomeScreenObject.getGetStarted());
    }

    /**
     * Taps on get started.
     */
    public void tapGetStarted() {
        welcomeScreenObject.getGetStarted().click();
    }

    /**
     * Taps sign in button.
     */
    public void tapSignIn() {
        welcomeScreenObject.getSignIn().click();
    }
}