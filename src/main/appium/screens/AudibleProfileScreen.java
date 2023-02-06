package screens;

/**
 * This is 'AudibleProfileScreen' class.
 */
public class AudibleProfileScreen extends BaseScreen {

    private final AudibleProfileScreenObject audibleProfileScreenObject;

    public AudibleProfileScreen() {
        audibleProfileScreenObject = new AudibleProfileScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {

    }

    /**
     * Gets the profile name text.
     *
     * @return profile name text
     */
    public String getProfileNameText() {
        return audibleProfileScreenObject.getProfileName().getText();
    }

    /**
     * Waits for profile name text to display.
     */
    public void waitForProfileTextToDisplay() {
        waitForMobileElement(audibleProfileScreenObject.getProfileName());
    }
}