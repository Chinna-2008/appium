package com.atimi.audible.screens.settingsscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.List;
import java.util.stream.Collectors;

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
     * Gets app settings options.
     *
     * @return app settings options
     */
    public List<MobileElement> getAppSettingsOptions() {
        List<MobileElement> appSettingsOptions = settingsScreenObject.getAppSettingsOptions().stream().limit(4).collect(Collectors.toList());
        return appSettingsOptions;
    }

    /**
     * Taps app settings option.
     *
     * @param appSettingsOption app setting option
     */
    public void tapAppSettingsOption(final String appSettingsOption) {
        for (MobileElement settingsOption : getAppSettingsOptions()) {
            String appSettingOption = settingsOption.getText();
            if (appSettingOption.equals(appSettingsOption)) {
                settingsOption.click();
                break;
            }
        }
    }

    /**
     * Checks is data and storage screen displayed or not.
     *
     * @return true / false
     */
    public boolean isDataAndStorageScreenDisplayed() {
        return isDisplayed(settingsScreenObject.getStorageAndStorageScreen());
    }
}