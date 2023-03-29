package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'ProfileSettingsScreenTest' class.
 */
public class ProfileSettingsScreenTest extends AndroidTestBase {

    /**
     * Tests settings button.
     */
    @Test
    public void testSettingsButton() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
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
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapAppSettingsOption(AppSettingsOptions.DATA_AND_STORAGE.getAppSettingsOptionsValue());
        Assert.assertTrue(getSettingsScreen().isDataAndStorageScreenDisplayed(), "Unable to load the data and storage screen.");
    }

    /**
     * Test data and storage screen.
     */
    @Test
    public void testDataAndStorageScreen() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapAppSettingsOption(AppSettingsOptions.DATA_AND_STORAGE.getAppSettingsOptionsValue());
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfStandardRadioButton(), "false", "Standard radio button is selected.");
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfHighRadioButton(), "true", "High radio button is not selected.");
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfSpatialAudioToggleButton(), "false", "Spatial audio toggle button is turn on.");
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfStreamAndDownloadOnWifiOnlyToggleButton(), "false", "Stream and download on wifi only toggle button is turn on.");
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfAutoRemoveToggleButton(), "false", "Auto remove toggle button is turn on.");
        getDataAndStorageScreen().scrollToBottomOfScreen();
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfAutoDownloadToggleButton(), "false", "Auto download toggle button is turn on.");
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfSingleRadioButton(), "true", "Single radio button is not selected.");
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfMultiPartRadioButton(), "false", "Multi part radio button is selected.");
    }

    /**
     * Tests download quality radio buttons.
     */
    @Test
    public void testDownloadQualityRadioButtons() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapAppSettingsOption(AppSettingsOptions.DATA_AND_STORAGE.getAppSettingsOptionsValue());
        getDataAndStorageScreen().tapDownloadQualityRadioButton();
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfStandardRadioButton(), "true", "Standard radio button is not selected.");
    }

    /**
     * Tests stream and download on wi-fi only toggle button.
     */
    @Test
    public void testStreamAndDownloadOnWifiOnlyToggleButton() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapAppSettingsOption(AppSettingsOptions.DATA_AND_STORAGE.getAppSettingsOptionsValue());
        getDataAndStorageScreen().tapStreamAndDownloadOnWifiOnlyToggleButton();
        Assert.assertEquals(getDataAndStorageScreen().getAttributeValueOfStreamAndDownloadOnWifiOnlyToggleButton(), "true", "Stream and download on wifi only toggle button is turn off.");
    }
}