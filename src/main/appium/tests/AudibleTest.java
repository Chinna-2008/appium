package tests;

import org.testng.annotations.Test;

/**
 * This is 'AudibleTest' class.
 */
public class AudibleTest extends AudibleAndroidTestBase {

    /**
     * Test to launch application.
     */
    @Test
    public void testLaunchApplication() {
        getWelcomeScreen().waitForGetStartedButtonToDisplay();
        getWelcomeScreen().tapGetStarted();
        getWelcomeScreen().waitForAudibleLogoToDisplay();
        String text = getWelcomeScreen().getAudibleLogoText();
        System.out.println(text);
    }
}