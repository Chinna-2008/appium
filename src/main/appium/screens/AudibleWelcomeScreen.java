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
     * Gets the audible logo text.
     *
     * @return audible text
     */
    public String getAudibleLogoText() {
        return audibleWelcomeScreenObject.getAudibleLogo().getText();
    }
}