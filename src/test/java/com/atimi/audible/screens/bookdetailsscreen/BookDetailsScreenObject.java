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
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]")
    private MobileElement bookDetailsScreen;

    @AndroidFindBy(id = "com.audible.application:id/title")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name =\"metadata_titlegroup\"`][1]")
    private MobileElement bookTitle;

    @AndroidFindBy(id = "com.audible.application:id/subtitle")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name =\"metadata_titlegroup\"`][2]")
    private MobileElement subTitle;

    @AndroidFindBy(id = "com.audible.application:id/enhanced_author_text")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"pdpmetadata_author\"")
    private MobileElement author;

    @AndroidFindBy(id = "com.audible.application:id/format_text_view")
    @iOSXCUITFindBy(accessibility = "pdpmetadata_format_duration")
    private MobileElement audioBookDuration;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Download\")")
    @iOSXCUITFindBy(accessibility = "pdp_download_button")
    private MobileElement downloadButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Remove From Device\")")
    private MobileElement removeFromDevice;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Play\")")
    @iOSXCUITFindBy(accessibility = "pdp_play_pause_button")
    private MobileElement playButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pause\")")
    @iOSXCUITFindBy(accessibility = "pdp_play_pause_button")
    private MobileElement pauseButton;

    @iOSXCUITFindBy(accessibility = "Cancel download")
    private MobileElement cancelDownload;

    public BookDetailsScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
