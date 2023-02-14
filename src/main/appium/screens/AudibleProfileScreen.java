package screens;

/**
 * This is 'AudibleProfileScreen' class.
 */
public class AudibleProfileScreen extends BaseScreen {

    private final AudibleProfileScreenObject audibleProfileScreenObject;

    public AudibleProfileScreen() {
        audibleProfileScreenObject = new AudibleProfileScreenObject(appiumDriver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(audibleProfileScreenObject.getProfileName());
    }

    /**
     * Gets the profile name text.
     *
     * @return profile name text
     */
    public String getProfileNameText() {
        return audibleProfileScreenObject.getProfileName().getText();
    }
}