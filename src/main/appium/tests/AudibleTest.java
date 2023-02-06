package tests;

import org.testng.Assert;
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
        Assert.assertTrue(getWelcomeScreen().isAudibleLogoDisplayed(), "Audible logo is not displayed.");
    }

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
        Assert.assertTrue(getHomeScreen().isAudibleLogoIsDisplayed(), "Home page is not displayed.");
        getHomeScreen().tapProfile();
        getProfileScreen().waitForProfileTextToDisplay();
        Assert.assertEquals(getProfileScreen().getProfileNameText(), "Reddeppap ", "Profile name is not matched");
    }
}