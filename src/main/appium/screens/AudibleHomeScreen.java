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
    public void waitForScreenToLoad() { // TODO : Add java docs.
        waitForMobileElement(audibleHomeScreenObject.getAudibleLogo());
    }

    /**
     * Checks the audible logo is displayed or not.
     *
     * @return true / false
     */
    public boolean isAudibleLogoIsDisplayed() { // TODO : Update the method name as 'isAudibleLogoDisplayed'.
        return audibleHomeScreenObject.getAudibleLogo().isDisplayed(); // TODO : Create common method for 'isDisplayed' in base screen class.
    }

    /**
     * Taps on the profile.
     */
    public void tapProfile() {
        audibleHomeScreenObject.getProfile().click();
    }

    /**
     * Taps on the search button.
     */
    public void tapSearchButton() {
        audibleHomeScreenObject.getSearch().click();
    }

    /**
     * Taps on the library tab.
     */
    public void tapLibrary() {
        audibleHomeScreenObject.getLibrary().click();
    }
}