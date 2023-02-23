package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

/**
 * This is 'AudibleTest' class.
 */
public class SampleTest extends AndroidTestBase {

    /**
     * Test to launch application.
     */
    @Test
    public void testLaunchApplication() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapGetStarted();
        getHomeScreen().waitForScreenToLoad();
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
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        List<String> moreOptionsList = Arrays.asList("Title details", "Donald Katz", "Download", "Share", "Mark as finished", "Rate and Review & related content", "Add to favourites", "Add to…", "Archive this title", "Remove from library");
        Assert.assertEquals(getLibraryScreen().getListOfHamburgerOptions(), moreOptionsList, "More options for book is not matched.");
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
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
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
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
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
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
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
        getLibraryScreen().tapAudiobookHamburgerButton("Don Katz Interviews Jane Fonda");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
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
        getLibraryScreen().waitForScreenToLoad();
        List<String> beforeSortingAudiobookList = getLibraryScreen().getAudiobookTitles();
        getLibraryScreen().tapSortingHeaderButton();
        getLibraryScreen().tapSortOption("Title");
        List<String> afterSortingAudiobookList = getLibraryScreen().getAudiobookTitles();
        Assert.assertNotEquals(beforeSortingAudiobookList, afterSortingAudiobookList, "Audio books are not sorted.");
    }

    /**
     * Test gets the books details in library.
     */
    @Test
    public void testGetBooksDetailsInLibrary() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().waitForScreenToLoad();
        System.out.println(String.format("Audiobooks detail in library: %s", getLibraryScreen().getAudiobooksDetails()));
        List<String> expectedBooksDetails = getLibraryScreen().getAudiobooksDetails();
        Assert.assertEquals(getLibraryScreen().getAudiobooksDetails(), expectedBooksDetails,"Books details are not matched.");
    }

    /**
     * Test gets the audiobook titles and author names in library screen
     */
    @Test
    public void testAudiobookTitlesAndAuthorNamesInLibraryScreen() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab("Library");
        getLibraryScreen().waitForScreenToLoad();
        List<String> expectedBookTitles = Arrays.asList("Don Katz Interviews Jane Fonda", "The King of the Ferret Leggers and Other True Stories", "The Big Store", "Murder, We Spoke", "Just Do It");
        Assert.assertEquals(getLibraryScreen().getAllAudiobookTitles(), expectedBookTitles, "Audiobooks title are not matched.");
        List<String> expectedBookAuthorNames = Arrays.asList("By Jane Fonda", "By Donald Katz", "By Donald Katz", "By Kat Johnson", "By Donald Katz");
        Assert.assertEquals(getLibraryScreen().getAllAudiobookAuthors(), expectedBookAuthorNames, "Audiobooks author name are not matched.");
    }
}