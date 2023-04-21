package com.atimi.audible.screens.signinscreen;

import com.atimi.audible.BaseScreen;
import com.atimi.audible.screens.welcomescreen.WelcomeScreenIOS;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This is 'SignInScreenIOS' class.
 */
public class SignInScreenIOS extends BaseScreen {

    private final SignInScreenObject signInScreenObject;

    public SignInScreenIOS(IOSDriver<IOSElement> driver) {
        super(driver);
        signInScreenObject = new SignInScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(signInScreenObject.getEnterEmailID());
    }

    /**
     * Login.
     *
     * @param emailID  email id
     * @param password password
     */
    public void login(final String emailID, final String password) {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        waitForScreenToLoad();
        getWait().until(ExpectedConditions.elementToBeClickable(signInScreenObject.getEnterEmailID()));
        signInScreenObject.getEnterEmailID().sendKeys(emailID);
        signInScreenObject.getEnterPassword().sendKeys(password);
        signInScreenObject.getSignInButton().click();
    }

    /**
     * Gets welcome screen.
     *
     * @return welcome screen object
     */
    private WelcomeScreenIOS getWelcomeScreen() {
        return new WelcomeScreenIOS((IOSDriver<IOSElement>) driver);
    }
}