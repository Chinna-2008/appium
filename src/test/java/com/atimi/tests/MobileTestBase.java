package com.atimi.tests;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass;
import com.atimi.tests.ScreenFactory.IScreenFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This is 'MobileTestBase' abstract class.
 */
public abstract class MobileTestBase<AD extends AppiumDriver<? extends MobileElement>> {

    private AD myDriver = null;
    protected final ScreenRegistry screenRegistry = new ScreenRegistry();

    protected abstract AD createDriver();

    /**
     * Gets the driver.
     *
     * @return driver
     */
    public AD getDriver() {
        return myDriver;
    }

    /**
     * Set up the session before class.
     */
    @BeforeClass
    public final void setUpSessionBeforeClass() {
        setUpDriver();
    }

    /**
     * Set up the driver.
     */
    private void setUpDriver() {
        try {
            if (myDriver != null) {
                myDriver.quit();
            } else {
                myDriver = createDriver();
            }
        } catch (final Exception exception) {
            throw exception;
        }
        getScreenRegistry().setScreenFactory(getScreenFactory(myDriver));
    }

    /**
     * Gets screen registry.
     *
     * @return screen registry
     */
    protected ScreenRegistry getScreenRegistry() {
        return screenRegistry;
    }

    public abstract IScreenFactory getScreenFactory(AD myDriver);

    protected static class ScreenRegistry {

        private IScreenFactory screenFactory = null;

        private final Map<Class<?>, Object> screenObjects = new HashMap<>();

        /**
         * Accepts screen class.
         *
         * @param screenClass screen class
         * @return T, the result of the provided screen class type
         */
        @SuppressWarnings("unchecked")
        public <T extends BaseScreen> T get(Class<T> screenClass) {
            if(!screenObjects.containsKey(screenClass)) {
                final List<Method> methods =Arrays.stream(screenFactory.getClass().getMethods()).filter(method -> method.getReturnType() == screenClass).collect(Collectors.toList());
                if(methods.size() == 1) {
                    try {
                        screenObjects.put(screenClass, methods.get(0).invoke(screenFactory));
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        throw new RuntimeException("ScreenRegistry invoke exception", e);
                    }
                } else if(methods.size() == 0){
                    throw new RuntimeException(String.format("No factory methods found for class:%s", screenClass));
                } else{
                    throw new RuntimeException(String.format("Multiple factory methods found for class:%s", screenClass));
                }
            }
            return (T) screenObjects.get(screenClass);
        }

        /**
         * Sets screen factory.
         *
         * @param screenFactory screen factory
         */
        private void setScreenFactory(IScreenFactory screenFactory) {
            this.screenFactory = screenFactory;
            screenObjects.clear();
        }
    }
}