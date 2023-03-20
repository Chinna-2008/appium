package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'SignInScreenTest' class.
 */
public class SignInScreenTest extends AndroidTestBase {

    /**
     * Test the sign in.
     */
    @Test
    public void testSignIn() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        Assert.assertTrue(getHomeScreen().isAudibleLogoDisplayed(), "Home page is not displayed.");
        getHomeScreen().tapMenuTab("Profile");
        getProfileScreen().waitForScreenToLoad();
        Assert.assertEquals(getProfileScreen().getProfileNameText(), "Reddeppap ", "Profile name is not matched.");
    }
}