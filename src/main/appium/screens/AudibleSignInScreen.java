package screens;

/**
 * This is 'AudibleSignInScreen' class.
 */
public class AudibleSignInScreen extends BaseScreen {

    private final AudibleSignInScreenObject audibleSignInScreenObject;

    public AudibleSignInScreen() {
        audibleSignInScreenObject = new AudibleSignInScreenObject(appiumDriver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(audibleSignInScreenObject.getSignInScreen());
    }

    /**
     * Enters email id.
     *
     * @param emailID email id
     */
    public void enterEmailId(final String emailID) {
        audibleSignInScreenObject.getEnterEmailID().sendKeys(emailID);
    }

    /**
     * Enters the password.
     *
     * @param password password
     */
    public void enterPassword(final String password) {
        audibleSignInScreenObject.getEnterPassword().sendKeys(password);
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignInButton() {
        audibleSignInScreenObject.getSignInButton().click();
    }
}