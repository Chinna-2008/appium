package screens;

/**
 * This is 'AudibleSignInScreen' class.
 */
public class AudibleSignInScreen extends BaseScreen {

    private final AudibleSignInScreenObject audibleSignInScreenObject;

    public AudibleSignInScreen() {
        audibleSignInScreenObject = new AudibleSignInScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {
        waitForMobileElement(audibleSignInScreenObject.getSignInScreen());
    }

    /**
     * Enters email id.
     *
     * @param emailId email id
     */
    public void enterEmailId(final String emailId) {
        audibleSignInScreenObject.getEnterEmailID().sendKeys(emailId);
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