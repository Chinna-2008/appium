package com.atimi.audible.screens.dataandstoragescreen;

import com.atimi.audible.BaseScreen;
import com.atimi.tests.android.DataAndStorageToggleButtonNames;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.stream.Collectors;

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
     * Gets attribute value of multi-part radio button.
     *
     * @return attribute value of multi-part radio button
     */
    public String getAttributeValueOfMultiPartRadioButton() {
        return dataAndStorageScreenObject.getDownloadByPartsRadioButtons().get(1).getAttribute("checked");
    }

    /**
     * Tap download quality radio button.
     */
    public void tapDownloadQualityRadioButton() {
        List<MobileElement> radioButtons = dataAndStorageScreenObject.getDownloadQualityRadioButtons().stream().filter(radioButton -> radioButton.getAttribute("checked").equals("false")).collect(Collectors.toList());
        radioButtons.stream().forEach(radioButton -> radioButton.click());
    }

    /**
     * Taps download by parts radio button.
     */
    public void tapDownloadByPartsRadioButton() {
        List<MobileElement> radioButtons = dataAndStorageScreenObject.getDownloadByPartsRadioButtons().stream().filter(radioButton -> radioButton.getAttribute("checked").equals("false")).collect(Collectors.toList());
        radioButtons.stream().forEach(radioButton -> radioButton.click());
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

    /**
     * Get attribute value of toggle buttons.
     *
     * @param toggleButtonName toggle button name
     * @return true / false
     */
    public String getAttributeValueOfToggleButtons(final DataAndStorageToggleButtonNames toggleButtonName) {
        String attributeValue = null;
        switch (toggleButtonName) {
            case SPATIAL_AUDIO:
                attributeValue = dataAndStorageScreenObject.getToggleSwitchButtons().get(0).getAttribute("checked");
                break;
            case STREAM_DOWNLOAD_ON_WIFI_ONLY:
                attributeValue = dataAndStorageScreenObject.getToggleSwitchButtons().get(1).getAttribute("checked");
                break;
            case AUTO_REMOVE:
                attributeValue = dataAndStorageScreenObject.getToggleSwitchButtons().get(2).getAttribute("checked");
                break;
            case AUTO_DOWNLOAD:
                attributeValue = dataAndStorageScreenObject.getToggleSwitchButtons().get(3).getAttribute("checked");
                break;
            default:
                System.out.println("Unable to get attribute value of toggle button");
        }
        return attributeValue;
    }
}