package tests;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

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

    /**
     * Gets the desired capabilities for IOS.
     *
     * @return IOS desired capabilities
     */
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        return desiredCapabilities;
    }
}