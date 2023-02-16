package screens;

/**
 * This is 'ProfileScreen' class.
 */
public class ProfileScreen extends BaseScreen {

    private final ProfileScreenObject profileScreenObject;

    public ProfileScreen() {
        profileScreenObject = new ProfileScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(profileScreenObject.getProfileName());
    }

    /**
     * Gets the profile name text.
     *
     * @return profile name text
     */
    public String getProfileNameText() {
        return profileScreenObject.getProfileName().getText();
    }
}