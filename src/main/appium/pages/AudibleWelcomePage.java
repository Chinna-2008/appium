package pages;

/**
 * This is 'AudibleWelcomePage' class.
 */
public class AudibleWelcomePage extends BasePage {

    private final AudibleWelcomePageObject audibleWelcomePageObject;

    public AudibleWelcomePage() {
        audibleWelcomePageObject = new AudibleWelcomePageObject(appiumDriver);
    }

    @Override
    public void waitForPageToLoad() {
    }

    /**
     * Waits for get started element to display.
     */
    public void waitForGetStartedElementToDisplay() {
        waitForMobileElement(audibleWelcomePageObject.getGetStartedButton());
    }

    /**
     * Clicks get started.
     */
    public void clickGetStarted(){
        audibleWelcomePageObject.getGetStartedButton().click();
    }

    /**
     * Waits for audible logo to display.
     */
    public void waitForAudibleLogoToDisplay() {
        waitForMobileElement(audibleWelcomePageObject.getAudibleLogo());
    }

    /**
     * Gets the audible logo text.
     *
     * @return audible text
     */
    public String getAudibleLogoText() {
        return audibleWelcomePageObject.getAudibleLogo().getText();
    }
}