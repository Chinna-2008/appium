package com.atimi.tests;

import com.atimi.audible.screens.welcomescreen.WelcomeScreenIOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.atimi.tests.ScreenFactory.IOSScreenFactory;
import com.atimi.tests.ScreenFactory.IScreenFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * This is 'IOSTestBase' class.
 */
public class IOSTestBase extends MobileTestBase<IOSDriver<IOSElement>> {

    /**
     * Creates a driver.
     *
     * @return driver
     */
    @Override
    protected IOSDriver<IOSElement> createDriver() {
        return new IOSDriver<>(getEndPoint(), getCapabilities());
    }

    /**
     * Gets the endpoint.
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

    public IScreenFactory getScreenFactory(IOSDriver<IOSElement> driver) {
        return new IOSScreenFactory(driver);
    }

    /**
     * Gets the desired capabilities for IOS.
     *
     * @return IOS desired capabilities
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
     * Gets the welcome screen.
     *
     * @return welcome screen object
     */
    public WelcomeScreenIOS getWelcomeScreen() {
        return getScreenRegistry().get(WelcomeScreenIOS.class);
    }
}