package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * This is 'LibraryScreen' class.
 */
public class LibraryScreen extends BaseScreen {

    private final LibraryScreenObject libraryScreenObject;

    public LibraryScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
        libraryScreenObject = new LibraryScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(libraryScreenObject.getHamburgerButton());
    }

    /**
     * Taps on hamburger button.
     *
     * @param audiobookName audiobook name
     */
    public void tapAudiobookHamburgerButton(final String audiobookName) {
        for (final MobileElement book : libraryScreenObject.getAudioBooks()) {
            String bookName = book.getText();
            if (bookName.equals(audiobookName)) {
                By hamburgerButton = By.xpath(String.format("//android.widget.TextView[@text= '%s']/../../../../../../following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.Button", audiobookName));
                driver.findElement(hamburgerButton).click();
                break;
            }
        }
    }

    /**
     * Gets the hamburger options of book.
     *
     * @return list of hamburger options
     */
    public List<String> getListOfHamburgerOptions() {
        List<String> hamburgerOptionsList = new ArrayList<>();
        for (final MobileElement option : libraryScreenObject.getHamburgerOptions()) {
            hamburgerOptionsList.add(option.getText());
        }
        return hamburgerOptionsList;
    }

    /**
     * Taps audiobook hamburger option.
     *
     * @param hamburgerOptionName hamburger option name
     */
    public void tapAudiobookHamburgerOption(final String hamburgerOptionName) {
        for (final MobileElement hamburgerOption : libraryScreenObject.getHamburgerOptions()) {
            String optionName = hamburgerOption.getText();
            if (optionName.equals(hamburgerOptionName)) {
                hamburgerOption.click();
                break;
            }
        }
    }

    /**
     * Taps sorting header button.
     */
    public void tapSortingHeaderButton() {
        libraryScreenObject.getSortingHeaderButton().click();
    }

    /**
     * Taps sort option.
     *
     * @param sortOptionName sort option name
     */
    public void tapSortOption(final String sortOptionName) {
        for (final MobileElement option : libraryScreenObject.getSortOptions()) {
            String sortOption = option.getText();
            if(sortOption.equals(sortOptionName)) {
                option.click();
                break;
            }
        }
    }

    /**
     * Gets list of audiobook titles.
     *
     * @return list of audiobook titles
     */
    public List<String> getAudiobookTitles() {
        List<String> audioBookTitles = new ArrayList<>();
        for (final MobileElement book : libraryScreenObject.getAudioBooks()) {
            String bookName = book.getText();
            audioBookTitles.add(bookName);
        }
        System.out.println(String.format("Audiobook titles : %s", audioBookTitles));
        return audioBookTitles;
    }

    /**
     * Gets all audiobook titles.
     *
     * @return audiobook titles
     */
    public List<String> getAllAudiobookTitles() {
        ArrayList<String> allAudiobookTitles = new ArrayList<>();
        for (final MobileElement mobileElement : libraryScreenObject.getAudiobookCells()) {
            MobileElement bookTitles = mobileElement.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.audible.application:id/title']"));
            String bookTitle = bookTitles.getText();
            allAudiobookTitles.add(bookTitle);
        }
        return allAudiobookTitles;
    }

    /**
     * Gets all audiobook author names.
     *
     * @return audiobook author names
     */
    public List<String> getAllAudiobookAuthors() {
        ArrayList<String> allAudiobookAuthorNames = new ArrayList<>();
        for (final MobileElement mobileElement : libraryScreenObject.getAudiobookCells()) {
            MobileElement author = mobileElement.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@resource-id = 'com.audible.application:id/author_text_view']"));
            String authorName = author.getText();
            allAudiobookAuthorNames.add(authorName);
        }
        return allAudiobookAuthorNames;
    }

    /**
     * Gets audiobooks details.
     *
     * @return audiobooks details
     */
    public List<String> getAudiobooksDetails() {
        ArrayList<String> audiobooksDetails = new ArrayList<>();
        for (final MobileElement mobileElement : libraryScreenObject.getAudiobookCells()) {
            MobileElement bookTitles = mobileElement.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.audible.application:id/title']"));
            String bookTitle = bookTitles.getText();
            MobileElement author = mobileElement.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@resource-id = 'com.audible.application:id/author_text_view']"));
            String authorName = author.getText();
            audiobooksDetails.add(String.format("\nBook title: %s, Author: %s",  bookTitle, authorName));
        }
        return audiobooksDetails;
    }
}