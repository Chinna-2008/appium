package screens;

/**
 * This is 'WelcomeScreen' class.
 */
public class WelcomeScreen extends BaseScreen {

    private final WelcomeScreenObject welcomeScreenObject;

    public WelcomeScreen() {
        welcomeScreenObject = new WelcomeScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(welcomeScreenObject.getGetStarted());
    }

    /**
     * Taps get started button.
     */
    public void tapGetStarted() {
        welcomeScreenObject.getGetStarted().click();
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignIn() {
        welcomeScreenObject.getSignIn().click();
    }
}