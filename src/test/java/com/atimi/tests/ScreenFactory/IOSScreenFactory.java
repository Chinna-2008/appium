package com.atimi.tests.ScreenFactory;

import com.atimi.audible.screens.dataandstoragescreen.DataAndStorageScreenIOS;
import com.atimi.audible.screens.homescreen.HomeScreenIOS;
import com.atimi.audible.screens.signinscreen.SignInScreenIOS;
import com.atimi.audible.screens.welcomescreen.WelcomeScreenIOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

/**
 * This is 'IOSScreenFactory' class.
 */
public class IOSScreenFactory extends IScreenFactory {

    private final IOSDriver<IOSElement> driver;

    public IOSScreenFactory(IOSDriver<IOSElement> driver) {
        this.driver = driver;
    }

    /**
     * Gets the welcome screen.
     *
     * @return welcome screen object
     */
    public WelcomeScreenIOS getWelcomeScreen() {
        return new WelcomeScreenIOS(driver);
    }

    /**
     * Gets sign in screen.
     *
     * @return sign in screen object
     */
    public SignInScreenIOS getSignInScreen() {
        return new SignInScreenIOS(driver);
    }

    /**
     * Gets home screen.
     *
     * @return home screen object
     */
    public HomeScreenIOS getHomeScreen() {
        return new HomeScreenIOS(driver);
    }

    /**
     * Gets data and storage screen.
     *
     * @return data and storage screen object
     */
    public DataAndStorageScreenIOS getDataAndStorageScreen() {
        return new DataAndStorageScreenIOS(driver);
    }
}
