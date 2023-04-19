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
     * Checks single part radio button is selected or not.
     *
     * @return true / false
     */
    public boolean isSinglePartRadioButtonSelected() {
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
     * Select standard radio button.
     */
    public void selectStandardRadioButton() {
        MobileElement standardRadioButton = dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(0);
        if (standardRadioButton.getAttribute("checked").equals("false")) {
            standardRadioButton.click();
        }
    }

    /**
     * Select high radio button.
     */
    public void selectHighRadioButton() {
        MobileElement highRadioButton = dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(1);
        if (highRadioButton.getAttribute("checked").equals("false")) {
            highRadioButton.click();
        }
    }

    /**
     * Select single part radio button.
     */
    public void selectSinglePartRadioButton() {
        MobileElement singlePartRadioButton = dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(0);
        if (singlePartRadioButton.getAttribute("checked").equals("false")) {
            singlePartRadioButton.click();
        }
    }

    /**
     * Select multi part radio button.
     */
    public void selectMultiPartRadioButton() {
        MobileElement multiPartRadioButton = dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(1);
        if (multiPartRadioButton.getAttribute("checked").equals("false")) {
            multiPartRadioButton.click();
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