package com.atimi.audible.screens.searchscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

/**
 *  This is 'SearchScreenObject' class.
 */
@Data
public class SearchScreenObject {

    private final AppiumDriver driver;

    @AndroidFindBy(id = "com.audible.application:id/search_src_text")
    @iOSXCUITFindBy(accessibility = "Search our catalogue")
    private MobileElement searchBox;

    @AndroidFindBy(id = "com.audible.application:id/title")
    @iOSXCUITFindBy(accessibility = "metadata_titlegroup")
    private MobileElement storyOfBuddha;

    public SearchScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
