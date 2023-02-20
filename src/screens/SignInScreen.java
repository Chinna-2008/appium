package screens;

/**
 * This is 'SignInScreen' class.
 */
public class SignInScreen extends BaseScreen {

    private final SignInScreenObject signInScreenObject;

    public SignInScreen() {
        signInScreenObject = new SignInScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(signInScreenObject.getSignInScreen());
    }

    /**
     * Enters email id.
     *
     * @param emailID email id
     */
    public void enterEmailId(final String emailID) {
        signInScreenObject.getEnterEmailID().sendKeys(emailID);
    }

    /**
     * Enters the password.
     *
     * @param password password
     */
    public void enterPassword(final String password) {
        signInScreenObject.getEnterPassword().sendKeys(password);
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignInButton() {
        signInScreenObject.getSignInButton().click();
    }
}