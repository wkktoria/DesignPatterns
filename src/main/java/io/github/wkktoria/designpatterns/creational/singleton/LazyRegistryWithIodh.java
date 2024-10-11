package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class.
 * This ensures that there is lazy initialization without worrying about synchronization.
 */
public class LazyRegistryWithIodh {
    private LazyRegistryWithIodh() {

    }

    public static LazyRegistryWithIodh getInstance() {
        return RegistryHolder.INSTANCE;
    }

    private static class RegistryHolder {
        static final LazyRegistryWithIodh INSTANCE = new LazyRegistryWithIodh();
    }
}
