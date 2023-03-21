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
}