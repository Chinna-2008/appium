package common;

import pages.BasePage;
import java.util.HashMap;
import java.util.Map;

/**
 * This is 'PageRegistry' class.
 */
public class PageRegistry {

    private final Map<String, BasePage> pageRegistry;

    public PageRegistry() {
        pageRegistry = new HashMap<>();
    }

    /**
     * Accepts page class.
     *
     * @param pageClass page class
     * @return T, the result of the provided page class type
     */
    @SuppressWarnings("unchecked")
    public <T extends BasePage> T get(Class<T> pageClass) {
        try {
            pageRegistry.putIfAbsent(pageClass.getSimpleName(), pageClass.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException(e.getCause());
        }
        return (T) pageRegistry.get(pageClass.getSimpleName());
    }
}