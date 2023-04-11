package com.atimi.audible.screens.widgets;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'LibrarySortObject' class.
 */
@Data
public class LibrarySortObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/header_button")
    private MobileElement sortingHeaderButton;

    @FindBy(className = "android.widget.TextView")
    public List<MobileElement> sortOptions;

    public LibrarySortObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}