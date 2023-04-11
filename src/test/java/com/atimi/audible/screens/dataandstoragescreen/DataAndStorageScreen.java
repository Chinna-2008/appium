package com.atimi.audible.screens.dataandstoragescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'DataAndStorageScreen' class.
 */
public class DataAndStorageScreen extends BaseScreen {

    private final DataAndStorageScreenObject dataAndStorageScreenObject;

    public DataAndStorageScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
        dataAndStorageScreenObject = new DataAndStorageScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(dataAndStorageScreenObject.getDataAndStorageTitle());
    }

    /**
     * Checks standard radio button is selected or not.
     *
     * @return true / false
     */
    public boolean isStandardRadioButtonSelected() {
        return dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(0).getAttribute("checked").equals("true");
    }

    /**
     * Checks high radio button is selected or not.
     *
     * @return true / false
     */
    public boolean isHighRadioButtonSelected() {
        return dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(1).getAttribute("checked").equals("true");
    }

    /**
     * Scroll to multi part radio button.
     */
    public void scrollToMultiPartRadioButton() {
        scrollToText((AndroidDriver<MobileElement>) driver, "Multi-part");
    }

    /**
     * Checks single radio button is selected or not.
     *
     * @return true / false
     */
    public boolean isSingleRadioButtonSelected() {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(0).getAttribute("checked").equals("true");
    }

    /**
     * Checks multipart radio button is selected or not.
     *
     * @return true / false
     */
    public boolean isMultiPartRadioButtonSelected() {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(1).getAttribute("checked").equals("true");
    }

    /**
     * Select download quality radio button.
     */
    public void selectDownloadQualityRadioButton() {
        for (final MobileElement radioButton : dataAndStorageScreenObject.getDownloadQualityRadioButtons()) {
            if (radioButton.getAttribute("checked").equals("false")) {
                radioButton.click();
                break;
            }
        }
    }

    /**
     * Select download by parts radio button.
     */
    public void selectDownloadByPartsRadioButton() {
        for (final MobileElement radioButton : dataAndStorageScreenObject.getDownloadByPartsRadioButtons()) {
            if (radioButton.getAttribute("checked").equals("false")) {
                radioButton.click();
                break;
            }
        }
    }

    /**
     * Taps stream and download on wi-fi only toggle button.
     */
    public void tapStreamAndDownloadOnWiFiOnlyToggleButton() {
        dataAndStorageScreenObject.getToggleButtons().get(1).click();
    }

    /**
     * Taps auto remove toggle button.
     */
    public void tapAutoRemoveToggleButton() {
        dataAndStorageScreenObject.getToggleButtons().get(2).click();
    }

    /**
     * Taps auto download toggle button.
     */
    public void tapAutoDownloadToggleButton() {
        dataAndStorageScreenObject.getToggleButtons().get(3).click();
    }

    /**
     * Checks is data and storage title displayed or not.
     *
     * @return true / false
     */
    public boolean isDataAndStorageTitleDisplayed() {
        return isDisplayed(dataAndStorageScreenObject.getDataAndStorageTitle());
    }

    /**
     * Checks spatial audio toggle button is enabled or not.
     *
     * @return true / false
     */
    public boolean isSpatialAudioToggleButtonEnabled() {
        return dataAndStorageScreenObject.getToggleButtons().get(0).getAttribute("checked").equals("false");
    }

    /**
     * Checks stream and download on wi-fi only toggle button is enabled or not.
     *
     * @return true / false
     */
    public boolean isStreamAndDownloadOnWifiOnlyToggleButtonEnabled() {
        return dataAndStorageScreenObject.getToggleButtons().get(1).getAttribute("checked").equals("true");
    }

    /**
     * Checks auto remove toggle button is enabled or not.
     *
     * @return true / false
     */
    public boolean isAutoRemoveToggleButtonEnabled() {
        return dataAndStorageScreenObject.getToggleButtons().get(2).getAttribute("checked").equals("true");
    }

    /**
     * Checks auto download toggle button is enabled or not.
     *
     * @return true / false
     */
    public boolean isAutoDownloadToggleButtonEnabled() {
        return dataAndStorageScreenObject.getToggleButtons().get(3).getAttribute("checked").equals("true");
    }
}