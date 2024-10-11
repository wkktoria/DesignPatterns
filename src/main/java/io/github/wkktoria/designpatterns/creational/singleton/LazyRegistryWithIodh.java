package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class.
 * This ensures that there is lazy initialization without worrying about synchronization.
 */
class LazyRegistryWithIodh {
    private LazyRegistryWithIodh() {

    }

    static LazyRegistryWithIodh getInstance() {
        return RegistryHolder.INSTANCE;
    }

    private static class RegistryHolder {
        static final LazyRegistryWithIodh INSTANCE = new LazyRegistryWithIodh();
    }
}
