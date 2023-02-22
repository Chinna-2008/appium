package tests.ScreenFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import screens.*;
import screens.welcomescreen.WelcomeScreenAndroid;

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
    public SignInScreen getSignInScreen() {
        return new SignInScreen(driver);
    }

    /**
     * Gets the home screen.
     *
     * @return home screen object
     */
    public HomeScreen getHomeScreen() {
        return new HomeScreen(driver);
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
    public SearchScreen getSearchScreen() {
        return new SearchScreen(driver);
    }

    /**
     * Gets the book details screen.
     *
     * @return book details screen object
     */
    public BookDetailsScreen getBookDetailsScreen() {
        return new BookDetailsScreen(driver);
    }

    /**
     * Gets the library screen.
     *
     * @return library screen object
     */
    public LibraryScreen getLibraryScreen() {
        return new LibraryScreen(driver);
    }
}
