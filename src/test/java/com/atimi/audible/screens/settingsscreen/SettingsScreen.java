package com.atimi.audible.screens.settingsscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'SettingsScreen' class.
 */
public class SettingsScreen extends BaseScreen {

    private final SettingsScreenObject settingsScreenObject;

    public SettingsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
        settingsScreenObject = new SettingsScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(settingsScreenObject.getSettingsScreen());
    }

    /**
     * Checks is settings screen displayed or not.
     *
     * @return true / false
     */
    public boolean isSettingsScreenDisplayed() {
        return isDisplayed(settingsScreenObject.getSettingsScreen());
    }

    /**
     * Taps data and storage option.
     */
    public void tapDataAndStorageOption() {
        settingsScreenObject.getDataAndStorageOption().click();
    }
}