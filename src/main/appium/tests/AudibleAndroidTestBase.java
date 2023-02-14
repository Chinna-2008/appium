package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import screens.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This is 'AudibleAndroidTestBase' class.
 */
public class AudibleAndroidTestBase extends AudibleMobileTestBase<AndroidDriver<AndroidElement>> {

    /**
     * Gets the desired capabilities for android.
     *
     * @return android desired capabilities
     */
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "11");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel 4a");
        desiredCapabilities.setCapability("appium:app", "/Users/pcreddeppa/Desktop/latest.apk");
        desiredCapabilities.setCapability("appium:appPackage", "com.audible.application");
        desiredCapabilities.setCapability("appium:appActivity", "com.audible.application.SplashScreen");
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

    /**
     * Gets the welcome screen.
     *
     * @return welcome screen object
     */
    public AudibleWelcomeScreen getWelcomeScreen() {
        return getScreen(AudibleWelcomeScreen.class);
    }

    /**
     * Gets the sign in screen.
     *
     * @return sign in screen object
     */
    public AudibleSignInScreen getSignInScreen() {
        return getScreen(AudibleSignInScreen.class);
    }

    /**
     * Gets the home screen.
     *
     * @return home screen object
     */
    public AudibleHomeScreen getHomeScreen() {
        return getScreen(AudibleHomeScreen.class);
    }

    /**
     * Gets the profile screen.
     *
     * @return profile screen object
     */
    public AudibleProfileScreen getProfileScreen() {
        return getScreen(AudibleProfileScreen.class);
    }

    /**
     * Gets the search screen.
     *
     * @return search screen object
     */
    public AudibleSearchScreen getSearchScreen() {
        return getScreen(AudibleSearchScreen.class);
    }

    /**
     * Gets the book details screen.
     *
     * @return book details screen object
     */
    public BookDetailsScreen getBookDetailsScreen() {
        return getScreen(BookDetailsScreen.class);
    }

    /**
     * Gets the library screen.
     *
     * @return library screen object
     */
    public LibraryScreen getLibraryScreen() {
        return getScreen(LibraryScreen.class);
    }
}