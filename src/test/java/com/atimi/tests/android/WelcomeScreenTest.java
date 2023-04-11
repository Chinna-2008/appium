package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'WelcomeScreenTest' class.
 */
public class WelcomeScreenTest extends AndroidTestBase {

    /**
     * Tests to launch application.
     */
    @Test
    public void testLaunchApplication() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapGetStarted();
        getHomeScreen().waitForScreenToLoad();
        Assert.assertTrue(getHomeScreen().isAudibleLogoDisplayed(), "Audible logo is not displayed.");
        System.out.println("Test.");
    }
}