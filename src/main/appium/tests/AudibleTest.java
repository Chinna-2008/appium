package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

/**
 * This is 'AudibleTest' class.
 */
public class AudibleTest extends AudibleAndroidTestBase {

    /**
     * Test to launch application.
     */
    @Test
    public void testLaunchApplication() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapGetStarted();
        getHomeScreen().waitForAudibleLogoToDisplay();
        Assert.assertTrue(getHomeScreen().isAudibleLogoDisplayed(), "Audible logo is not displayed.");
    }

    /**
     * Test the sign in.
     */
    @Test
    public void testSignIn() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        Assert.assertTrue(getHomeScreen().isAudibleLogoDisplayed(), "Home page is not displayed.");
        getHomeScreen().tapMenuTab("Profile");
        getProfileScreen().waitForScreenToLoad();
        Assert.assertEquals(getProfileScreen().getProfileNameText(), "Reddeppap ", "Profile name is not matched.");
    }

    /**
     * Test the search book.
     */
    @Test
    public void testSearchBook() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapSearchButton();
        getSearchScreen().enterSearchText("Story of Buddha");
        getSearchScreen().tapBook();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Story of Buddha", "Book title is not matched.");

    }

    /**
     * Test the library tab.
     */
    @Test
    public void testLibrary() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().tapBookKebabButton();
        List<String> moreOptionsList = Arrays.asList("Title details", "Donald Katz", "Download", "Share", "Mark as finished", "Rate and Review & related content", "Add to favourites", "Add to…", "Archive this title", "Remove from library");
        Assert.assertEquals(getLibraryScreen().getListOfMoreOptions(), moreOptionsList, "More options for book is not matched.");
    }

    /**
     * Test the book title.
     */
    @Test
    public void testBookTitle() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().tapBookKebabButton();
        getLibraryScreen().tapOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Just Do It", "Book title is not matched.");
    }

    /**
     * Test the book details.
     */
    @Test
    public void testBookDetails() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().tapBookKebabButton();
        getLibraryScreen().tapOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        System.out.println(String.format("Book details are: \n %s.", getBookDetailsScreen().getBookDetails()));
        Assert.assertTrue(getBookDetailsScreen().isBookDetailsContainsSubtitle(), "Book details is not contain subtitle.");
    }

    /**
     * Test the download book option.
     */
    @Test
    public void testDownloadBook() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().tapBookKebabButton();
        getLibraryScreen().tapOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapDownloadButton();
        getBookDetailsScreen().waitForRemoveFromDeviceButtonToLoad();
        Assert.assertTrue(getBookDetailsScreen().isRemoveFromDeviceButtonDisplayed(), "Book is not downloaded.");
    }

    /**
     * Test the play book.
     */
    @Test
    public void testPlayBook() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().tapBookKebabButton();
        getLibraryScreen().tapOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapPlayButton();
        getBookDetailsScreen().waitForPauseButton();
        Assert.assertTrue(getBookDetailsScreen().isPauseButtonDisplayed(), "Pause button is not displayed.");
    }

    /**
     * Test sorting audiobooks.
     */
    @Test
    public void testSortingAudiobooks() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        List<String> bookListSortedByRecent = Arrays.asList("Don Katz Interviews Jane Fonda", "The King of the Ferret Leggers and Other True Stories", "The Big Store", "Murder", "We Spoke", "Just Do It"); // TODO : Don't hardcode audiobook list, it will not work if audiobooks are changed.
        getLibraryScreen().tapSortingHeaderButton();
        getLibraryScreen().tapSortOption("Title"); //TODO : Create 2 variables to store the audiobook list before and after sorting.
        Assert.assertNotEquals(getLibraryScreen().getAudioBooks(), bookListSortedByRecent, "Audio books are not sorted by title.");
    }
}