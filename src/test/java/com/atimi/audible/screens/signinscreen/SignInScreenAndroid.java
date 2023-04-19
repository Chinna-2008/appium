package com.atimi.audible.screens.signinscreen;

import com.atimi.audible.BaseScreen;
import com.atimi.audible.screens.welcomescreen.WelcomeScreenAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'SignInScreenAndroid' class.
 */
public class SignInScreenAndroid extends BaseScreen {

    private final SignInScreenObject signInScreenObject;

    public SignInScreenAndroid(final AndroidDriver<AndroidElement> driver) {
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
     * Login.
     * @param emailID email id
     * @param password password
     */
    public void login(final String emailID, final String password) {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        waitForScreenToLoad();
        signInScreenObject.getEnterEmailID().sendKeys(emailID);
        signInScreenObject.getEnterPassword().sendKeys(password);
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