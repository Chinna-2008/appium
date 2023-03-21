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

    @Override
    public void waitForScreenToLoad() {
    }

    /**
     * Checks is settings screen displayed or not.
     *
     * @return true / false
     */
    public boolean isSettingsScreenDisplayed() {
        return isDisplayed(settingsScreenObject.getSettingsScreen());
    }
}