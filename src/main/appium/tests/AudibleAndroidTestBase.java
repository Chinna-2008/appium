package src.main.appium.tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This is 'AudibleAndroidTestBase' class.
 */
public class AudibleAndroidTestBase extends AudibleMobileTestBase {

    /**
     * Gets the desired capabilities for android.
     *
     * @return android desired capabilities
     */
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:platformVersion", "11");
        dc.setCapability("appium:deviceName", "Pixel 4a");
        dc.setCapability("appium:app", "/Users/pcreddeppa/Desktop/latest.apk");
        dc.setCapability("appium:appPackage", "com.audible.application");
        dc.setCapability("appium:appActivity", "com.audible.application.SplashScreen");
        return dc;
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
    protected AndroidDriver createDriver() {
        return new AndroidDriver(getEndPoint(), getCapabilities());
    }
}