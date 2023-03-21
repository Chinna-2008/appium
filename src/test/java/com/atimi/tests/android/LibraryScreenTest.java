package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

/**
 * This is 'LibraryScreenTest'
 */
public class LibraryScreenTest extends AndroidTestBase {

    /**
     * Test the library tab.
     */
    @Test
    public void testLibrary() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        List<String> moreOptionsList = Arrays.asList("Title details", "Donald Katz", "Download", "Share", "Mark as finished", "Rate and Review & related content", "Add to favourites", "Add to…", "Archive this title", "Remove from library");
        Assert.assertEquals(getLibraryScreen().getListOfHamburgerOptions(), moreOptionsList, "More options for book is not matched.");
    }

    /**
     * Test sorting audiobooks.
     */
    @Test
    public void testSortingAudiobooks() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        List<String> beforeSortingAudiobookList = getLibraryScreen().getAudiobookTitles();
        getLibraryScreen().tapSortingHeaderButton();
        getLibraryScreen().tapSortOption("Title");
        List<String> afterSortingAudiobookList = getLibraryScreen().getAudiobookTitles();
        Assert.assertNotEquals(beforeSortingAudiobookList, afterSortingAudiobookList, "Audiobooks are not sorted.");
    }

    /**
     * Test gets the visible books details in library.
     */
    @Test
    public void testGetVisibleBooksDetailsInLibrary() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        System.out.println(String.format("Audiobooks detail in library: %s", getLibraryScreen().getAudiobooksDetails()));
        List<String> expectedBooksDetails = getLibraryScreen().getAudiobooksDetails();
        Assert.assertEquals(getLibraryScreen().getAudiobooksDetails(), expectedBooksDetails,"Books details are not matched.");
    }

    /**
     * Test gets the visible audiobook titles and author names in library screen.
     */
    @Test
    public void testVisibleAudiobookTitlesAndAuthorNamesInLibraryScreen() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        List<String> expectedBookTitles = Arrays.asList("Canada Is Awesome", "Tomato Can Blues", "FIRST THREE FREE CHAPTERS: Amok", "Christmas in the Kitchen", "Don Katz Interviews Jane Fonda", "The King of the Ferret Leggers and Other True Stories");
        Assert.assertEquals(getLibraryScreen().getAllAudiobookTitles(), expectedBookTitles, "Audiobooks title are not matched.");
        List<String> expectedBookAuthorNames = Arrays.asList("By Neil Pasricha", "By Mary Pilon", "By Sebastian Fitzek", "By Nalini Singh", "By Jane Fonda", "By Donald Katz");
        Assert.assertEquals(getLibraryScreen().getAllAudiobookAuthors(), expectedBookAuthorNames, "Audiobooks author name are not matched.");
    }

    /**
     * Test the all book titles count.
     */
    @Test
    public void testGetAllBookTitlesCount() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        Assert.assertEquals(getLibraryScreen().getBookTitlesCount(), "5 titles", "Book titles are not matched.");
    }

    /**
     * Test get all the book titles.
     */
    @Test
    public void testGetAllBookTitles() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        getLibraryScreen().scrollUpToLastAudiobook();
    }
}