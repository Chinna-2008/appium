package screens;

/**
 * This is 'AudibleWelcomeScreen' class.
 */
public class AudibleWelcomeScreen extends BaseScreen {

    private final AudibleWelcomeScreenObject audibleWelcomeScreenObject;

    public AudibleWelcomeScreen() {
        audibleWelcomeScreenObject = new AudibleWelcomeScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {
        waitForMobileElement(audibleWelcomeScreenObject.getGetStarted());
    }

    /**
     * Waits for get started button to display.
     */
    public void waitForGetStartedButtonToDisplay() {
        waitForMobileElement(audibleWelcomeScreenObject.getGetStarted());
    }

    /**
     * Taps get started.
     */
    public void tapGetStarted(){
        audibleWelcomeScreenObject.getGetStarted().click();
    }

    /**
     * Waits for audible logo to display.
     */
    public void waitForAudibleLogoToDisplay() {
        waitForMobileElement(audibleWelcomeScreenObject.getAudibleLogo());
    }

    /**
     * Verify is audible logo displayed or not.
     *
     * @return true / false
     */
    public boolean isAudibleLogoDisplayed() {
        return audibleWelcomeScreenObject.getAudibleLogo().isDisplayed();
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignIn() {
        audibleWelcomeScreenObject.getSignIn().click();
    }
}