package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import screens.*;
import screens.welcomescreen.WelcomeScreenAndroid;
import tests.ScreenFactory.AndroidScreenFactory;
import tests.ScreenFactory.IScreenFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * This is 'AndroidTestBase' class.
 */
public class AndroidTestBase extends MobileTestBase<AndroidDriver<AndroidElement>> {

    /**
     * Gets the desired capabilities for android.
     *
     * @return android desired capabilities
     */
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        Properties properties = System.getProperties();
        for (String propertyName: properties.stringPropertyNames()) {
            if(propertyName.startsWith("appium:")) {
                desiredCapabilities.setCapability(propertyName, System.getProperty(propertyName));
            }
        }
        return desiredCapabilities;
    }

    /**
     * Gets endpoint.
     *
     * @return url
     */
    public URL getEndPoint() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a driver.
     *
     * @return driver
     */
    @Override
    protected AndroidDriver<AndroidElement> createDriver() {
        return new AndroidDriver<>(getEndPoint(), getCapabilities());
    }

    public IScreenFactory getScreenFactory(AndroidDriver<AndroidElement> driver) {
        return new AndroidScreenFactory(driver);
    }

    /**
     * Gets the welcome screen.
     *
     * @return welcome screen object
     */
    public WelcomeScreenAndroid getWelcomeScreen() {
        return getScreenRegistry().get(WelcomeScreenAndroid.class);
    }

    /**
     * Gets the sign in screen.
     *
     * @return sign in screen object
     */
    public SignInScreen getSignInScreen() {
        return getScreenRegistry().get(SignInScreen.class);
    }

    /**
     * Gets the home screen.
     *
     * @return home screen object
     */
    public HomeScreen getHomeScreen() {
        return getScreenRegistry().get(HomeScreen.class);
    }

    /**
     * Gets the profile screen.
     *
     * @return profile screen object
     */
    public ProfileScreen getProfileScreen() {
        return getScreenRegistry().get(ProfileScreen.class);
    }

    /**
     * Gets the search screen.
     *
     * @return search screen object
     */
    public SearchScreen getSearchScreen() {
        return getScreenRegistry().get(SearchScreen.class);
    }

    /**
     * Gets the book details screen.
     *
     * @return book details screen object
     */
    public BookDetailsScreen getBookDetailsScreen() {
        return getScreenRegistry().get(BookDetailsScreen.class);
    }

    /**
     * Gets the library screen.
     *
     * @return library screen object
     */
    public LibraryScreen getLibraryScreen() {
        return getScreenRegistry().get(LibraryScreen.class);
    }
}