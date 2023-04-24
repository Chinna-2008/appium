package com.atimi.audible.screens.bookdetailsscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'BookDetailsScreenObject' class.
 */
@Data
public class BookDetailsScreenObject {

    private final AppiumDriver driver;

    @AndroidFindBy(id = "com.audible.application:id/glow_top_left")
    private MobileElement leftImage;

    @AndroidFindBy(id = "com.audible.application:id/root_recycler_view")
    private MobileElement bookDetailsScreen;

    @AndroidFindBy(id = "com.audible.application:id/title")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Story of Buddha\"")
    private MobileElement bookTitle;

    @AndroidFindBy(id = "com.audible.application:id/subtitle")
    private MobileElement subTitle;

    @AndroidFindBy(id = "com.audible.application:id/enhanced_author_text")
    private MobileElement author;

    @AndroidFindBy(id = "com.audible.application:id/format_text_view")
    private MobileElement audioBookDuration;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Download\")")
    private MobileElement downloadButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Remove From Device\")")
    private MobileElement removeFromDevice;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Play\")")
    private MobileElement playButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pause\")")
    private MobileElement pauseButton;

    public BookDetailsScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}