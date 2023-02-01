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
        getWelcomePage().waitForGetStartedElementToDisplay();
        getWelcomePage().clickGetStarted();
        getWelcomePage().waitForAudibleLogoToDisplay();
        String text = getWelcomePage().getAudibleLogoText();
        System.out.println(text);
    }
}