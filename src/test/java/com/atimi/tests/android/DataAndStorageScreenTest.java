package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'DataAndStorageScreenTest' class.
 */
public class DataAndStorageScreenTest extends AndroidTestBase {

    /**
     * Tests settings button.
     */
    @Test
    public void testSettingsButton() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        Assert.assertTrue(getSettingsScreen().isSettingsScreenDisplayed(), "Unable to load the settings screen.");
    }

    /**
     * Tests data and storage option.
     */
    @Test
    public void testDataAndStorageOption() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        Assert.assertTrue(getDataAndStorageScreen().isDataAndStorageTitleDisplayed(), "Unable to load the data and storage screen.");
    }

    /**
     * Test data and storage screen.
     */
    @Test
    public void testDataAndStorageScreen() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        Assert.assertFalse(getDataAndStorageScreen().isStandardRadioButtonSelected(), "Standard radio button is selected.");
        Assert.assertTrue(getDataAndStorageScreen().isHighRadioButtonSelected(), "High radio button is not selected.");
        Assert.assertTrue(getDataAndStorageScreen().isSpatialAudioToggleButtonEnabled(), "Spatial audio toggle button is enabled.");
        Assert.assertFalse(getDataAndStorageScreen().isStreamAndDownloadOnWifiOnlyToggleButtonEnabled(), "Stream and download on wifi only toggle button is enabled.");
        Assert.assertFalse(getDataAndStorageScreen().isAutoRemoveToggleButtonEnabled(), "Auto remove toggle button is enabled.");
        getDataAndStorageScreen().scrollToMultiPartRadioButton();
        Assert.assertFalse(getDataAndStorageScreen().isAutoDownloadToggleButtonEnabled(), "Auto download toggle button is enabled.");
        Assert.assertTrue(getDataAndStorageScreen().isSinglePartRadioButtonSelected(), "Single radio button is not selected.");
        Assert.assertFalse(getDataAndStorageScreen().isMultiPartRadioButtonSelected(), "Multi part radio button is selected.");
    }

    /**
     * Tests download quality radio buttons.
     */
    @Test
    public void testDownloadQualityRadioButtons() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().selectStandardRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isStandardRadioButtonSelected(), "Standard radio button is not selected.");
        getDataAndStorageScreen().selectHighRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isHighRadioButtonSelected(),"High radio button is not selected.");
    }

    /**
     * Tests stream and download on wi-fi only toggle button.
     */
    @Test
    public void testStreamAndDownloadOnWifiOnlyToggleButton() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().tapStreamAndDownloadOnWiFiOnlyToggleButton();
        Assert.assertTrue(getDataAndStorageScreen().isStreamAndDownloadOnWifiOnlyToggleButtonEnabled(), "Stream and download on wifi only toggle button is disabled.");
    }

    /**
     * Tests auto remove toggle button.
     */
    @Test
    public void testAutoRemoveToggleButton() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().tapAutoRemoveToggleButton();
        Assert.assertTrue(getDataAndStorageScreen().isAutoRemoveToggleButtonEnabled(), "Auto remove toggle button is disabled.");
    }

    /**
     * Tests auto download toggle button.
     */
    @Test
    public void testAutoDownloadToggleButton() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().scrollToMultiPartRadioButton();
        getDataAndStorageScreen().tapAutoDownloadToggleButton();
        Assert.assertTrue(getDataAndStorageScreen().isAutoDownloadToggleButtonEnabled(), "Auto download toggle button is disabled.");
    }

    /**
     * Tests download by parts radio buttons.
     */
    @Test
    public void testDownloadByPartsRadioButtons() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().scrollToMultiPartRadioButton();
        getDataAndStorageScreen().selectMultiPartRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isMultiPartRadioButtonSelected(), "Multi part radio button is not selected.");
        getDataAndStorageScreen().selectSinglePartRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isSinglePartRadioButtonSelected(), "Single part radio button is not selected.");
    }
}