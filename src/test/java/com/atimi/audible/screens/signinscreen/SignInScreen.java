package com.atimi.audible.screens.signinscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'SignInScreen' class.
 */
public class SignInScreen extends BaseScreen {

    private final SignInScreenObject signInScreenObject;

    public SignInScreen(AndroidDriver<AndroidElement> driver) { // TODO : Add final.
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
     * Sign in.
     *
     * @param emailID email id
     * @param password password
     */
    public void signIn(final String emailID, final String password) {
        signInScreenObject.getEnterEmailID().sendKeys(emailID);
        signInScreenObject.getEnterPassword().sendKeys(password);
        signInScreenObject.getSignInButton().click();
    }
}