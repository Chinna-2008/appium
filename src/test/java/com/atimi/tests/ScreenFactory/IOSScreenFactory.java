package com.atimi.tests.ScreenFactory;

import com.atimi.audible.screens.welcomescreen.WelcomeScreenIOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

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
}
