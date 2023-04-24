package com.atimi.tests.ScreenFactory;

import com.atimi.audible.screens.bookdetailsscreen.BookDetailsScreenAndroid;
import com.atimi.audible.screens.dataandstoragescreen.DataAndStorageScreenAndroid;
import com.atimi.audible.screens.homescreen.HomeScreenAndroid;
import com.atimi.audible.screens.libraryScreen.LibraryScreenAndroid;
import com.atimi.audible.screens.profilescreen.ProfileScreen;
import com.atimi.audible.screens.searchscreen.SearchScreenAndroid;
import com.atimi.audible.screens.settingsscreen.SettingsScreen;
import com.atimi.audible.screens.signinscreen.SignInScreenAndroid;
import com.atimi.audible.screens.welcomescreen.WelcomeScreenAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidScreenFactory extends IScreenFactory {

    private final AndroidDriver<AndroidElement> driver;

    public AndroidScreenFactory(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    /**
     * Gets the welcome screen.
     *
     * @return welcome screen object
     */
    public WelcomeScreenAndroid getWelcomeScreen() {
        return new WelcomeScreenAndroid(driver);
    }

    /**
     * Gets the sign in screen.
     *
     * @return sign in screen object
     */
    public SignInScreenAndroid getSignInScreen() {
        return new SignInScreenAndroid(driver);
    }

    /**
     * Gets the home screen.
     *
     * @return home screen object
     */
    public HomeScreenAndroid getHomeScreen() {
        return new HomeScreenAndroid(driver);
    }

    /**
     * Gets the profile screen.
     *
     * @return profile screen object
     */
    public ProfileScreen getProfileScreen() {
        return new ProfileScreen(driver);
    }

    /**
     * Gets the search screen.
     *
     * @return search screen object
     */
    public SearchScreenAndroid getSearchScreen() {
        return new SearchScreenAndroid(driver);
    }

    /**
     * Gets the book details screen.
     *
     * @return book details screen object
     */
    public BookDetailsScreenAndroid getBookDetailsScreen() {
        return new BookDetailsScreenAndroid(driver);
    }

    /**
     * Gets the library screen.
     *
     * @return library screen object
     */
    public LibraryScreenAndroid getLibraryScreen() {
        return new LibraryScreenAndroid(driver);
    }

    /**
     * Gets settings screen.
     *
     * @return settings screen object
     */
    public SettingsScreen getSettingsScreen() {
        return new SettingsScreen(driver);
    }

    /**
     * Gets data and storage screen.
     *
     * @return data and storage screen object
     */
    public DataAndStorageScreenAndroid getDataAndStorageScreen() {
        return new DataAndStorageScreenAndroid(driver);
    }
}