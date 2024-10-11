package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class.
 * This ensures that there is lazy initialization without worrying about synchronization.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom">Initialization-on-demand holder</a>
 */
public class LazyRegistryWithIodh {
    /**
     * Private constructor to prevent instantiation outside this class.
     * This also prevents inheritance.
     */
    private LazyRegistryWithIodh() {

    }

    /**
     * This method provides the singleton instance. It uses {@link RegistryHolder}.
     *
     * @return instance of {@link LazyRegistryWithIodh}
     */
    public static LazyRegistryWithIodh getInstance() {
        return RegistryHolder.INSTANCE;
    }

    /**
     * This class provides with the initialization-on-demand holder pattern.
     */
    private static class RegistryHolder {
        static final LazyRegistryWithIodh INSTANCE = new LazyRegistryWithIodh();
    }
}
