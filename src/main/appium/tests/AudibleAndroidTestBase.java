package src.main.appium.tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This is 'AudibleAndroidTestBase' class.
 */
public class AudibleAndroidTestBase extends AudibleMobileTestBase {

    public AndroidDriver driver = null;

    public AndroidDriver androidDriver;

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
    @BeforeClass
    @Override
    public AndroidDriver createDriver() {
        return new AndroidDriver(getEndPoint(), getCapabilities());
    }

    /**
     * Gets the driver.
     *
     * @return driver / null
     */
    @Override
    public AndroidDriver getDriver() {
        try {
            if (driver != null) {
                driver.quit();
            } else {
                return androidDriver = (AndroidDriver) driver;
            }
        } catch (Exception ignored) {
        }
        return null;
    }
}