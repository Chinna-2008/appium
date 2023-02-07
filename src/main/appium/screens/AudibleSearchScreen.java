package screens;

/**
 * This is 'AudibleSearchScreen' class.
 */
public class AudibleSearchScreen extends BaseScreen {

    private final AudibleSearchScreenObject audibleSearchScreenObject;

    public AudibleSearchScreen() {
        audibleSearchScreenObject = new AudibleSearchScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {
    }

    /**
     * Enters the search text.
     *
     * @param searchText search text
     */
    public void enterSearchText(final String searchText) {
        audibleSearchScreenObject.getSearchBox().sendKeys(searchText);
    }

    /**
     * Taps on book.
     */
    public void tapBook() {
        audibleSearchScreenObject.getStoryOfBuddha().click();
    }
}