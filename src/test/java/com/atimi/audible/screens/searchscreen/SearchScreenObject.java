package com.atimi.audible.screens.searchscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  This is 'SearchScreenObject' class.
 */
@Data
public class SearchScreenObject {

    private final AppiumDriver driver;

    public SearchScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/search_src_text")
    private MobileElement searchBox;

    @FindBy(id = "com.audible.application:id/title")
    private MobileElement storyOfBuddha;
}
