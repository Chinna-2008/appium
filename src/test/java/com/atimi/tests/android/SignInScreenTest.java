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
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        Assert.assertTrue(getHomeScreen().isAudibleLogoDisplayed(), "Home page is not displayed.");
        getHomeScreen().tapMenuTab("Profile");
        getProfileScreen().waitForScreenToLoad();
        Assert.assertEquals(getProfileScreen().getProfileNameText(), "Reddeppap ", "Profile name is not matched.");
    }
}