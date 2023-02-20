package common;

import screens.BaseScreen;
import java.util.HashMap;
import java.util.Map;

/**
 * This is 'ScreenRegistry' class.
 */
public class ScreenRegistry {

    private final Map<String, BaseScreen> screenRegistry;

    public ScreenRegistry() {
        screenRegistry = new HashMap<>();
    }

    /**
     * Accepts screen class.
     *
     * @param screenClass screen class
     * @return T, the result of the provided screen class type
     */
    @SuppressWarnings("unchecked")
    public <T extends BaseScreen> T get(Class<T> screenClass) {
        try {
            screenRegistry.putIfAbsent(screenClass.getSimpleName(), screenClass.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException(e.getCause());
        }
        return (T) screenRegistry.get(screenClass.getSimpleName());
    }
}