package screens;

/**
 * This is 'AudibleHomeScreen' class.
 */
public class AudibleHomeScreen extends BaseScreen {

    private final AudibleHomeScreenObject audibleHomeScreenObject;

    public AudibleHomeScreen() {
        audibleHomeScreenObject = new AudibleHomeScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {
        waitForMobileElement(audibleHomeScreenObject.getAudibleLogo());
    }

    /**
     * Verify the audible logo is displayed or not.
     *
     * @return true / false
     */
    public boolean isAudibleLogoIsDisplayed() {
        return audibleHomeScreenObject.getAudibleLogo().isDisplayed();
    }
}