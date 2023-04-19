package com.atimi.audible.screens.profilescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'ProfileScreen' class.
 */
public class ProfileScreen extends BaseScreen {

    private final ProfileScreenObject profileScreenObject;

    public ProfileScreen(final AndroidDriver<AndroidElement> driver) {
        super(driver);
        profileScreenObject = new ProfileScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(profileScreenObject.getProfileName());
    }

    /**
     * Gets the profile name text.
     *
     * @return profile name text
     */
    public String getProfileNameText() {
        return profileScreenObject.getProfileName().getText();
    }

    /**
     * Taps on settings.
     */
    public void tapSettings() {
        profileScreenObject.getSettings().click();
    }
}