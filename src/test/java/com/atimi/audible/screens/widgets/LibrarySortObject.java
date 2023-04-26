package com.atimi.audible.screens.widgets;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'LibrarySortObject' class.
 */
@Data
public class LibrarySortObject {

    private final AppiumDriver driver;

    @AndroidFindBy(id = "com.audible.application:id/header_button")
    @iOSXCUITFindBy(accessibility = "Recent")
    private MobileElement sortingHeaderButton;

    @AndroidFindBy(className = "android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeScrollView[`name == \"overflow_scrollview_container\"`]/XCUIElementTypeOther/XCUIElementTypeOther")
    public List<MobileElement> sortOptions;

    public LibrarySortObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
