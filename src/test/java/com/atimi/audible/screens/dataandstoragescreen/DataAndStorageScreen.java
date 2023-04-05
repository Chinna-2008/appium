package com.atimi.audible.screens.dataandstoragescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

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
        waitForElementToDisplay(dataAndStorageScreenObject.getDataAndStorageScreen());
    }

    /**
     * Checks standard radio button is selected or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isStandardRadioButtonSelected(final String booleanValue) {
        String standardRadioButtonSelected = dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(0).getAttribute("checked");
        return standardRadioButtonSelected.equals(booleanValue);
    }

    /**
     * Checks high radio button is selected or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isHighRadioButtonSelected(final String booleanValue) {
        String highRadioButtonSelected = dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(1).getAttribute("checked");
        return highRadioButtonSelected.equals(booleanValue);
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
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isSingleRadioButtonSelected(final String booleanValue) {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(0).getAttribute("checked").equals(booleanValue);
    }

    /**
     * Checks multipart radio button is selected or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isMultiPartRadioButtonSelected(final String booleanValue) {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(1).getAttribute("checked").equals(booleanValue);
    }

    /**
     * Tap download quality radio button.
     */
    public void tapDownloadQualityRadioButton() {
        for (final MobileElement radioButton : dataAndStorageScreenObject.getDownloadQualityRadioButtons()) {
            if (radioButton.getAttribute("checked").equals("false")) {
                radioButton.click();
                break;
            }
        }
    }

    /**
     * Taps download by parts radio button.
     */
    public void tapDownloadByPartsRadioButton() {
        for (final MobileElement radioButton : dataAndStorageScreenObject.getDownloadByPartsRadioButtons()) {
            if (radioButton.getAttribute("checked").equals("false")) {
                radioButton.click();
                break;
            }
        }
    }

    /**
     * Taps on the spatial audio toggles button.
     *
     * @param spatialAudioToggleButtonName spatial audio toggle button name
     */
    public void tapSpatialAudioTogglesButton(final String spatialAudioToggleButtonName) {
        for (final MobileElement title : dataAndStorageScreenObject.getButtonsTitles()) {
            String titleName = title.getText();
            if (titleName.equals(spatialAudioToggleButtonName)) {
                By toggleButton = By.xpath(String.format("//android.widget.TextView[@text = '%s']/following-sibling::android.widget.Switch", spatialAudioToggleButtonName));
                driver.findElement(toggleButton).click();
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
        return isDisplayed(dataAndStorageScreenObject.getDataAndStorageScreen());
    }

    /**
     * Checks spatial audio toggle button is enabled or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isSpatialAudioToggleButtonEnabled(final String booleanValue) {
        return dataAndStorageScreenObject.getToggleButtons().get(0).getAttribute("checked").equals(booleanValue);
    }

    /**
     * Checks stream and download on wi-fi only toggle button is enabled or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isStreamAndDownloadOnWifiOnlyToggleButtonEnabled(final String booleanValue) {
        return dataAndStorageScreenObject.getToggleButtons().get(1).getAttribute("checked").equals(booleanValue);
    }

    /**
     * Checks auto remove toggle button is enabled or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isAutoRemoveToggleButtonEnabled(final String booleanValue) {
        return dataAndStorageScreenObject.getToggleButtons().get(2).getAttribute("checked").equals(booleanValue);
    }

    /**
     * Checks auto download toggle button is enabled or not.
     *
     * @param booleanValue boolean value
     * @return true / false
     */
    public boolean isAutoDownloadToggleButtonEnabled(final String booleanValue) {
        return dataAndStorageScreenObject.getToggleButtons().get(3).getAttribute("checked").equals(booleanValue);
    }
}