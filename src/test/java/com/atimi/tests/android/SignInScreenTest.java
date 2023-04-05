package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'SignInScreenTest' class.
 */
public class SignInScreenTest extends AndroidTestBase {

    /**
     * Tests the sign in.
     */
    @Test
    public void testSignIn() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        Assert.assertTrue(getHomeScreen().isAudibleLogoDisplayed(), "Home page is not displayed.");
        getHomeScreen().tapMenuTab(MenuTabs.PROFILE.getTabsValue());
        getProfileScreen().waitForScreenToLoad();
        Assert.assertEquals(getProfileScreen().getProfileNameText(), "Reddeppap ", "Profile name is not matched.");
    }
}