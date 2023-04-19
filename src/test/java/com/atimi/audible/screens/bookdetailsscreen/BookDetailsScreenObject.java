package com.atimi.audible.screens.bookdetailsscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'BookDetailsScreenObject' class.
 */
@Data
public class BookDetailsScreenObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/glow_top_left")
    private MobileElement leftImage;

    @FindBy(id = "com.audible.application:id/root_recycler_view")
    private MobileElement bookDetailsScreen;

    @FindBy(id = "com.audible.application:id/title")
    private MobileElement bookTitle;

    @FindBy(id = "com.audible.application:id/subtitle")
    private MobileElement subTitle;

    @FindBy(id = "com.audible.application:id/enhanced_author_text")
    private MobileElement author;

    @FindBy(id = "com.audible.application:id/format_text_view")
    private MobileElement audioBookDuration;

    @AndroidBy(uiAutomator = "new UiSelector().text(\"Download\")")
    private MobileElement downloadButton;

    @AndroidBy(uiAutomator = "new UiSelector().text(\"Remove From Device\")")
    private MobileElement removeFromDevice;

    @AndroidBy(uiAutomator = "new UiSelector().text(\"Play\")")
    private MobileElement playButton;

    @AndroidBy(uiAutomator = "new UiSelector().text(\"Pause\")")
    private MobileElement pauseButton;

    public BookDetailsScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}