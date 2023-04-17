package com.atimi.tests.ios;

import com.atimi.tests.IOSTestBase;
import org.testng.annotations.Test;

/**
 * This is 'WelcomeScreenTest' class.
 */
public class WelcomeScreenTest extends IOSTestBase {

    /**
     * Tests to launch application.
     */
    @Test
    public void testLaunchApplication() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapGetStarted();
    }
}