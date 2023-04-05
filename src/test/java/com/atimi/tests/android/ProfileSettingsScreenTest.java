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
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        Assert.assertTrue(getDataAndStorageScreen().isDataAndStorageScreenDisplayed(), "Unable to load the data and storage screen.");
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
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        Assert.assertTrue(getDataAndStorageScreen().isStandardRadioButtonSelected("false"), "Standard radio button is selected.");
        Assert.assertTrue(getDataAndStorageScreen().isHighRadioButtonSelected("true"), "High radio button is not selected.");
        Assert.assertTrue(getDataAndStorageScreen().isSpatialAudioToggleButtonEnabled("false"), "Spatial audio toggle button is enabled.");
        Assert.assertTrue(getDataAndStorageScreen().isStreamAndDownloadOnWifiOnlyToggleButtonEnabled("false"), "Stream and download on wifi only toggle button is enabled.");
        Assert.assertTrue(getDataAndStorageScreen().isAutoRemoveToggleButtonEnabled("false"), "Auto remove toggle button is enabled.");
        getDataAndStorageScreen().scrollToMultiPartRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isAutoDownloadToggleButtonEnabled("false"), "Auto download toggle button is enabled.");
        Assert.assertTrue(getDataAndStorageScreen().isSingleRadioButtonSelected("true"), "Single radio button is not selected.");
        Assert.assertTrue(getDataAndStorageScreen().isMultiPartRadioButtonSelected("false"), "Multi part radio button is selected.");
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
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().tapDownloadQualityRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isStandardRadioButtonSelected("true"), "Standard radio button is not selected.");
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
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().tapSpatialAudioTogglesButton(DataAndStorageToggleButtonNames.STREAM_DOWNLOAD_ON_WIFI_ONLY.getToggleButtonValue());
        Assert.assertTrue(getDataAndStorageScreen().isStreamAndDownloadOnWifiOnlyToggleButtonEnabled("true"), "Stream and download on wifi only toggle button is disabled.");
    }

    /**
     * Tests auto remove toggle button.
     */
    @Test
    public void testAutoRemoveToggleButton() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().tapSpatialAudioTogglesButton(DataAndStorageToggleButtonNames.AUTO_REMOVE.getToggleButtonValue());
        Assert.assertTrue(getDataAndStorageScreen().isAutoRemoveToggleButtonEnabled("true"), "Auto remove toggle button is disabled.");
    }

    /**
     * Tests auto download toggle button.
     */
    @Test
    public void testAutoDownloadToggleButton() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().scrollToMultiPartRadioButton();
        getDataAndStorageScreen().tapSpatialAudioTogglesButton(DataAndStorageToggleButtonNames.AUTO_DOWNLOAD.getToggleButtonValue());
        Assert.assertTrue(getDataAndStorageScreen().isAutoDownloadToggleButtonEnabled("true"), "Auto download toggle button is disabled.");
    }

    /**
     * Tests download by parts radio buttons.
     */
    @Test
    public void testDownloadByPartsRadioButtons() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().tapSettings();
        getSettingsScreen().waitForScreenToLoad();
        getSettingsScreen().tapDataAndStorageOption();
        getDataAndStorageScreen().waitForScreenToLoad();
        getDataAndStorageScreen().scrollToMultiPartRadioButton();
        getDataAndStorageScreen().tapDownloadByPartsRadioButton();
        Assert.assertTrue(getDataAndStorageScreen().isMultiPartRadioButtonSelected("true"), "Multi part radio button is not selected.");
    }
}