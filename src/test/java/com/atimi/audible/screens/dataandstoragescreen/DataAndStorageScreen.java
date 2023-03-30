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

    @Override
    public void waitForScreenToLoad() {
    }

    /**
     * Gets attribute value of standard radio button.
     *
     * @return attribute value of standard radio button
     */
    public String getAttributeValueOfStandardRadioButton() {
        return dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(0).getAttribute("checked");
    }

    /**
     * Gets attribute value of high radio button.
     *
     * @return attribute value of high radio button
     */
    public String getAttributeValueOfHighRadioButton() {
        return dataAndStorageScreenObject.getDownloadQualityRadioButtons().get(1).getAttribute("checked");
    }

    /**
     * Gets attribute value of spatial audio toggle button.
     *
     * @return attribute value of spatial audio toggle button
     */
    public String getAttributeValueOfSpatialAudioToggleButton() {
        return dataAndStorageScreenObject.getToggleSwitchButtons().get(0).getAttribute("checked");
    }

    /**
     * Gets attribute value of stream and download on wi-fi only toggle button.
     *
     * @return attribute value of stream and download on wi-fi only toggle button
     */
    public String getAttributeValueOfStreamAndDownloadOnWifiOnlyToggleButton() {
        return dataAndStorageScreenObject.getToggleSwitchButtons().get(1).getAttribute("checked");
    }

    /**
     * Gets attribute value of auto remove toggle button.
     *
     * @return attribute value of auto remove toggle button
     */
    public String getAttributeValueOfAutoRemoveToggleButton() {
        return dataAndStorageScreenObject.getToggleSwitchButtons().get(2).getAttribute("checked");
    }

    /**
     * Gets attribute value of auto download toggle button.
     *
     * @return attribute value of auto download toggle button
     */
    public String getAttributeValueOfAutoDownloadToggleButton() {
        return dataAndStorageScreenObject.getToggleSwitchButtons().get(3).getAttribute("checked");
    }

    /**
     * Scroll to bottom of screen.
     */
    public void scrollToBottomOfScreen() {
        scrollToText((AndroidDriver<MobileElement>) driver, "Multi-part");
    }

    /**
     * Gets attribute value of single radio button.
     *
     * @return attribute value of single radio button
     */
    public String getAttributeValueOfSingleRadioButton() {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(0).getAttribute("checked");
    }

    /**
     * Gets attribute value of multi radio button.//TODO: Gets attribute value of multi-part radio button.
     *
     * @return attribute value of multi radio button //TODO: attribute value of multi-part radio button.
     */
    public String getAttributeValueOfMultiPartRadioButton() {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(1).getAttribute("checked");
    }

    /**
     * Taps on download quality radio button.
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
     * Taps on the toggle button.
     *
     * @param toggleButtonName toggle button name
     */
    public void tapTogglesButton(final String toggleButtonName) {
        for (final MobileElement title : dataAndStorageScreenObject.getButtonsTitles()) {
            String titleName = title.getText();
            if (titleName.equals(toggleButtonName)) {
                By toggleButton = By.xpath(String.format("//android.widget.TextView[@text = '%s']/following-sibling::android.widget.Switch", toggleButtonName));
                driver.findElement(toggleButton).click();
                break;
            }
        }
    }
}