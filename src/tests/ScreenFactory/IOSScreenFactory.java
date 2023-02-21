package tests.ScreenFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSScreenFactory extends IScreenFactory {

    private final IOSDriver<IOSElement> driver;

    public IOSScreenFactory(IOSDriver<IOSElement> driver) {
        this.driver = driver;
    }
}
