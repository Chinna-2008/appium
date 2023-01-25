package src.main.appium.tests;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This is 'SampleTest' class.
 */
public class SampleTest {

    private AndroidDriver driver;

    /**
     * Launch the application.
     *
     * @throws MalformedURLException
     */
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "11");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel 4a");
        desiredCapabilities.setCapability("appium:app", "/Users/pcreddeppa/Desktop/latest.apk");
        desiredCapabilities.setCapability("appium:appPackage", "com.audible.application");
        desiredCapabilities.setCapability("appium:appActivity", "com.audible.application.SplashScreen");
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    /**
     * Quits the app.
     */
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}