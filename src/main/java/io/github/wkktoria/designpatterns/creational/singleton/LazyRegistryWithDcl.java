package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * This class demonstrates singleton pattern using double-checked-locking.
 * This is also a lazy initialization singleton.
 */
class LazyRegistryWithDcl {
    private static volatile LazyRegistryWithDcl instance;

    private LazyRegistryWithDcl() {
    }

    static LazyRegistryWithDcl getInstance() {
        if (instance == null) {
            synchronized (LazyRegistryWithDcl.class) {
                if (instance == null) {
                    instance = new LazyRegistryWithDcl();
                }
            }
        }
        return instance;
    }
}
