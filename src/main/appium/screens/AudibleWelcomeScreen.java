package screens;

/**
 * This is 'AudibleWelcomeScreen' class.
 */
public class AudibleWelcomeScreen extends BaseScreen {

    private final AudibleWelcomeScreenObject audibleWelcomeScreenObject;

    public AudibleWelcomeScreen() {
        audibleWelcomeScreenObject = new AudibleWelcomeScreenObject(appiumDriver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(audibleWelcomeScreenObject.getGetStarted());
    }

    /**
     * Taps get started button.
     */
    public void tapGetStarted() {
        audibleWelcomeScreenObject.getGetStarted().click();
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignIn() {
        audibleWelcomeScreenObject.getSignIn().click();
    }
}