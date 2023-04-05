package com.atimi.audible.screens.signinscreen;

import com.atimi.audible.BaseScreen;
import com.atimi.audible.screens.welcomescreen.WelcomeScreenAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'SignInScreen' class.
 */
public class SignInScreen extends BaseScreen {

    private final SignInScreenObject signInScreenObject;

    public SignInScreen(final AndroidDriver<AndroidElement> driver) {
        super(driver);
        signInScreenObject = new SignInScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(signInScreenObject.getSignInScreen());
    }

    /**
     * Log in.
     */
    public void login() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        waitForScreenToLoad();
        signInScreenObject.getEnterEmailID().sendKeys("reddeppapc1@gmail.com");
        signInScreenObject.getEnterPassword().sendKeys("Reddeppa@3");
        signInScreenObject.getSignInButton().click();
    }

    /**
     * Gets welcome screen.
     *
     * @return welcome screen object
     */
    private WelcomeScreenAndroid getWelcomeScreen() {
        return new WelcomeScreenAndroid((AndroidDriver<AndroidElement>) driver);
    }
}