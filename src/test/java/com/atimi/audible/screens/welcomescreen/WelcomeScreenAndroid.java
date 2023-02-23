package com.atimi.audible.screens.welcomescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'WelcomeScreen' class.
 */
public class WelcomeScreenAndroid extends BaseScreen {

    private final WelcomeScreenObject welcomeScreenObject;

    public WelcomeScreenAndroid(AndroidDriver<AndroidElement> driver) {
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
     * Taps get started button.
     */
    public void tapGetStarted() {
        welcomeScreenObject.getGetStarted().click();
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignIn() {
        welcomeScreenObject.getSignIn().click();
    }
}